package org.leetcode.fntp.vo.baseinfo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:30
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class GlobalLocation implements Serializable {

    private static final long serialVersionUID = 1019530910101362286L;
    /**
     * 所属国家
     */
    private String country;
    /**
     * 所属省份
     */
    private String province;
    /**
     * 所属城市
     */
    private String city;

}
