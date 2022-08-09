package org.leetcode.fntp.vo.beatdetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/3 0:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class LcUserBeatDetail implements Serializable {
    private static final long serialVersionUID = -2871144451285792008L;
    private List<ProblemsSolvedBeatsStats> problemsSolvedBeatsStats;
}
