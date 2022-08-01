package org.leetcode.fntp.dto.baseinfo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:33
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class LangLevels implements Serializable {
    private static final long serialVersionUID = -2328070915914610955L;
    private String langName;
    private String langVerboseName;
    private int level;
}
