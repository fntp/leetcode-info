package org.leetcode.fntp.vo.recentlyresolve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:17
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Node implements Serializable {
    private static final long serialVersionUID = 3405587311572246950L;
    private String title;
    private String slug;
    private Date createdAt;
    private Question question;
    private int upvoteCount;
    private Topic topic;
}
