package com.alearner.mappers;

import com.alearner.model.mysql.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by mzg on 2018/5/14.
 */
@Component
public interface UserMapper {
    long addUser(User user);
    User getUserById(@Param("id") int id);
    long updateUserById(User user);
}
