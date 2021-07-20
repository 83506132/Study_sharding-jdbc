package com.muse.build.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface DictDAO {
    @Insert("insert into t_dict(dict_type,dict_code) values(#{dict_type},#{dict_code})")
    int insertOrder(@Param("dict_type")String dict_type,@Param("dict_code")int dict_code);

    @Select("select * from t_dict where dict_id in(#{id},#{id1},#{id2})")
    List<Map> selectIds(@Param("id") long id,@Param("id1")long id1,@Param("id2")long id2);
}
