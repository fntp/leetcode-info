package org.leetcode.fntp.vo.tokeninfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/3 0:00
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LcUserTokenDetail implements Serializable {
    private static final long serialVersionUID = 2365299660819980301L;
    private GetCurrentUserIm getCurrentUserIM;
}
