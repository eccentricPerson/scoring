package com.alearner.model.mysql;

import com.alearner.model.common.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by mzg on 2018/5/14.
 */
@Getter
@Setter
@ToString
public class User extends BaseModel {
    private int id;
    private String name;
    private String sex;
    private String phone;
    private String email;
}
