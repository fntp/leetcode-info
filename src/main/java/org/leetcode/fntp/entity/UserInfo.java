package org.leetcode.fntp.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("user_info")
public class UserInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 487341596921466373L;
    /**
     * 用户信息的内部id
     */
    @TableId
    private Long id;
    /**
     * 用户id，系统自动生成的
     */
    @TableField("uid")
    private String uid;
    /**
     * 用户名字
     */
    @TableField("userName")
    private String userName;
    /**
     * 用户个人页面url
     */
    @TableField("personUrl")
    private String personUrl;
    /**
     * 用户邮箱
     */
    @TableField("email")
    private String email;

}

