package com.cjr.shoppingmall.member.dao;

import com.cjr.shoppingmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author chenjunran
 * @email chenjunran22@gmail.com
 * @date 2022-05-02 15:20:10
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
