package com.cjr.shoppingmall.product.dao;

import com.cjr.shoppingmall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-01 23:54:18
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
