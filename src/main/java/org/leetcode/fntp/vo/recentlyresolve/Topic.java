package org.leetcode.fntp.vo.recentlyresolve;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:15
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Topic implements Serializable {
    private static final long serialVersionUID = 1121707948085759710L;
    private int viewCount;
}
