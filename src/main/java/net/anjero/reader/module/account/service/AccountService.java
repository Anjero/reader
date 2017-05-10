package net.anjero.reader.module.account.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import net.anjero.reader.module.account.pojo.Account;
import net.anjero.reader.module.account.mapper.AccountMapper;

@Service
public class AccountService{

    @Resource
    private AccountMapper accountMapper;

    public int insert(Account pojo){
        return accountMapper.insert(pojo);
    }

    public int insertSelective(Account pojo){
        return accountMapper.insertSelective(pojo);
    }

    public int insertList(List<Account> pojos){
        return accountMapper.insertList(pojos);
    }

    public int update(Account pojo){
        return accountMapper.update(pojo);
    }
}
