package com.muse.build;

import com.muse.build.dao.OrderDAO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
public class OrderTest {
    @Resource
    OrderDAO dao;

    @Test
    void insert(){
        dao.insertOrder(new BigDecimal(10), 1L, "Succeed");
        dao.insertOrder(new BigDecimal(10), 1L, "Succeed");
        dao.insertOrder(new BigDecimal(10), 2L, "Succeed");
        dao.insertOrder(new BigDecimal(10), 2L, "Succeed");
    }
}
