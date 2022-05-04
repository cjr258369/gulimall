package com.cjr.shoppingmall.product.dao;

import com.cjr.shoppingmall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-01 23:54:17
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
