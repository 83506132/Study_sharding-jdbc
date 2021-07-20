package com.muse.build.mapper;

import com.muse.build.entity.ProductDescribe;
import com.muse.build.entity.ProductInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
public interface ProductMapper {
    @Insert("insert into product_info(store_info_id,product_name,spec,region_code,price,picture) values(#{store_info_id},#{product_name},#{spec},#{region_code},#{price},#{picture})")
    @Options(keyColumn = "product_info_id", keyProperty = "product_info_id", useGeneratedKeys = true)
    int insertInfo(ProductInfo productInfo);

    @Insert("insert into product_describe(product_info_id,`describe`,store_info_id) values(#{product_info_id},#{describe},#{store_info_id})")
    @Options(keyColumn = "id", keyProperty = "id", useGeneratedKeys = true)
    int insertDescribe(ProductDescribe productDescribe);
}
