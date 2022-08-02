package org.leetcode.fntp.vo.questiondetail;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:48
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class NumFailedQuestions implements Serializable {
    private static final long serialVersionUID = 1771362983133723518L;
    private String difficulty;
    private int count;
}
