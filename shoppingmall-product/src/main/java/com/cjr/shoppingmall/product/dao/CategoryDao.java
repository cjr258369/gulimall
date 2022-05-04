package com.cjr.shoppingmall.product.dao;

import com.cjr.shoppingmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-01 23:54:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
