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
 * @date 2022/8/1 23:47
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class NumAcceptedQuestions implements Serializable {
    private static final long serialVersionUID = -8119599256121301086L;
    private String difficulty;
    private int count;
}
