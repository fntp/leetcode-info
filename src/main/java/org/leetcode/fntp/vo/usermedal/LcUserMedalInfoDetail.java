package org.leetcode.fntp.vo.usermedal;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.io.Serializable;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:07
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class LcUserMedalInfoDetail implements Serializable {
    private static final long serialVersionUID = 9091204518605002817L;
    private List<UserProfileUserMedals> userProfileUserMedals;
    private UserProfileUserNextMedal userProfileUserNextMedal;
}
