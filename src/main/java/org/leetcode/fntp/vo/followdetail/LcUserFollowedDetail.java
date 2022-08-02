package org.leetcode.fntp.vo.followdetail;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:55
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class LcUserFollowedDetail implements Serializable {
    private static final long serialVersionUID = -7774622527525314951L;
    private Followers followers;
}
