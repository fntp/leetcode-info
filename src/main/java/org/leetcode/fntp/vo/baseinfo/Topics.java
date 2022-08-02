package org.leetcode.fntp.vo.baseinfo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:34
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Topics implements Serializable {

    private static final long serialVersionUID = 5634334966823190037L;

    private String slug;

    private String name;

    private String translatedName;

}
