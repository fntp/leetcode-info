package org.leetcode.fntp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;

/**
 * (UserInfo)实体类
 *
 * @author makejava
 * @since 2022-07-30 23:32:39
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class UserInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 487341596921466373L;
    /**
     * 用户信息的内部id
     */
    private Long id;
    /**
     * 用户id，系统自动生成的
     */
    private String uid;
    /**
     * 用户名字
     */
    private String userName;
    /**
     * 用户个人页面url
     */
    private String personUrl;
    /**
     * 用户邮箱
     */
    private String email;

}

