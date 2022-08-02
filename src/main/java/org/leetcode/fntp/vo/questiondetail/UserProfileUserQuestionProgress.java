package org.leetcode.fntp.vo.questiondetail;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:49
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class UserProfileUserQuestionProgress implements Serializable {
    private static final long serialVersionUID = 7086587151471277470L;
    private List<NumAcceptedQuestions> numAcceptedQuestions;
    private List<NumFailedQuestions> numFailedQuestions;
    private List<NumUntouchedQuestions> numUntouchedQuestions;
}
