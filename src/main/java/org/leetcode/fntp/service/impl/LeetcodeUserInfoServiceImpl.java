package org.leetcode.fntp.service.impl;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.leetcode.fntp.common.BaseException;
import org.leetcode.fntp.common.CodeEnum;
import org.leetcode.fntp.enums.LeetcodeRequestEnum;
import org.leetcode.fntp.model.BaseResult;
import org.leetcode.fntp.service.ILeetcodeUserInfoService;
import org.leetcode.fntp.service.ILogService;
import org.leetcode.fntp.utils.HttpUtil;
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
import java.io.IOException;
import java.util.List;
import java.util.Objects;
/**
 * @author fntp
 * @description TODO
 * @date 2022/8/3 0:31
 */
@Service("leetcodeUserInfoServiceImpl")
@Slf4j
public class LeetcodeUserInfoServiceImpl implements ILeetcodeUserInfoService {

    @Resource
    private ILogService logService;

    /**
     * 获得用户最近刷题记录的接口
     * @param userSlug 传入一个用户标记
     * @return 返回一个用户刷题记录
     */
    @Override
    public BaseResult<LcUserRecentlyExerciseDetail> getLeetcodeUserRecentlyExercisesInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObj(LeetcodeRequestEnum.REQUEST_QUERY_USER_RECENTLY_EXERCISES.getValue (),userSlug);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_RECENTLY_EXERCISES_URL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserRecentlyExerciseDetail lcUserRecentlyExerciseDetail;
                lcUserRecentlyExerciseDetail = JSON.parseObject (data, LcUserRecentlyExerciseDetail.class);
                if (Objects.nonNull(lcUserRecentlyExerciseDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserRecentlyExerciseDetail);
                    return new BaseResult<>(lcUserRecentlyExerciseDetail);
                }else {
                    throw new BaseException(CodeEnum.ERROR_JSON_PARSER);
                }
            }else {
                throw new BaseException(CodeEnum.ERROR_IS_NOT_JSON);
            }
        } catch (BaseException e) {
            log.error("JSON解析出现错误！{}",e.getMessage());
            throw new BaseException(CodeEnum.ERROR_JSON_PARSER);
        }catch (IOException e){
            log.error("网络请求出现错误！{}",e.getMessage());
            throw new BaseException(CodeEnum.ERROR_NETWORK);
        }
    }

    /**
     * 根据用户标记获得用户信息
     *
     * @param userSlug 用户标记
     * @return 返回一个用户信息
     */
    @Override
    public BaseResult<LcUserBaseInfoDetail> getLeetcodeUserBaseInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObj(LeetcodeRequestEnum.REQUEST_QUERY_USER_BASE_INFO.getValue (),userSlug);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_BASE_INFO_URL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserBaseInfoDetail lcUserBaseInfoDetail;
                lcUserBaseInfoDetail = JSON.parseObject (data, LcUserBaseInfoDetail.class);
                if (Objects.nonNull(lcUserBaseInfoDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserBaseInfoDetail);
                    return new BaseResult<>(lcUserBaseInfoDetail);
                }else {
                    throw new BaseException(CodeEnum.ERROR_JSON_PARSER);
                }
            }else {
                throw new BaseException(CodeEnum.ERROR_IS_NOT_JSON);
            }
        } catch (BaseException e) {
            log.error("JSON解析出现错误！{}",e.getMessage());
            throw new BaseException(CodeEnum.ERROR_JSON_PARSER);
        }catch (IOException e){
            log.error("网络请求出现错误！{}",e.getMessage());
            throw new BaseException(CodeEnum.ERROR_NETWORK);
        }
    }

    /**
     * 通过用户slug获得用户解决算法题的语言统计结果
     *
     * @param userSlug 用户标记
     * @return 返回一个用户解决问题所使用的语言统计结果
     */
    @Override
    public BaseResult<List<LcUserLanguageCountDetail>> getUserUseLanguageCountInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObj(LeetcodeRequestEnum.REQUEST_QUERY_USER_SUBMIT_LANGUAGE_DETAIL.getValue(),userSlug);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_USE_LANGUAGE_COUNT.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserBaseInfoDetail lcUserBaseInfoDetail;
                lcUserBaseInfoDetail = JSON.parseObject (data, LcUserBaseInfoDetail.class);
                if (Objects.nonNull(lcUserBaseInfoDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserBaseInfoDetail);
                    return new BaseResult<>(lcUserBaseInfoDetail);
                }else {
                    throw new BaseException(CodeEnum.ERROR_JSON_PARSER);
                }
            }else {
                throw new BaseException(CodeEnum.ERROR_IS_NOT_JSON);
            }
        } catch (BaseException e) {
            log.error("JSON解析出现错误！{}",e.getMessage());
            throw new BaseException(CodeEnum.ERROR_JSON_PARSER);
        }catch (IOException e){
            log.error("网络请求出现错误！{}",e.getMessage());
            throw new BaseException(CodeEnum.ERROR_NETWORK);
        }
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
    public BaseResult<LcUserFollowDetail> getUserFollowAndBeFollowedDetailInfo(String userSlug) {
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

    /**
     * 组装POST请求JSON体
     * @param queryParam 查询参数
     * @param userSlug 用户标记
     * @return 返回一个JSON对象
     */
    private JSONObject getRequestParamJsonObj(String queryParam, String userSlug){
        JSONObject jsonObj = new JSONObject();
        jsonObj.put ("query", queryParam);
        JSONObject variables = new JSONObject ();
        variables.put ("userSlug",userSlug);
        jsonObj.put ("variables",variables);
        return jsonObj;
    }


    ///**
    // * 获得用户信息
    // * @return 拿到当前请求对象的信息
    // */
    //private CurrentLoginUserDto getUserInfo() {
    //    RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
    //    if (Objects.nonNull(requestAttributes)) {
    //        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
    //        String authorization = request.getHeader("Authorization");
    //        if (Objects.nonNull(authorization)) {
    //            return userFeign.getUserInfoByToken(authorization);
    //        }
    //        throw new BaseException(BaizeExceptionType.ERROR_UNKNOWN_USER_INFO);
    //    }
    //    throw new BaseException(BaizeExceptionType.ERROR_UNKNOWN_USER_INFO);
    //}
}
