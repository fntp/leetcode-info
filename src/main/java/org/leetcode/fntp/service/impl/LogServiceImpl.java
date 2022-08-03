package org.leetcode.fntp.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.leetcode.fntp.common.BaseException;
import org.leetcode.fntp.dto.PageDto;
import org.leetcode.fntp.entity.LogsEntity;
import org.leetcode.fntp.mapper.ILogsMapper;
import org.leetcode.fntp.model.BaseResult;
import org.leetcode.fntp.service.ILogService;
import org.leetcode.fntp.utils.VoUtil;
import org.leetcode.fntp.vo.LogsVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author puye(0303)
 */
@Service
@Slf4j
public class LogServiceImpl implements ILogService {

    @Resource
    private ILogsMapper logsMapper;
    /**
     * 获取列表
     *
     * @param code     代码
     * @param name     名称
     * @param level    级别
     * @param type     类型
     * @param module   服务模块
     * @param action   动作
     * @param pageNum  页码
     * @param pageSize 一页条数
     * @return 列表内容
     * @throws BaseException 异常
     */
    @Override
    public BaseResult<PageDto<LogsVo>> getList(String code, String name, Integer level, Integer type, Integer module, Integer action, Integer pageNum, Integer pageSize) throws BaseException {
        Page<LogsEntity> page = new LambdaQueryChainWrapper<>(logsMapper)
                .like(StringUtils.isNotEmpty(code), LogsEntity::getCode, code)
                .like(StringUtils.isNotEmpty(name), LogsEntity::getName, name)
                .eq(null != level, LogsEntity::getLevel, level)
                .eq(null != type, LogsEntity::getType, type)
                .eq(null != module, LogsEntity::getModule, module)
                .eq(null != action, LogsEntity::getAction, action)
                .page(new Page<>(pageNum, pageSize));
        List<LogsVo> logsVoList = VoUtil.e2vList(page.getRecords(), LogsVo.class, false);
        PageDto<LogsVo> pageDto = new PageDto<>(page.getCurrent(), page.getSize(), page.getTotal(), logsVoList);
        return new BaseResult<>(pageDto);
    }

    /**
     * 添加日志
     *
     * @param creator 日志创建者
     * @param code    代码
     * @param name    名称
     * @param content 内容
     * @param level   级别
     * @param type    类型
     * @param module  服务模块
     * @param action  动作
     * @param ip      ip地址
     */
    @Override
    public void addLog(String creator, String code, String name, String content, Integer level, Integer type, Integer module, Integer action, String ip) {
        LogsEntity logsEntity = LogsEntity.builder()
                .code(code)
                .name(name)
                .content(content)
                .level(level)
                .type(type)
                .module(module)
                .action(action)
                .ip(ip).creator(creator).build();
        int inserted = logsMapper.insert(logsEntity);
        if (1 != inserted) {
            log.error("[{}]插入日志失败...", inserted);
        }
    }
}
