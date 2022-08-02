package org.leetcode.fntp.vo.baseinfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:36
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TopicAreaScores implements Serializable {

    private static final long serialVersionUID = -6887316043255335737L;

    private int score;

    private TopicArea topicArea;

}
