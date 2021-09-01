package plus.knowing;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import plus.knowing.dao.SysUserDAO;
import plus.knowing.entity.SysUser;
import plus.knowing.entity.SysUserLogin;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Entry {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
        SysUserDAO sysUserDAO = sqlSession.getMapper(SysUserDAO.class);
        SysUser sysUser = new SysUser();
        sysUser.setMobile("133");
        sysUser.setEmail("@");
        List<SysUserLogin> sysUsers = sysUserDAO.listUser(1L, "");
        System.out.println(sysUsers);
    }
}
