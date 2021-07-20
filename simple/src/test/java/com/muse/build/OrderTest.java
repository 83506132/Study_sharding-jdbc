package com.muse.build;

import com.muse.build.dao.OrderDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest(classes = AppConfig.class)
public class OrderTest {
    @Resource
    OrderDAO orderDAO;

    @Test
    @DisplayName("批量化添加")
    @RepeatedTest(100000)
    public void insert(){
        orderDAO.insertOrder(new BigDecimal(100), 1L, "Succeed");
    }


    @Test
    @DisplayName("查询数据")
    public void selectId(){
        System.out.println(orderDAO.selectIds(623920641522794496L, 623920641820590081L, 623920640943980544l).size());
    }
}
