package com.slc.blog;

import com.slc.blog.entity.User;
import com.slc.blog.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

    @Autowired
    private UserMapper user;

    @Test
    public void test(){
        User user = this.user.selectUserById(1);
        System.out.println(user);
    }

}
