package org.leetcode.fntp.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author fntp
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LogsVo extends BaseVO {
    /**
     * 主键
     */
    private Long id;
    /**
     * 标识码
     */
    private String code;
    /**
     * 操作名称
     */
    private String name;
    /**
     * 操作内容
     */
    private String content;
    /**
     * 操作等级
     */
    private Integer level;
    /**
     * 操作类型
     */
    private Integer type;
    /**
     * 操作模块
     */
    private Integer module;
    /**
     * 操作动作
     */
    private Integer action;
    /**
     * 操作IP记录
     */
    private String ip;
    /**
     * 创建者
     */
    private String creator;
}
