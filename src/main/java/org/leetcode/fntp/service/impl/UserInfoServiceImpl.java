package org.leetcode.fntp.service.impl;

import org.leetcode.fntp.dto.UserInfoDTO;
import org.leetcode.fntp.model.BaseResult;
import org.leetcode.fntp.model.PageableData;
import org.leetcode.fntp.service.IUserInfoService;
import org.leetcode.fntp.vo.UserInfoVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/7/30 23:57
 */
@Service("userInfoServiceImpl")
public class UserInfoServiceImpl implements IUserInfoService {
    /**
     * 插入用户信息
     *
     * @param userInfoDTO 传入一个用户实体信息
     * @return 返回一个插入结果
     */
    @Override
    public BaseResult<Boolean> addUserInfo(UserInfoDTO userInfoDTO) {
        return null;
    }

    /**
     * 批量新增用户数据
     *
     * @param userInfoDTOList 用户信息集合
     * @return 返回一个批量新增的结果
     */
    @Override
    public BaseResult<Boolean> addUserInfoList(List<UserInfoDTO> userInfoDTOList) {
        return null;
    }

    /**
     * 删除用户信息
     *
     * @param userId 传入一个用户id
     * @return 返回一个用户信息
     */
    @Override
    public BaseResult<Boolean> deleteUserInfo(Long userId) {
        return null;
    }

    /**
     * 批量删除用户信息
     *
     * @param userIdList 传入一个用户id集合
     * @return 返回一个批量删除用户信息的结果
     */
    @Override
    public BaseResult<Boolean> deleteList(List<Long> userIdList) {
        return null;
    }

    /**
     * 更新用户信息
     *
     * @param userInfoDTO 传入一个用户信息实体VO
     * @return 返回一个更新结果
     */
    @Override
    public BaseResult<Boolean> updateByUserId(UserInfoDTO userInfoDTO) {
        return null;
    }

    /**
     * 根据用户id获得信息
     *
     * @param userId 用户id
     * @return 返回一个用户实体信息
     */
    @Override
    public BaseResult<UserInfoVO> getUserInfoById(Long userId) {
        return null;
    }

    /**
     * 分页查询用户信息
     *
     * @param name     传入一个模糊查询字段name
     * @param pageSize 传入一个单页数量参数
     * @param pageNum  传入一个页码参数
     * @return 返回一个分页查询的结果数据
     */
    @Override
    public BaseResult<PageableData<UserInfoVO>> getUserInfoListByPage(String name, Integer pageSize, Integer pageNum) {
        return null;
    }
}
