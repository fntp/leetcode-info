package org.leetcode.fntp.vo.monthdetail;

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
 * @date 2022/8/2 23:32
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserCalendar implements Serializable {
    private static final long serialVersionUID = 1543792019235462582L;
    private int streak;
    private int totalActiveDays;
    private String submissionCalendar;
}
