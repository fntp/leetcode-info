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
 * @date 2022/8/1 23:37
 */
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Profile implements Serializable {
    private static final long serialVersionUID = -1016474852921050913L;
    private String userSlug;
    private String realName;
    private String aboutMe;
    private String asciiCode;
    private String userAvatar;
    private String gender;
    private List<String> websites;
    private List<String> skillTags;
    private GlobalLocation globalLocation;
    private List<SocialAccounts> socialAccounts;
    private SkillSet skillSet;
}
