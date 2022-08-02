package org.leetcode.fntp.vo.willachieve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:38
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserProfileUserMedals implements Serializable {
    private static final long serialVersionUID = -214548941993387026L;
    private String name;
    private Date obtainDate;
    private String category;
    private Config config;
    private int progress;
    private int id;
    private int year;
    private int month;
}
