package org.leetcode.fntp.vo.levelmedal;

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
public class UserProfileUserLevelMedal implements Serializable {
    private static final long serialVersionUID = 8229843857864827507L;
    private String current;
    private Next next;
}
