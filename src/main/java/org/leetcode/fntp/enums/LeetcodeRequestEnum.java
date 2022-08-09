package org.leetcode.fntp.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * -------------------------------------------------------------------------------
 * Copyright © 2022 Leetcode-info-by-fntp. All rights reserved.
 * -------------------------------------------------------------------------------
 * Module Name: leetcode-info >>> LeetcodeRequestTypeEnum
 * Product:leetcode-info
 * Creator: puye(0303)
 * Date Created: 2022/8/2
 * Description:力扣请求枚举
 * -------------------------------------------------------------------------------
 * Modification History
 * DATE                       Name                  Description
 * -------------------------------------------------------------------------------
 * 2022/8/2                 puye(0303)                 Create
 * -------------------------------------------------------------------------------
 *
 * @author <a href="mailto:suncx@qq.com">fntp</a>
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public enum LeetcodeRequestEnum {
    /**
     * 获得用户最近刷题记录（依赖于传入参数不依赖cookie）
     */
    REQUEST_QUERY_USER_RECENTLY_EXERCISES("query recentAcSubmissions($userSlug: String!){recentACSubmissions(userSlug: $userSlug) {submissionId submitTime question {translatedTitle titleSlug questionFrontendId}}}", 0),
    /**
     * 获得用户基本信息
     */
    REQUEST_QUERY_USER_BASE_INFO("query userProfilePublicProfile($userSlug: String!) {userProfilePublicProfile(userSlug: $userSlug) { haveFollowed siteRanking profile {userSlug realName aboutMe asciiCode userAvatar gender websites skillTags globalLocation {country province city} socialAccounts {provider profileUrl } skillSet { langLevels { langName langVerboseName level } topics { slug name translatedName } topicAreaScores { score topicArea { name slug } } } } educationRecordList { unverifiedOrganizationName } occupationRecordList { unverifiedOrganizationName jobTitle } } }",1),
    /**
     * 获得用户提交的语言类型
     */
    REQUEST_QUERY_USER_SUBMIT_LANGUAGE_DETAIL("query languageStats($userSlug: String!){ userLanguageProblemCount(userSlug: $userSlug){languageName problemsSolved}}",2),
    /**
     * 获得用户解题数量详情
     */
    REQUEST_QUERY_USER_QUESTION_DETAIL("query userQuestionProgress($userSlug: String!){userProfileUserQuestionProgress(userSlug: $userSlug){numAcceptedQuestions {difficulty count}numFailedQuestions{difficulty count} numUntouchedQuestions{difficulty count}}}",3),
    /**
     * 获得用户解题击败用户详情
     */
    REQUEST_QUERY_USER_BEAT_DETAIL("query problemSolvedBeatsStats($userSlug: String!) { problemsSolvedBeatsStats(userSlug: $userSlug) { difficulty percentage}}",4),
    /**
     * 获得用户刷题等级荣誉信息
     */
    REQUEST_QUERY_USER_EXERCISE_LEVEL("query contestBadge($userSlug: String!) { userProfileUserLevelMedal(userSlug: $userSlug) { current { name obtainDate category config { icon iconGif iconGifBackground } id year month hoverText } next { name obtainDate category config { icon iconGif iconGifBackground } id year month hoverText everOwned}}}",5),
    /**
     * 获得用户勋章成就详情
     */
    REQUEST_QUERY_USER_MEDAL_DETAIL("query userBadges($userSlug: String!) { userProfileUserMedals(userSlug: $userSlug) { ...medalNodeFragment } userProfileUserNextMedal(userSlug: $userSlug) { ...medalNodeFragment } } fragment medalNodeFragment on MedalNodeV2 { name obtainDate category config {icon iconGif iconGifBackground } progress id year month }",6),
    /**
     * 获得用户最近题解信息
     */
    REQUEST_QUERY_USER_RECENTLY_RESOLVE_DETAILS("query profileSolutionArticles($userSlug: String!, $skip: Int, $first: Int) { solutionArticles(userSlug: $userSlug, skip: $skip, first: $first) { pageInfo { hasNextPage } edges { node { title slug createdAt question { titleSlug translatedTitle questionFrontendId } upvoteCount topic{viewCount}}}}}",7),
    /**
     * 获得用户一年内每月提交详情
     */
    REQUEST_QUERY_USER_SUBMIT_DETAIL_PER_YEAR("query userProfileCalendar($userSlug: String!, $year: Int) { userCalendar(userSlug: $userSlug, year: $year) { streak totalActiveDays submissionCalendar }}",8),
    /**
     * 获得用户即将获得的成就
     */
    REQUEST_QUERY_USER_WILL_ACHIEVE_GOAL("query userBadges($userSlug: String!) { userProfileUserMedals(userSlug: $userSlug) { ...medalNodeFragment } userProfileUserNextMedal(userSlug: $userSlug) { ...medalNodeFragment } } fragment medalNodeFragment on MedalNodeV2 { name obtainDate category config { icon iconGif iconGifBackground } progress id year month }",9),
    /**
     * （11）第十一种业务：获得关注与被关注的详情
     */
    REQUEST_QUERY_USER_FOLLOW_AND_BE_FOLLOWED_DETAIL("query followCounts($userSlug: String!) { followers(userSlug: $userSlug) { allNum } followingEntities(userSlug: $userSlug) { allNum}}",10),
    /**
     * （12）第十二种业务：获得当前用户所关注的用户列表详情
     * 获得用户关注的用户列表详情
     */
    REQUEST_QUERY_USER_FOLLOWED_USER_LIST_DETAIL("query followerUsers($userSlug: String!, $pageNumber: Int, $resultPerPage: Int) { followers( userSlug: $userSlug pageNumber: $pageNumber resultPerPage: $resultPerPage ) { users { realName userAvatar userSlug aboutMe isMutualFollowing isFollowingMe isFollowedByMe }}}",11),
    /**
     * （13）第十三种业务：拿到已登录用户的accountId与Token
     * 获得当前用户对应的token，根据Cookie获得token与accountId
     */
    REQUEST_QUERY_USER_TOKEN("query getCurrentUserIM { getCurrentUserIM { accId token unread}}",12),
    //----------------------------------------------------------------------------------请求地址
    /**
     *  获得用户最近刷题记录的URL请求地址
     */
    REQUEST_URL_RECENTLY_EXERCISES_URL("https://leetcode.cn/graphql/noj-go"),
    /**
     * 用户基础信息请求地址
     */
    REQUEST_URL_BASE_INFO_URL("https://leetcode.cn/graphql/"),
    /**
     * 用户所使用的语言统计
     */
    REQUEST_URL_USE_LANGUAGE_COUNT("https://leetcode.cn/graphql/noj-go/"),
    /**
     * 用户解题数量详情统计
     */
    REQUEST_URL_QUESTIONS_DETAIL("https://leetcode.cn/graphql/"),
    /**
     * 用户击败其他用户详情
     */
    REQUEST_URL_EXERCISE_BEAT_DETAIL("https://leetcode.cn/graphql/noj-go/"),
    /**
     * 获得用户刷题等级荣誉信息
     */
    REQUEST_URL_LEVEL_MEDAL_DETAIL("https://leetcode.cn/graphql/noj-go/"),
    /**
     * 获得用户勋章成就信息
     */
    REQUEST_URL_MEDAL_INFO_DETAIL("https://leetcode.cn/graphql/"),
    /**
     * 获得用户最近题解信息
     */
    REQUEST_URL_RECENTLY_RESOLVE_DETAIL("https://leetcode.cn/graphql/"),
    /**
     * 获得用户一年内每月提交详情
     */
    REQUEST_URL_CALENDAR_DETAIL("https://leetcode.cn/graphql/noj-go/"),
    /**
     * 获得用户即将获得的成就
     */
    REQUEST_URL_WILL_ACHIEVE_GOAL("https://leetcode.cn/graphql/"),
    /**
     * 获得用户关注与被关注的数量情况
     */
    REQUEST_URL_FOLLOW_AND_BE_FOLLOWED_DETAIL("https://leetcode.cn/graphql/noty"),
    /**
     * 获得用户关注的用户列表详情
     */
    REQUEST_URL_FOLLOWED_DETAIL("https://leetcode.cn/graphql/noty"),
    /**
     * 获得当前用户首页做题分析结果（依赖于cookie不依赖传入参数）
     */
    REQUEST_URL_MAIN_INDEX_PERSONAL_ANALYSE_DETAIL("https://leetcode.cn/graphql/"),
    /**
     * 获得当前用户的id与token
     */
    REQUEST_URL_USER_TOKEN_AND_ID_DETAIL("https://leetcode.cn/graphql/im/"),
    //-------------------------------------------------------------------------------------请求类型
    /**
     * 用户请求
     */
    REQUEST_TYPE_PERSONAL(0),
    /**
     * 系统请求
     */
    REQUEST_TYPE_SYSTEM(1),
    /**
     * 力扣请求
     */
    REQUEST_TYPE_LEETCODE(2)
    ,;
    /**
     * 内容
     */
    private String value;
    /**
     * 请求类型
     */
    private Integer type;

    /**
     * 单参数构造--值
     * @param value 数据数值
     */
    LeetcodeRequestEnum(String value){
        this.value = value;
    }

    /**
     * 单参数构造--类型
     * @param type 数据类型
     */
    LeetcodeRequestEnum(Integer type){ this.type = type;}

}
