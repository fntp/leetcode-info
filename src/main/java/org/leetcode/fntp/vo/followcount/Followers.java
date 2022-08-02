package org.leetcode.fntp.vo.followcount;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:44
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Followers implements Serializable {
    private static final long serialVersionUID = -7185446472571557316L;
    private int allNum;
}
