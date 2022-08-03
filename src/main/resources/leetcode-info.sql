-- 日志表
create table leetcode_info_logs
(
    id          bigint auto_increment comment '主键'
        primary key,
    create_time datetime      not null comment '创建时间',
    creator     varchar(255)  not null comment '创建者',
    update_time datetime      null comment '更新时间',
    modifier    varchar(255)  null comment '更新者',
    is_enable   int           not null comment '是否可用',
    code        varchar(255)  not null comment '标识码',
    name        varchar(255)  null comment '名称',
    content     varchar(2000) null comment '操作内容',
    level       int           not null comment '操作等级',
    type        int           not null comment '操作类型',
    module      int           not null comment '操作模块',
    action      int           not null comment '操作动作',
    ip          varchar(50)   null comment '操作IP记录'
)
    comment '日志表';