package org.leetcode.fntp.service;

import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.leetcode.fntp.utils.HttpUtil;

/**
 * @author fntp
 * @description TODO
 * @date 2022/7/31 13:09
 */

public class ITestService {

    @Test
    public void getUserInfo(){
        OkHttpClient okHttpClient = HttpUtil.buildHttpClient(true, TlsVersion.TLS_1_2.javaName(), null);
        String requestUrl = "https://leetcode.cn/graphql/";

        JSONObject object = new JSONObject();
        //object.put("queryData",queryData);
        //object.put()
        //HttpUtil.post(requestUrl,)
        String uuuu = "query languageStats($userSlug: String!){ userLanguageProblemCount(userSlug: $userSlug){languageName problemsSolved}}";

        String rr = " query userQuestionProgress($userSlug: String!) { userProfileUserQuestionProgress(userSlug: $userSlug) { numAcceptedQuestions { difficulty count } numFailedQuestions { difficulty count } numUntouchedQuestions { difficulty count } } } ";

        String ee = "query problemSolvedBeatsStats($userSlug: String!) { problemsSolvedBeatsStats(userSlug: $userSlug) { difficulty percentage}}";

        String rr1 = " query contestBadge($userSlug: String!) { userProfileUserLevelMedal(userSlug: $userSlug) { current { name obtainDate category config { icon iconGif iconGifBackground } id year month hoverText } next { name obtainDate category config { icon iconGif iconGifBackground } id year month hoverText everOwned}}}";

        String asc = " query userBadges($userSlug: String!) { userProfileUserMedals(userSlug: $userSlug) { ...medalNodeFragment } userProfileUserNextMedal(userSlug: $userSlug) { ...medalNodeFragment } } fragment medalNodeFragment on MedalNodeV2 { name obtainDate category config {icon iconGif iconGifBackground } progress id year month }";

        String wwer = " query profileSolutionArticles($userSlug: String!, $skip: Int, $first: Int) { solutionArticles(userSlug: $userSlug, skip: $skip, first: $first) { pageInfo { hasNextPage } edges { node { title slug createdAt question { titleSlug translatedTitle questionFrontendId } upvoteCount topic { viewCount } } } } } ";

        String ert = " query userProfileCalendar($userSlug: String!, $year: Int) { userCalendar(userSlug: $userSlug, year: $year) { streak totalActiveDays submissionCalendar }}";

        String erdf = " query userBadges($userSlug: String!) { userProfileUserMedals(userSlug: $userSlug) { ...medalNodeFragment } userProfileUserNextMedal(userSlug: $userSlug) { ...medalNodeFragment } } fragment medalNodeFragment on MedalNodeV2 { name obtainDate category config { icon iconGif iconGifBackground } progress id year month }";

        String erfd = " query followCounts($userSlug: String!) { followers(userSlug: $userSlug) { allNum } followingEntities(userSlug: $userSlug) { allNum}}";

        String trtr = " query followerUsers($userSlug: String!, $pageNumber: Int, $resultPerPage: Int) { followers( userSlug: $userSlug pageNumber: $pageNumber resultPerPage: $resultPerPage ) { users { realName userAvatar userSlug aboutMe isMutualFollowing isFollowingMe isFollowedByMe }}}";

        String fgrf = " query getCurrentUserIM { getCurrentUserIM { accId token unread}}";
    }

}
