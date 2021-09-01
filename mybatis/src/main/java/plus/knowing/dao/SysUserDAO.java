package plus.knowing.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import plus.knowing.entity.SysUser;
import plus.knowing.entity.SysUserExample;
import plus.knowing.entity.SysUserLogin;

import java.util.List;

/**
 * SysUserDAO继承基类
 */
@Mapper
public interface SysUserDAO extends MyBatisBaseDao<SysUser, Long, SysUserExample> {


    @ResultMap(value = "plus.knowing.dao.SysUserDAO.BaseResultMap")
    @Select("" +
            "select id,name, mobile, email from sys_user " +
            "where 1 = 1 " +
            "and id = #{id} " +
            "and name = #{name} " +
//            "and mobile = #{param3.mobile}" +
//            "and email = #{user.email}" +
            "")
    List<SysUserLogin> listUser(Long id, String name);
}
