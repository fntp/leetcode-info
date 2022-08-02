package org.leetcode.fntp.vo.monthdetail;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/3 0:05
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class LcUserCalendarDetail implements Serializable {
    private static final long serialVersionUID = -7073138513297813058L;
    private UserCalendar userCalendar;
}
