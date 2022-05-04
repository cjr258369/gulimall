package com.cjr.shoppingmall.order.dao;

import com.cjr.shoppingmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-03 00:07:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
