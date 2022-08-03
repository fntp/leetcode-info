package org.leetcode.fntp.service;

import org.leetcode.fntp.vo.baseinfo.LcUserBaseInfoDetail;
import org.leetcode.fntp.vo.beatdetail.LcUserBeatDetail;
import org.leetcode.fntp.vo.followcount.LcUserFollowDetail;
import org.leetcode.fntp.vo.followdetail.LcUserFollowedDetail;
import org.leetcode.fntp.vo.levelmedal.LcUserLevelMedalDetail;
import org.leetcode.fntp.vo.monthdetail.LcUserCalendarDetail;
import org.leetcode.fntp.vo.questiondetail.LcUserQuestionDetail;
import org.leetcode.fntp.vo.recentlyexercise.LcUserRecentlyExerciseDetail;
import org.leetcode.fntp.vo.recentlyresolve.LcUserRecentlyResolveDetail;
import org.leetcode.fntp.vo.tokeninfo.LcUserTokenDetail;
import org.leetcode.fntp.vo.uselanguage.LcUserLanguageCountDetail;
import org.leetcode.fntp.vo.usermedal.LcUserMedalInfoDetail;
import org.leetcode.fntp.vo.willachieve.LcUserWillAchieveGoalDetail;
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
    BaseResult<LcUserRecentlyExerciseDetail> getLeetcodeUserRecentlyExercisesInfo(String userSlug);

    /**
     * 根据用户标记获得用户信息
     * @param userSlug 用户标记
     * @return 返回一个用户信息
     */
    BaseResult<LcUserBaseInfoDetail> getLeetcodeUserBaseInfo(String userSlug);

    /**
     * 通过用户slug获得用户解决算法题的语言统计结果
     * @param userSlug 用户标记
     * @return 返回一个用户解决问题所使用的语言统计结果
     */
    BaseResult<List<LcUserLanguageCountDetail>> getUserUseLanguageCountInfo(String userSlug);

    /**
     * 获得用户刷题详情
     * @param userSlug 用户标记
     * @return 返回一个用户刷题详情，包括通过的，未通过的，提交的（以及对应的难度）
     */
    BaseResult<LcUserQuestionDetail> getUserQuestionsDetailInfo(String userSlug);

    /**
     * 获得用户刷题击败其他用户详情
     * @param userSlug 用户标记
     * @return 返回一个详情结果
     */
    BaseResult<List<LcUserBeatDetail>> getUserExerciseBeatDetailsInfo(String userSlug);

    /**
     * 获得用户刷题级别荣誉详情
     * @param userSlug 用户标记
     * @return 返回一个详情结果
     */
    BaseResult<LcUserLevelMedalDetail> getUserLevelMedalDetailInfo(String userSlug);

    /**
     * 获得用户勋章成就信息
     * @param userSlug 用户标记
     * @return 返回一个用户勋章成就信息
     */
    BaseResult<LcUserMedalInfoDetail> getUserMedalInfoDetailInfo(String userSlug);

    /**
     * 获得用户最近题解信息
     * @param userSlug 用户标记
     * @return 返回一个基本响应
     */
    BaseResult<LcUserRecentlyResolveDetail> getUserRecentlyResolvesInfo(String userSlug);

    /**
     * 获得用户一年内每月提交详情
     * @param userSlug 用户标记
     * @return 返回用户一年每个月的提交详情
     */
    BaseResult<LcUserCalendarDetail> getUserCalendarDetailInfo(String userSlug);

    /**
     * 获得用户即将获得的成就
     * @param userSlug 用户标记
     * @return 返回用户即将获得的成就详情
     */
    BaseResult<LcUserWillAchieveGoalDetail> getUserWillAchieveGoalDetailInfo(String userSlug);

    /**
     * 获得用户关注与被关注的数量情况
     * @param userSlug 用户标记
     * @return  返回一个获得用户关注与被关注的数量情况
     */
    BaseResult<LcUserFollowDetail> getUserFollowDetailInfo(String userSlug);

    /**
     * 获得用户关注的用户列表详情
     * @param userSlug 用户标记
     * @return 返回一个获得用户关注的用户列表详情
     */
    BaseResult<LcUserFollowedDetail> getUserFollowDetailsInfo(String userSlug);

    /**
     * 获得当前用户的id与token
     * @param userSlug 用户标记
     * @return 返回一个获得当前用户的id与token
     */
    BaseResult<LcUserTokenDetail> getUserTokenDetailInfo(String userSlug);

}
