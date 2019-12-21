package com.huaxu.core.middleware.spring.transactional.service;

import com.huaxu.core.junit.BaseTest;
import com.huaxu.core.middleware.spring.transactional.bean.PayAccount;
import com.huaxu.core.middleware.spring.transactional.bean.User;
import com.huaxu.core.middleware.spring.transactional.mapper.db1.PayAccountMapper;
import com.huaxu.core.middleware.spring.transactional.mapper.db2.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: AccountService</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/09/27 13:53</p>
 * <p>创建用户：huaxu</p>
 */
//@Ignore
@Slf4j
@Service
public class AccountService extends BaseTest {

    @Autowired
    private PayAccountMapper accountMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void query(){
        PayAccount payAccount = accountMapper.selectByPrimaryKey(1);
        log.info("查询数据库信息db1:{}", payAccount);

        User user = userMapper.selectByPrimaryKey("201801");
        log.info("查询数据库信息db2:{}", user);
    }

//    @Test
//    @Transactional
//    public void insertTranAuto(){
//        PayAccount account = new PayAccount();
//        account.setId(9);
//        account.setBusinessId("A005");
//        account.setType(Short.parseShort("1"));
//        accountMapper.insert(account);
//
//        User user = new User();
//        user.setId("1001");
//        user.setPassword("123456");
//        user.setRole(1);
//        userMapper.insert(user);
//
//        throw new RuntimeException("rollback");
//    }

    @Test
    @Transactional
    public void insertTranTry(){
        PayAccount account = new PayAccount();
        account.setId(88);
        account.setBusinessId("A005");
        account.setType(Short.parseShort("1"));
        accountMapper.insert(account);

        try {
            System.out.println(1/0); // 抛出异常自动回滚

            account.setId(89);
            account.setBusinessId("A006");
            accountMapper.insert(account);
        }
        catch (Exception e) {
            // 手动事务回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        account.setId(90);
        account.setBusinessId("A006");
        accountMapper.insert(account);
    }
}