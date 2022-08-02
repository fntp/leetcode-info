package org.leetcode.fntp.vo.levelmedal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileUserLevelMedal implements Serializable {
    private static final long serialVersionUID = 8229843857864827507L;
    private String current;
    private Next next;
}
