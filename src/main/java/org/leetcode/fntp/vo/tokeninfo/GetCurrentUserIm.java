package org.leetcode.fntp.vo.tokeninfo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:58
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class GetCurrentUserIm implements Serializable {
    private static final long serialVersionUID = 2945869727748537627L;
    private String accId;
    private String token;
    private int unread;
}
