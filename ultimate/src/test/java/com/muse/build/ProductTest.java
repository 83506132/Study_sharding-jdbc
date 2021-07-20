package com.muse.build;

import com.muse.build.dto.ProductDTO;
import com.muse.build.mapper.ProductMapper;
import com.muse.build.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
public class ProductTest {
    @Resource
    ProductService productService;
    @Test
    void ServiceAdd(){
        productService.add(ProductDTO.builder().describe("特别好吃").store_info_id(1).spec("全书").price(new BigDecimal(89.9)).region_code("110100").picture("/java.png").product_name("java结构与算法").build());
    }
}
