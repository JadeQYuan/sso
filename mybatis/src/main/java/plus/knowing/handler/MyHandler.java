package plus.knowing.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import plus.knowing.entity.SysUser;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyHandler implements TypeHandler<SysUser> {

    @Override
    public void setParameter(PreparedStatement ps, int i, SysUser parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public SysUser getResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public SysUser getResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public SysUser getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
