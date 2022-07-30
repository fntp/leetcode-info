package org.leetcode.fntp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fntp
 * @description TODO
 * @date 2022/7/30 23:41
 */
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = -6822097880324688074L;
    /**
     * mybatis-plus逻辑字段
     */
    private Integer isEnable;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}