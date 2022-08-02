package org.leetcode.fntp.vo.uselanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/3 0:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LcUserLanguageCountDetail implements Serializable {
    private static final long serialVersionUID = 7523311877492541656L;
    private UserLanguageProblemCount userLanguageProblemCount;
}
