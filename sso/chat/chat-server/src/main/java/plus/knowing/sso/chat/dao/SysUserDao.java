package plus.knowing.sso.chat.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import plus.knowing.sso.chat.entity.SysUser;

@Mapper
@Repository
public interface SysUserDao {

    @Select("select * from sys_user where cas_id = #{casId}")
    SysUser getUserByCasId(Long casId);
}
