package org.leetcode.fntp.vo.followcount;

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
 * @date 2022/8/2 23:45
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LcUserFollowDetail implements Serializable {
    private static final long serialVersionUID = 7329560081659240898L;
    private Followers followers;
    private FollowingEntities followingEntities;
}
