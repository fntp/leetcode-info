package org.leetcode.fntp.vo.recentlyexercise;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/3 0:16
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class LcUserRecentlyExerciseDetail implements Serializable {
    private static final long serialVersionUID = 21525617592568244L;
    private List<RecentAcSubmissions> recentACSubmissions;
}
