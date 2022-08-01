package org.leetcode.fntp.dto.baseinfo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:32
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class SocialAccounts implements Serializable {

    private static final long serialVersionUID = 247908198479111721L;
    /**
     * 信息提供者
     */
    private String provider;
    /**
     * 信息提供者url
     */
    private String profileUrl;
}
