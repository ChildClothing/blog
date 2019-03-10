package com.slc.blog.mapper;

import com.slc.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {

    public User selectUserById(int id);

}
