package com.yakamy.mybatis.dao.mapper;

import com.yakamy.mybatis.dao.model.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author yakamy
 * @create 2017-03-30 12:45
 */
public interface UserMapper {
    @Select("select * from user where dealer_id =#{id}")
    User selectId(long id);
}
