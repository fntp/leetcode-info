package org.leetcode.fntp.vo.recentlyresolve;

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
 * @date 2022/8/3 0:02
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LcUserRecentlyResolveDetail implements Serializable {
    private static final long serialVersionUID = 2975852512344211564L;
    private SolutionArticles solutionArticles;
}
