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
 * @date 2022/8/2 23:13
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo implements Serializable {
    private static final long serialVersionUID = 3357101110069053011L;
    private boolean hasNextPage;
}
