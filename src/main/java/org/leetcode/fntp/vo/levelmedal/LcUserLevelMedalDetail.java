package org.leetcode.fntp.vo.levelmedal;

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
 * @date 2022/8/3 0:25
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LcUserLevelMedalDetail implements Serializable {
    private static final long serialVersionUID = 5628446642483027020L;
    private UserProfileUserLevelMedal userProfileUserLevelMedal;
}
