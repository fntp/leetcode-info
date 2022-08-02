package org.leetcode.fntp.vo.questiondetail;

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
 * @date 2022/8/3 0:22
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LcUserQuestionDetail implements Serializable {
    private static final long serialVersionUID = 5188934654743953158L;
    private UserProfileUserQuestionProgress  userProfileUserQuestionProgress;
}
