package org.leetcode.fntp.vo.baseinfo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/3 0:18
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class LcUserBaseInfoDetail implements Serializable {
    private static final long serialVersionUID = 1277024846069476617L;
    private UserProfilePublicProfile userProfilePublicProfile;
}
