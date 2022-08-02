package org.leetcode.fntp.vo.followcount;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:44
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class FollowingEntities implements Serializable {
    private static final long serialVersionUID = 5312257698099989429L;
    private int allNum;
}
