package com.muse.build.service.impl;

import com.muse.build.dto.ProductDTO;
import com.muse.build.entity.ProductDescribe;
import com.muse.build.entity.ProductInfo;
import com.muse.build.mapper.ProductMapper;
import com.muse.build.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper productMapper;

    @Override
    @Transactional
    public int add(ProductDTO dto) {
        ProductInfo build = ProductInfo.builder().picture(dto.getPicture()).price(dto.getPrice()).product_name(dto.getProduct_name()).region_code(dto.getRegion_code()).spec(dto.getSpec()).store_info_id(dto.getStore_info_id()).build();
        int i = productMapper.insertInfo(build);
        ProductDescribe build1 = ProductDescribe.builder().describe(dto.getDescribe()).product_info_id(build.getProduct_info_id()).store_info_id(build.getStore_info_id()).build();
        i += productMapper.insertDescribe(build1);
        return i;
    }
}
