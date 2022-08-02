package org.leetcode.fntp.vo.baseinfo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:36
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class SkillSet implements Serializable {
    private static final long serialVersionUID = -363768324940728739L;
    private List<LangLevels> langLevels;
    private List<Topics> topics;
    private List<TopicAreaScores> topicAreaScores;
}
