package org.leetcode.fntp.dto.uselanguage;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:43
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class UserLanguageProblemCount implements Serializable {
    private static final long serialVersionUID = 637746094249097695L;
    private String languageName;
    private int problemsSolved;
}