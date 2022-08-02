package org.leetcode.fntp.dto.levelmedal;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Config implements Serializable {
    private static final long serialVersionUID = -2850382058257652840L;
    private String icon;
    private String iconGif;
    private String iconGifBackground;
}
