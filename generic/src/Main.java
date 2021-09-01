import com.sun.beans.TypeResolver;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args) throws Exception {
        testA();
        testA2();
        testB();
        testC();
        testD();
    }

    private static void testA() {
        System.out.println("A========================");
        TestA testA = new TestA();
        ParameterizedType parameterizedType = (ParameterizedType) testA.getClass().getGenericSuperclass();
        Type type = parameterizedType.getActualTypeArguments()[0];
        System.out.println(type);
    }

    private static void testA2() {
        System.out.println("A2========================");
        TestA2 testA2 = new TestA2();
        ParameterizedType parameterizedType = (ParameterizedType) testA2.getClass().getGenericSuperclass();
        for (Type type : parameterizedType.getActualTypeArguments()) {
            Class<?> aClass = (Class<?>) type;
            System.out.println(aClass);
        }
    }

    private static void testB() {
        System.out.println("B========================");
        TestB<String> testB = new TestB<>();
        System.out.println(testB.getClass().getGenericSuperclass());
        for (Type anInterface : testB.getClass().getGenericInterfaces()) {
            ParameterizedType parameterizedType = (ParameterizedType) anInterface;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }

        System.out.println(testB.getClass().getSuperclass().getGenericSuperclass());
    }

    private static void testC() {
        System.out.println("C========================");
        TestC testC = new TestC();
        for (Type anInterface : testC.getClass().getGenericInterfaces()) {
            ParameterizedType parameterizedType = (ParameterizedType) anInterface;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
    }

    private static void testD() throws Exception {
        System.out.println("D========================");
        TestD<String> testD = new TestD<>();
        Field filed = testD.getClass().getDeclaredField("field");
        Type genericType = filed.getGenericType();
        System.out.println(genericType);
    }
}
