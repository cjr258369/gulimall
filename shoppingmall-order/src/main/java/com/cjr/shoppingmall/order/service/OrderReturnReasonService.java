package com.cjr.shoppingmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjr.common.utils.PageUtils;
import com.cjr.shoppingmall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-03 00:07:41
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

