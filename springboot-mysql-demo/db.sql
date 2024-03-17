create table t_user (
                        id bigint unsigned not null auto_increment comment '主键',
                        name varchar(20) not null comment '姓名',
                        age int not null comment '年龄',
                        gender tinyint not null comment '性别 0：男 1：女',
                        mobile_phone varchar(20) not null comment '手机号',
                        create_time timestamp default current_timestamp,
                        update_time timestamp default current_timestamp on update current_timestamp,
                        primary key (id),
                        key idx_mobile_phone(mobile_phone)
) engine = innodb default charset = utf8mb4 comment '用户表';
