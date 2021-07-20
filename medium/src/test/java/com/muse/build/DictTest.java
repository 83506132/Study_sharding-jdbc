package com.muse.build;

import com.muse.build.dao.DictDAO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class DictTest {
    @Resource
    DictDAO dao;

    @Test
    void insert() {
        dao.insertOrder("系统管理员", 1);
    }
}
