package com.cjr.shoppingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjr.common.utils.PageUtils;
import com.cjr.shoppingmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-01 23:54:18
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

