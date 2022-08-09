package org.leetcode.fntp.controller;

import org.leetcode.fntp.model.BaseResult;
import org.leetcode.fntp.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * -------------------------------------------------------------------------------
 * Copyright © 2022 Beijing YuXiang Software Technology Co., Ltd. All rights reserved.
 * -------------------------------------------------------------------------------
 * Module Name: leetcode-info >>> TestController
 * Product:
 * Creator: puye(0303)
 * Date Created: 2022/8/9
 * Description:
 * -------------------------------------------------------------------------------
 * Modification History
 * DATE                       Name                  Description
 * -------------------------------------------------------------------------------
 * 2022/8/9                 puye(0303)                 Create
 * -------------------------------------------------------------------------------
 *
 * @author <a href="mailto:suncx@flamelephant.com">puye(0303)</a>
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping("/login")
    public BaseResult<String> testLogin(){
        String userId = "1";
        String tokenByUserId = jwtUtil.createTokenByUserId(userId);
        System.out.println(tokenByUserId);
        return new BaseResult<>(tokenByUserId);
    }

    @RequestMapping("/logout")
    public BaseResult<Boolean> testLogout(@RequestParam String tokenStr){
        System.out.println(jwtUtil.checkTokenFromUser(tokenStr));
        return new BaseResult<>(true);
    }
}
