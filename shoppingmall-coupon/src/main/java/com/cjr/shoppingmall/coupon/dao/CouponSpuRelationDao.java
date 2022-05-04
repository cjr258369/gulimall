package com.cjr.shoppingmall.coupon.dao;

import com.cjr.shoppingmall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-02 15:09:42
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
