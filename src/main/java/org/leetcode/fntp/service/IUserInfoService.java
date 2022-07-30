package org.leetcode.fntp.service;

import org.leetcode.fntp.dto.UserInfoDTO;
import org.leetcode.fntp.model.BaseResult;
import org.leetcode.fntp.model.PageableData;
import org.leetcode.fntp.vo.UserInfoVO;
import java.util.List;

/**
 * @author fntp
 * @description TODO
 * @date 2022/7/30 18:17
 */
public interface IUserInfoService {
    /**
     * 插入用户信息
     * @param userInfoDTO 传入一个用户实体信息
     * @return 返回一个插入结果
     */
    BaseResult<Boolean>  addUserInfo(UserInfoDTO userInfoDTO);

    /**
     * 批量新增用户数据
     * @param userInfoDTOList 用户信息集合
     * @return 返回一个批量新增的结果
     */
    BaseResult<Boolean> addUserInfoList(List<UserInfoDTO> userInfoDTOList);

    /**
     * 删除用户信息
     * @param userId 传入一个用户id
     * @return 返回一个用户信息
     */
    BaseResult<Boolean> deleteUserInfo(Long userId);

    /**
     * 批量删除用户信息
     * @param userIdList 传入一个用户id集合
     * @return 返回一个批量删除用户信息的结果
     */
    BaseResult<Boolean> deleteList(List<Long> userIdList);

    /**
     * 更新用户信息
     * @param userInfoDTO 传入一个用户信息实体VO
     * @return 返回一个更新结果
     */
    BaseResult<Boolean> updateByUserId(UserInfoDTO userInfoDTO);

    /**
     * 根据用户id获得信息
     * @param userId 用户id
     * @return 返回一个用户实体信息
     */
    BaseResult<UserInfoVO> getUserInfoById(Long userId);

    /**
     * 分页查询用户信息
     * @param name 传入一个模糊查询字段name
     * @param pageSize 传入一个单页数量参数
     * @param pageNum 传入一个页码参数
     * @return 返回一个分页查询的结果数据
     */
    BaseResult<PageableData<UserInfoVO>> getUserInfoListByPage(String name, Integer pageSize, Integer pageNum);

}
