package org.leetcode.fntp.service.impl;

import org.leetcode.fntp.mapper.IUserInfoMapper;
import org.leetcode.fntp.model.BaseResult;
import org.leetcode.fntp.service.ILeetcodeUserInfoService;
import org.leetcode.fntp.service.ILogService;
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
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/3 0:31
 */
@Service("leetcodeUserInfoServiceImpl")
public class LeetcodeUserInfoServiceImpl implements ILeetcodeUserInfoService {

    @Resource
    private ILogService logService;

    @Resource
    private IUserInfoMapper userInfoMapper;

    /**
     * 获得用户最近刷题记录的接口
     *
     * @param userSlug 传入一个用户标记
     * @return 返回一个用户刷题记录
     */
    @Override
    public BaseResult<List<LcUserRecentlyExerciseDetail>> getLeetcodeUserRecentlyExercisesInfo(String userSlug) {
        var scx = "a";
        return null;
    }

    /**
     * 根据用户标记获得用户信息
     *
     * @param userSlug 用户标记
     * @return 返回一个用户信息
     */
    @Override
    public BaseResult<LcUserBaseInfoDetail> getLeetcodeUserBaseInfo(String userSlug) {
        return null;
    }

    /**
     * 通过用户slug获得用户解决算法题的语言统计结果
     *
     * @param userSlug 用户标记
     * @return 返回一个用户解决问题所使用的语言统计结果
     */
    @Override
    public BaseResult<List<LcUserLanguageCountDetail>> getUserUseLanguageCountInfo(String userSlug) {
        return null;
    }

    /**
     * 获得用户刷题详情
     *
     * @param userSlug 用户标记
     * @return 返回一个用户刷题详情，包括通过的，未通过的，提交的（以及对应的难度）
     */
    @Override
    public BaseResult<LcUserQuestionDetail> getUserQuestionsDetailInfo(String userSlug) {
        return null;
    }

    /**
     * 获得用户刷题击败其他用户详情
     *
     * @param userSlug 用户标记
     * @return 返回一个详情结果
     */
    @Override
    public BaseResult<List<LcUserBeatDetail>> getUserExerciseBeatDetailsInfo(String userSlug) {
        return null;
    }

    /**
     * 获得用户刷题级别荣誉详情
     *
     * @param userSlug 用户标记
     * @return 返回一个详情结果
     */
    @Override
    public BaseResult<LcUserLevelMedalDetail> getUserLevelMedalDetailInfo(String userSlug) {
        return null;
    }

    /**
     * 获得用户勋章成就信息
     *
     * @param userSlug 用户标记
     * @return 返回一个用户勋章成就信息
     */
    @Override
    public BaseResult<LcUserMedalInfoDetail> getUserMedalInfoDetailInfo(String userSlug) {
        return null;
    }

    /**
     * 获得用户最近题解信息
     *
     * @param userSlug 用户标记
     * @return 返回一个基本响应
     */
    @Override
    public BaseResult<LcUserRecentlyResolveDetail> getUserRecentlyResolvesInfo(String userSlug) {
        return null;
    }

    /**
     * 获得用户一年内每月提交详情
     *
     * @param userSlug 用户标记
     * @return 返回用户一年每个月的提交详情
     */
    @Override
    public BaseResult<LcUserCalendarDetail> getUserCalendarDetailInfo(String userSlug) {
        return null;
    }

    /**
     * 获得用户即将获得的成就
     *
     * @param userSlug 用户标记
     * @return 返回用户即将获得的成就详情
     */
    @Override
    public BaseResult<LcUserWillAchieveGoalDetail> getUserWillAchieveGoalDetailInfo(String userSlug) {
        return null;
    }

    /**
     * 获得用户关注与被关注的数量情况
     *
     * @param userSlug 用户标记
     * @return 返回一个获得用户关注与被关注的数量情况
     */
    @Override
    public BaseResult<LcUserFollowDetail> getUserFollowDetailInfo(String userSlug) {
        return null;
    }

    /**
     * 获得用户关注的用户列表详情
     *
     * @param userSlug 用户标记
     * @return 返回一个获得用户关注的用户列表详情
     */
    @Override
    public BaseResult<LcUserFollowedDetail> getUserFollowDetailsInfo(String userSlug) {
        return null;
    }

    /**
     * 获得当前用户的id与token
     *
     * @param userSlug 用户标记
     * @return 返回一个获得当前用户的id与token
     */
    @Override
    public BaseResult<LcUserTokenDetail> getUserTokenDetailInfo(String userSlug) {
        return null;
    }
}
