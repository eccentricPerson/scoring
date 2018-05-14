DROP DATABASE IF EXISTS datastone;
CREATE DATABASE datastone;
USE datastone;

DROP TABLE IF EXISTS user;
create table user(
  id int(11)  AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  name varchar(30) NOT NULL COMMENT '姓名',
  sex varchar(5) NOT NULL COMMENT '性别',
  phone varchar(20) NOT NULL COMMENT '电话',
  email varchar(30) NOT NULL COMMENT '邮箱',
  able_status boolean NOT NULL DEFAULT '1' COMMENT '0:失效  1：有效',
  description VARCHAR(100) COMMENT '描述',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
);

INSERT user(name, sex, phone, email)VALUES ('小明','男','17865160000','xiaoming@163.com');
INSERT user(name, sex, phone, email)VALUES ('小红','女','17865160001','xiaohong@163.com');

DROP TABLE IF EXISTS student;
CREATE TABLE student(
  id int(11) primary key auto_increment,
  name varchar(30),
  sex varchar(10),
  class varchar(10),
  phone varchar(30)
);

INSERT into student(name,sex,class,phone)values('Tom','boy','1','17865169606');

INSERT into student(name,sex,class,phone)values('Elina','girl','2','17862857678');