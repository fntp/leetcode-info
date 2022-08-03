package org.leetcode.fntp.service;

import org.leetcode.fntp.common.BaseException;
import org.leetcode.fntp.model.BaseResult;

/**
 * @Author SunChengXin_0303
 * @ClassName ILogService.Class
 * @PackageName org.leetcode.fntp.service
 * @jdk_version 1.8
 * @Date 2022年08月03日 13:15
 * @since 1.5
 */
public interface ILogService {

    /**
     * 获取列表
     *
     * @param code 代码
     * @param name 名称
     * @param level 级别
     * @param type 类型
     * @param module 服务模块
     * @param action 动作
     * @param pageNum 页码
     * @param pageSize 一页条数
     * @return 列表内容
     * @throws BaseException 异常
     */
    BaseResult getList(String code,
                       String name,
                       Integer level,
                       Integer type,
                       Integer module,
                       Integer action,
                       Integer pageNum,
                       Integer pageSize) throws BaseException;
    /**
     * 添加日志
     *
     * @param creator 日志创建者
     * @param code 代码
     * @param name 名称
     * @param content 内容
     * @param level 级别
     * @param type 类型
     * @param module 服务模块
     * @param action 动作
     * @param ip ip地址
     */
    void addLog(String creator, String code, String name, String content, Integer level, Integer type, Integer module, Integer action, String ip);
}
