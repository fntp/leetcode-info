package org.leetcode.fntp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;

/**
 * (UserAndGroup)实体类
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
public class UserAndGroup extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 364745987610039865L;
    /**
     * 关系id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 组id
     */
    private Long groupId;
    /**
     * 队长标记
     */
    private Integer isLeader;

}

