package org.leetcode.fntp.vo.recentlyresolve;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:18
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Edges implements Serializable {
    private static final long serialVersionUID = 8256328815909797777L;
    private Node node;
}
