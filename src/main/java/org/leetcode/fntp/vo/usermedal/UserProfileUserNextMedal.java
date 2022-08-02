package org.leetcode.fntp.vo.usermedal;

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
 * @date 2022/8/2 23:02
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileUserNextMedal implements Serializable {
    private static final long serialVersionUID = -3892631896629511215L;
    private String name;
    private String obtainDate;
    private String category;
    private Config config;
    private int progress;
    private int id;
    private int year;
    private int month;
}
