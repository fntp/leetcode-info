package org.leetcode.fntp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;

/**
 * group(Group)实体类
 *
 * @author makejava
 * @since 2022-07-31 11:32:56
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode (callSuper = true)
public class Group extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -92701249428640238L;

    private Long id;
    /**
     * 组名称
     */
    private String title;
    /**
     * 组类型：
     * （1）刷题组
     * （2）面试组
     */
    private Integer type;
    /**
     * 创建者
     */
    private Long creator;
    /**
     * 组介绍，支持markdown
     */
    private String description;

}

