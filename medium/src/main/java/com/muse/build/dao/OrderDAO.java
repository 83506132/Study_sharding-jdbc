package com.muse.build.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface OrderDAO {
    @Insert("insert into t_order(price,user_id,status) values(#{price},#{userId},#{status})")
    int insertOrder(@Param("price")BigDecimal price,@Param("userId")Long user_id,@Param("status")String status);

    @Select("select * from t_order where order_id in(#{id},#{id1},#{id2})")
    List<Map> selectIds(@Param("id") long id,@Param("id1")long id1,@Param("id2")long id2);
    @Select("select * from t_order where user_id = #{user_id}")
    List<Map> select(@Param("user_id") long id);
}
