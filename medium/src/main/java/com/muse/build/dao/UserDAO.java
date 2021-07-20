package com.muse.build.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface UserDAO {
    @Insert("insert into t_user(fullname,user_type) values(#{fullname},#{user_type})")
    int insertOrder(@Param("fullname")String fullname,@Param("user_type")char user_type);

    @Select("select * from t_user where user_id in(#{id},#{id1},#{id2})")
    List<Map> selectIds(@Param("id") long id,@Param("id1")long id1,@Param("id2")long id2);
}
