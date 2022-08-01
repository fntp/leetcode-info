package org.leetcode.fntp.dto.baseinfo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/1 23:38
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class UserProfilePublicProfile implements Serializable {
    private static final long serialVersionUID = 4360602877869267978L;
    private String haveFollowed;
    private long siteRanking;
    private Profile profile;
    private List<String> educationRecordList;
    private List<String> occupationRecordList;
}
