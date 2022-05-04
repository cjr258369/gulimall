package com.cjr.shoppingmall.coupon.dao;

import com.cjr.shoppingmall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-02 15:09:41
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
