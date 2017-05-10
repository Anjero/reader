package net.anjero.reader.module.account.mapper;

import net.anjero.reader.module.account.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccountMapper {
    int insert(@Param("pojo") Account pojo);

    int insertSelective(@Param("pojo") Account pojo);

    int insertList(@Param("pojos") List<Account> pojo);

    int update(@Param("pojo") Account pojo);

    List<Account> findByUsernameAndPassword(@Param("username")String username,@Param("password")String password);


}
