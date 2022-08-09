package org.leetcode.fntp.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.leetcode.fntp.model.BaseResult;
import org.leetcode.fntp.service.ILeetcodeUserInfoService;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author fntp
 * @description TODO
 * @date 2022/8/2 23:47
 */
@RestController
@RequestMapping("/leetcodeUser")
@Slf4j
@ApiModel("力扣用户信息详情")
public class ILeetcodeInfoController {

    @Resource
    private ILeetcodeUserInfoService leetcodeUserInfoService;

    /**
     * 获得用户最近刷题记录的接口
     * @param userSlug 传入一个用户标记
     * @return 返回一个用户刷题记录
     */
    @GetMapping("/recentlyExercisesInfo")
    @ApiOperation(value = "刷题记录", notes = "获得用户最近刷题记录的接口")
    public BaseResult<LcUserRecentlyExerciseDetail> getLeetcodeUserRecentlyExercisesInfo(@RequestParam String userSlug){
        return leetcodeUserInfoService.getLeetcodeUserRecentlyExercisesInfo(userSlug);
    }

    /**
     * 根据用户标记获得用户信息
     * @param userSlug 用户标记
     * @return 返回一个用户信息
     */
    @GetMapping("/baseInfo")
    @ApiOperation(value = "用户信息", notes = "获得用户基本信息接口")
    public BaseResult<LcUserBaseInfoDetail> getLeetcodeUserBaseInfo(String userSlug){
        return leetcodeUserInfoService.getLeetcodeUserBaseInfo(userSlug);
    }

    /**
     * 通过用户slug获得用户解决算法题的语言统计结果
     * @param userSlug 用户标记
     * @return 返回一个用户解决问题所使用的语言统计结果
     */
    @GetMapping("/useLanguageCountInfo")
    @ApiOperation(value = "语言统计", notes = "通过用户slug获得用户解决算法题的语言统计结果")
    public BaseResult<LcUserLanguageCountDetail> getUserUseLanguageCountInfo(@RequestParam String userSlug){
        return leetcodeUserInfoService.getUserUseLanguageCountInfo(userSlug);
    }

    /**
     * 获得用户刷题详情
     * @param userSlug 用户标记
     * @return 返回一个用户刷题详情，包括通过的，未通过的，提交的（以及对应的难度）
     */
    @GetMapping("/questionDetailInfo")
    @ApiOperation(value = "刷题详情", notes = "获得用户刷题详情")
    public BaseResult<LcUserQuestionDetail> getUserQuestionsDetailInfo(@RequestParam String userSlug){
        return leetcodeUserInfoService.getUserQuestionsDetailInfo(userSlug);
    }

    /**
     * 获得用户刷题击败其他用户详情
     * @param userSlug 用户标记
     * @return 返回一个详情结果
     */
    @GetMapping("/exerciseBeatDetailInfo")
    @ApiOperation(value = "击败详情", notes = "获得用户刷题击败其他用户详情")
    public BaseResult<LcUserBeatDetail> getUserExerciseBeatDetailsInfo(@RequestParam String userSlug){
        return leetcodeUserInfoService.getUserExerciseBeatDetailsInfo(userSlug);
    }

    /**
     * 获得用户刷题级别荣誉详情
     * @param userSlug 用户标记
     * @return 返回一个详情结果
     */
    @GetMapping("/levelMedalDetailInfo")
    @ApiOperation(value = "荣誉详情", notes = "获得用户刷题级别荣誉详情")
    public BaseResult<LcUserLevelMedalDetail> getUserLevelMedalDetailInfo(@RequestParam String userSlug){
        return leetcodeUserInfoService.getUserLevelMedalDetailInfo(userSlug);
    }

    /**
     * 获得用户勋章成就信息
     * @param userSlug 用户标记
     * @return 返回一个用户勋章成就信息
     */
    @GetMapping("/medalInfoDetailInfo")
    @ApiOperation(value = "勋章信息", notes = "获得用户勋章成就信息")
    public BaseResult<LcUserMedalInfoDetail> getUserMedalInfoDetailInfo(@RequestParam String userSlug){
        return leetcodeUserInfoService.getUserMedalInfoDetailInfo(userSlug);
    }

    /**
     * 获得用户最近题解信息
     * @param userSlug 用户标记
     * @return 返回一个基本响应
     */
    @GetMapping("/recentlyResolvesInfo")
    @ApiOperation(value = "题解信息", notes = "获得用户最近题解信息")
    public BaseResult<LcUserRecentlyResolveDetail> getUserRecentlyResolvesInfo(@RequestParam String userSlug,
                                                                                        @RequestParam Integer first,
                                                                                        @RequestParam Integer skip){
        return leetcodeUserInfoService.getUserRecentlyResolvesInfo(userSlug,first,skip);
    }

    /**
     * 获得用户一年内每月提交详情
     * @param userSlug 用户标记
     * @return 返回用户一年每个月的提交详情
     */
    @GetMapping("/calendarDetailInfo")
    @ApiOperation(value = "每月详情", notes = "获得用户一年内每月提交详情")
    public BaseResult<LcUserCalendarDetail> getUserCalendarDetailInfo(@RequestParam String userSlug){
        return leetcodeUserInfoService.getUserCalendarDetailInfo(userSlug);
    }

    /**
     * 获得用户即将获得的成就
     * @param userSlug 用户标记
     * @return 返回用户即将获得的成就详情
     */
    @GetMapping("/followDetailInfo")
    @ApiOperation(value = "未来成就", notes = "获得用户即将获得的成就")
    public BaseResult<LcUserWillAchieveGoalDetail> getUserWillAchieveGoalDetailInfo(@RequestParam String userSlug){
        return leetcodeUserInfoService.getUserWillAchieveGoalDetailInfo(userSlug);
    }

    /**
     * 获得用户关注与被关注的数量情况
     * @param userSlug 用户标记
     * @return  返回一个获得用户关注与被关注的数量情况
     */
    @GetMapping("/followDetailInfo")
    @ApiOperation(value = "粉丝详情", notes = "获得用户关注与被关注的数量情况")
    public BaseResult<LcUserFollowDetail> getUserFollowDetailInfo(@RequestParam String userSlug){
        return leetcodeUserInfoService.getUserFollowAndBeFollowedDetailInfo(userSlug);
    }

    /**
     * 获得用户关注的用户列表详情
     * @param userSlug 用户标记
     * @return 返回一个获得用户关注的用户列表详情
     */
    @GetMapping("/followDetailsInfo")
    @ApiOperation(value = "关注用户", notes = "获得用户关注的用户列表详情")
    public BaseResult<LcUserFollowedDetail> getUserFollowDetailsInfo(@RequestParam String userSlug,
                                                                            @RequestParam Integer pageNumber,
                                                                            @RequestParam Integer resultPage){
        return leetcodeUserInfoService.getUserFollowDetailsInfo(userSlug, pageNumber, resultPage);
    }

    /**
     * 获得当前用户的id与token
     * @return 返回一个获得当前用户的id与token
     */
    @GetMapping("/tokenDetailInfo")
    @ApiOperation(value = "token详情", notes = "获得当前用户的id与token")
    public BaseResult<LcUserTokenDetail> getUserTokenDetailInfo(){
        return leetcodeUserInfoService.getUserTokenDetailInfo();
    }

}
