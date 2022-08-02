package org.leetcode.fntp.vo.recentlyresolve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:18
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SolutionArticles implements Serializable {
    private static final long serialVersionUID = 2070068434470340431L;
    private PageInfo pageInfo;
    private List<Edges> edges;
}
