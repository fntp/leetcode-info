package org.leetcode.fntp.vo.usermedal;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:06
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class UserProfileUserMedals implements Serializable {
    private static final long serialVersionUID = -3265266951569591982L;
    private String name;
    private Date obtainDate;
    private String category;
    private Config config;
    private int progress;
    private int id;
    private int year;
    private int month;
}
