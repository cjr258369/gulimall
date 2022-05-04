package com.cjr.shoppingmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjr.common.utils.PageUtils;
import com.cjr.shoppingmall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-02 15:20:10
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

