package org.leetcode.fntp.vo.baseinfo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:35
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class TopicArea implements Serializable {
    private static final long serialVersionUID = 5011653797172613235L;
    private String name;
    private String slug;
}
