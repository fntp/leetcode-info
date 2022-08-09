package org.leetcode.fntp.vo.levelmedal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Next implements Serializable {
    private static final long serialVersionUID = -8216101609354775751L;
    private String name;
    private String obtainDate;
    private String category;
    private Config config;
    private Integer id;
    private String year;
    private String month;
    private String hoverText;
    private boolean everOwned;
}
