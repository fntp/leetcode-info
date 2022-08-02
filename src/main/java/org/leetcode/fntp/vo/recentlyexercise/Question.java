package org.leetcode.fntp.vo.recentlyexercise;

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
 * @date 2022/8/1 23:13
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Question implements Serializable {
    private static final long serialVersionUID = 4765681626930651109L;
    /**
     * 翻译后的中文标题
     * 来自leetcode
     */
    private String translatedTitle;
    /**
     * 标题标记
     * 来自leetcode
     */
    private String titleSlug;
    /**
     * 边界问题id
     * 来自leetcode
     */
    private String questionFrontendId;
}
