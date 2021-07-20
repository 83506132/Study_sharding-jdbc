package com.muse.build;

import com.muse.build.dao.OrderDAO;
import com.muse.build.dao.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
public class UserTest {
    @Resource
    UserDAO dao;

    @Test
    void insert(){
        dao.insertOrder("赵浩宇", '男');
        dao.insertOrder("赵Muse", '男');
    }

    @Test
    void select(){
        System.out.println(dao.selectIds(624264843653808129L, 624264843439898624L, 3).size());
    }
}
