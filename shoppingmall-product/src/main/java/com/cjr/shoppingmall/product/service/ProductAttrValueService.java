package com.cjr.shoppingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjr.common.utils.PageUtils;
import com.cjr.shoppingmall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-01 23:54:18
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

