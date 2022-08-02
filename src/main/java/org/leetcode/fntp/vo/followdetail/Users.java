package org.leetcode.fntp.vo.followdetail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:53
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {
    private static final long serialVersionUID = -5531206272869045303L;
    private String realName;
    private String userAvatar;
    private String userSlug;
    private String aboutMe;
    private boolean isMutualFollowing;
    private boolean isFollowingMe;
    private boolean isFollowedByMe;
}
