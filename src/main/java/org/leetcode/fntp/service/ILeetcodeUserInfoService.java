package org.leetcode.fntp.service;

import org.leetcode.fntp.dto.baseinfo.UserProfilePublicProfile;
import org.leetcode.fntp.dto.questiondetail.UserProfileUserQuestionProgress;
import org.leetcode.fntp.dto.recentlyexercise.RecentAcSubmissions;
import org.leetcode.fntp.dto.uselanguage.UserLanguageProblemCount;
import org.leetcode.fntp.model.BaseResult;

import java.util.List;

/**
 * @author fntp
 * @description leetcode用户信息操作
 * @date 2022/8/1 23:22
 */
public interface ILeetcodeUserInfoService {

    /**
     * 获得用户最近刷题记录的接口
     * @param userSlug 传入一个用户标记
     * @return 返回一个用户刷题记录
     */
    BaseResult<List<RecentAcSubmissions>> getLeetcodeUserRecentlyExercises(String userSlug);

    /**
     * 根据用户标记获得用户信息
     * @param userSlug 用户标记
     * @return 返回一个用户信息
     */
    BaseResult<UserProfilePublicProfile> getLeetcodeUserBaseInfoByUserSlug(String userSlug);

    /**
     * 通过用户slug获得用户解决算法题的语言统计结果
     * @param userSlug 用户标记
     * @return 返回一个用户解决问题所使用的语言统计结果
     */
    BaseResult<List<UserLanguageProblemCount>> getUserUseLanguageCountByUserSlug(String userSlug);

    /**
     * 根据用户的标记获得用户刷题详情
     * @param userSlug 用户标记
     * @return 返回一个用户刷题详情，包括通过的，未通过的，提交的（以及对应的难度）
     */
    BaseResult<UserProfileUserQuestionProgress> getUserQuestionsDetailByUserSlug(String userSlug);

}
