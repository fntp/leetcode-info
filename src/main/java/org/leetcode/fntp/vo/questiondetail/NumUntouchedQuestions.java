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
 * @date 2022/8/1 23:49
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class NumUntouchedQuestions implements Serializable {
    private static final long serialVersionUID = 3857586421657608058L;
    private String difficulty;
    private int count;

}
