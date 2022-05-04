package com.cjr.shoppingmall.coupon.dao;

import com.cjr.shoppingmall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-02 15:09:41
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
