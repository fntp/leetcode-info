package org.leetcode.fntp.vo.willachieve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:39
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileUserNextMedal implements Serializable {
    private static final long serialVersionUID = 1630317474277153276L;
    private String name;
    private String obtainDate;
    private String category;
    private Config config;
    private int progress;
    private int id;
    private int year;
    private int month;
}
