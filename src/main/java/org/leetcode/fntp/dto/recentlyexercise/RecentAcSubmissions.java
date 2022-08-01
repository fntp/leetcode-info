package org.leetcode.fntp.dto.recentlyexercise;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description 用户最近刷题DTO
 * @date 2022/8/1 23:17
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class RecentAcSubmissions implements Serializable {
    private static final long serialVersionUID = 464420787937166659L;
    /**
     * 提交id
     */
    private Long submissionId;
    /**
     * 提交时间
     */
    private Long submitTime;
    /**
     * 问题对象
     */
    private Question question;
}
