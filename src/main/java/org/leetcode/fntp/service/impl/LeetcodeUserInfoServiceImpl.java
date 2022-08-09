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
import java.util.HashMap;
import java.util.Map;
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
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_RECENTLY_EXERCISES.getValue (),
                    userSlug,null,null,null,null,null,null,null,null);
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
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_BASE_INFO.getValue (),
                    userSlug,null,null,null,null,null,null,null,null);
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
    public BaseResult<LcUserLanguageCountDetail> getUserUseLanguageCountInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_SUBMIT_LANGUAGE_DETAIL.getValue(),
                    userSlug,null,null,null,null,null,null,null,null);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_USE_LANGUAGE_COUNT.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserLanguageCountDetail lcUserLanguageCountDetail;
                lcUserLanguageCountDetail = JSON.parseObject (data, LcUserLanguageCountDetail.class);
                if (Objects.nonNull(lcUserLanguageCountDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserLanguageCountDetail);
                    return new BaseResult<>(lcUserLanguageCountDetail);
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
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_QUESTION_DETAIL.getValue(),
                    userSlug,null,null,null,null,null,null,null,null);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_QUESTIONS_DETAIL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserQuestionDetail lcUserQuestionDetail = JSON.parseObject (data, LcUserQuestionDetail.class);
                if (Objects.nonNull(lcUserQuestionDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserQuestionDetail);
                    return new BaseResult<>(lcUserQuestionDetail);
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
     * 获得用户刷题击败其他用户详情
     *
     * @param userSlug 用户标记
     * @return 返回一个详情结果
     */
    @Override
    public BaseResult<LcUserBeatDetail> getUserExerciseBeatDetailsInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_BEAT_DETAIL.getValue(),
                    userSlug,null,null,null,null,null,null,null,null);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_EXERCISE_BEAT_DETAIL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserBeatDetail lcUserBeatDetail = JSON.parseObject (data, LcUserBeatDetail.class);
                if (Objects.nonNull(lcUserBeatDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserBeatDetail);
                    return new BaseResult<>(lcUserBeatDetail);
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
     * 获得用户刷题级别荣誉详情
     *
     * @param userSlug 用户标记
     * @return 返回一个详情结果
     */
    @Override
    public BaseResult<LcUserLevelMedalDetail> getUserLevelMedalDetailInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_EXERCISE_LEVEL.getValue(),
                    userSlug,null,null,null,null,null,null,null,null);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_LEVEL_MEDAL_DETAIL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserLevelMedalDetail lcUserLevelMedalDetail = JSON.parseObject (data, LcUserLevelMedalDetail.class);
                if (Objects.nonNull(lcUserLevelMedalDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserLevelMedalDetail);
                    return new BaseResult<>(lcUserLevelMedalDetail);
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
     * 获得用户勋章成就信息
     *
     * @param userSlug 用户标记
     * @return 返回一个用户勋章成就信息
     */
    @Override
    public BaseResult<LcUserMedalInfoDetail> getUserMedalInfoDetailInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_MEDAL_DETAIL.getValue(),
                    userSlug,null,null,null,null,null,null,null,null);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_MEDAL_INFO_DETAIL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserMedalInfoDetail lcUserMedalInfoDetail = JSON.parseObject (data, LcUserMedalInfoDetail.class);
                if (Objects.nonNull(lcUserMedalInfoDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserMedalInfoDetail);
                    return new BaseResult<>(lcUserMedalInfoDetail);
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
     * 获得用户最近题解信息
     *
     * @param userSlug 用户标记
     * @return 返回一个基本响应
     */
    @Override
    public BaseResult<LcUserRecentlyResolveDetail> getUserRecentlyResolvesInfo(String userSlug, Integer first, Integer skip) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_RECENTLY_RESOLVE_DETAILS.getValue(),
                    userSlug,null,first,skip,null,null,null,null,null);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_RECENTLY_RESOLVE_DETAIL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserRecentlyResolveDetail lcUserRecentlyResolveDetail = JSON.parseObject (data, LcUserRecentlyResolveDetail.class);
                if (Objects.nonNull(lcUserRecentlyResolveDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserRecentlyResolveDetail);
                    return new BaseResult<>(lcUserRecentlyResolveDetail);
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
     * 获得用户一年内每月提交详情
     *
     * @param userSlug 用户标记
     * @return 返回用户一年每个月的提交详情
     */
    @Override
    public BaseResult<LcUserCalendarDetail> getUserCalendarDetailInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_SUBMIT_DETAIL_PER_YEAR.getValue(),
                    userSlug,null,null,null,null,null,null,null,null);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_CALENDAR_DETAIL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserCalendarDetail lcUserCalendarDetail = JSON.parseObject (data, LcUserCalendarDetail.class);
                if (Objects.nonNull(lcUserCalendarDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserCalendarDetail);
                    return new BaseResult<>(lcUserCalendarDetail);
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
     * 获得用户即将获得的成就
     *
     * @param userSlug 用户标记
     * @return 返回用户即将获得的成就详情
     */
    @Override
    public BaseResult<LcUserWillAchieveGoalDetail> getUserWillAchieveGoalDetailInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_WILL_ACHIEVE_GOAL.getValue(),
                    userSlug,null,null,null,null,null,null,null,null);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_WILL_ACHIEVE_GOAL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserWillAchieveGoalDetail lcUserWillAchieveGoalDetail = JSON.parseObject (data, LcUserWillAchieveGoalDetail.class);
                if (Objects.nonNull(lcUserWillAchieveGoalDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserWillAchieveGoalDetail);
                    return new BaseResult<>(lcUserWillAchieveGoalDetail);
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
     * 获得用户关注与被关注的数量情况
     *
     * @param userSlug 用户标记
     * @return 返回一个获得用户关注与被关注的数量情况
     */
    @Override
    public BaseResult<LcUserFollowDetail> getUserFollowAndBeFollowedDetailInfo(String userSlug) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_FOLLOW_AND_BE_FOLLOWED_DETAIL.getValue(),
                    userSlug,null,null,null,null,null,null,null,null);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_FOLLOW_AND_BE_FOLLOWED_DETAIL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserFollowDetail lcUserFollowDetail = JSON.parseObject (data, LcUserFollowDetail.class);
                if (Objects.nonNull(lcUserFollowDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserFollowDetail);
                    return new BaseResult<>(lcUserFollowDetail);
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
     * 获得用户关注的用户列表详情
     *
     * @param userSlug 用户标记
     * @return 返回一个获得用户关注的用户列表详情
     */
    @Override
    public BaseResult<LcUserFollowedDetail> getUserFollowDetailsInfo(String userSlug, Integer pageNumber, Integer resultPage) {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_FOLLOWED_USER_LIST_DETAIL.getValue(),
                    userSlug,null,null,null,null,null,null,pageNumber,resultPage);
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_FOLLOWED_DETAIL.getValue(), requestJson.toJSONString (), null);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserFollowedDetail lcUserFollowedDetail = JSON.parseObject (data, LcUserFollowedDetail.class);
                if (Objects.nonNull(lcUserFollowedDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserFollowedDetail);
                    return new BaseResult<>(lcUserFollowedDetail);
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
     * 获得当前用户的id与token
     * 去拿请求头中的参数cookie
     * @return 返回一个获得当前用户的id与token
     * @deprecated 方法还未完善 TODO 完善cookie获取
     */
    @Override
    @Deprecated(forRemoval = true,since = "11")
    public BaseResult<LcUserTokenDetail> getUserTokenDetailInfo() {
        try {
            // 组装请求体
            JSONObject requestJson = getRequestParamJsonObjNormal(LeetcodeRequestEnum.REQUEST_QUERY_USER_TOKEN.getValue(),
                    null,null,null,null,null,null,null,null,null);
            // TODO 组装cookie，根据requestHeader拿到cookie数据
            Map<String, String> headerMap = new HashMap<>();
            headerMap.put("Cookie","");
            // 发起请求，获得请求结果json数据
            String postResult = HttpUtil.post (LeetcodeRequestEnum.REQUEST_URL_USER_TOKEN_AND_ID_DETAIL.getValue(), requestJson.toJSONString (), headerMap);
            if (JSONUtil.isJson (postResult)) {
                JSONObject jsonObject = JSON.parseObject (postResult);
                String data = jsonObject.getString ("data");
                LcUserTokenDetail lcUserTokenDetail = JSON.parseObject (data, LcUserTokenDetail.class);
                if (Objects.nonNull(lcUserTokenDetail)) {
                    log.info("获得用户信息成功！当前查询用户最近解题记录：{}",lcUserTokenDetail);
                    return new BaseResult<>(lcUserTokenDetail);
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
     * 获得通用的请求JSON对象
     * @param queryParam 查询参数
     * @param userSlug 用户标记
     * @param skip 跳过数量
     * @param first 起始位置
     * @param difficulty difficulty数组  这个数组暂时不确定是不是字符串数组
     * @param sortField  排序字段
     * @param sortOrder 排序方式
     * @param status 状态
     * @param pageNumber 页码
     * @param resultPerPage 最终页
     * @return 返回一个请求体对象
     */
    private JSONObject getRequestParamJsonObjNormal(String queryParam, String userSlug, Object[] difficulty, Integer first,
                                                    Integer skip, String sortField, String sortOrder, String status,
                                                    Integer pageNumber, Integer resultPerPage){
        JSONObject jsonObj = new JSONObject();
        jsonObj.put ("query", queryParam);
        JSONObject variables = new JSONObject ();
        if (Objects.nonNull(userSlug)) {
            variables.put ("userSlug",userSlug);
        }
        if (Objects.nonNull(first)) {
            variables.put("first",first);
        }
        if (Objects.nonNull(skip)) {
            variables.put("skip",skip);
        }
        if (Objects.nonNull(difficulty)) {
            variables.put("difficulty",difficulty);
        }
        if (Objects.nonNull(sortField)) {
            variables.put("sortField",sortField);
        }
        if (Objects.nonNull(sortOrder)) {
            variables.put("sortOrder",sortOrder);
        }
        if (Objects.nonNull(status)) {
            variables.put("status",status);
        }
        if (Objects.nonNull(pageNumber)) {
            variables.put("pageNumber",pageNumber);
        }
        if (Objects.nonNull(resultPerPage)) {
            variables.put("resultPerPage",resultPerPage);
        }
        if (variables.size()>0) {
            jsonObj.put ("variables",variables);
        }
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
