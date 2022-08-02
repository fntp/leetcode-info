package org.leetcode.fntp.vo.willachieve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:40
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LcUserWillAchieveGoalDetail implements Serializable {
    private static final long serialVersionUID = -5916547357180411761L;
    private List<UserProfileUserMedals> userProfileUserMedals;
    private UserProfileUserNextMedal userProfileUserNextMedal;
}
