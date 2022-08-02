package org.leetcode.fntp.vo.willachieve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:37
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Config implements Serializable {
    private static final long serialVersionUID = -8288243088362483549L;
    private String icon;
    private String iconGif;
    private String iconGifBackground;
}
