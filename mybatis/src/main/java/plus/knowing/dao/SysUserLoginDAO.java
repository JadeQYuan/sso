package plus.knowing.dao;

import org.apache.ibatis.annotations.Mapper;
import plus.knowing.entity.SysUserLogin;
import plus.knowing.entity.SysUserLoginExample;

/**
 * SysUserLoginDAO继承基类
 */
@Mapper
public interface SysUserLoginDAO extends MyBatisBaseDao<SysUserLogin, Long, SysUserLoginExample> {
}
