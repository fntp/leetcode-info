package org.leetcode.fntp.vo.beatdetail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * -------------------------------------------------------------------------------
 * Copyright © 2022 Beijing YuXiang Software Technology Co., Ltd. All rights reserved.
 * -------------------------------------------------------------------------------
 * Module Name: leetcode-info >>> ProblemsSolvedBeatsStats
 * Product:a
 * Creator: puye(0303)
 * Date Created: 2022/8/2
 * Description:a
 * -------------------------------------------------------------------------------
 * Modification History
 * DATE                       Name                  Description
 * -------------------------------------------------------------------------------
 * 2022/8/2                 puye(0303)                 Create
 * -------------------------------------------------------------------------------
 *
 * @author <a href="mailto:suncx@flamelephant.com">puye(0303)</a>
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProblemsSolvedBeatsStats implements Serializable {
    private static final long serialVersionUID = -7798163389244989527L;
    private String difficulty;
    private double percentage;
}
