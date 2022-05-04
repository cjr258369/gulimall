package com.cjr.shoppingmall.order.dao;

import com.cjr.shoppingmall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-03 00:07:41
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
