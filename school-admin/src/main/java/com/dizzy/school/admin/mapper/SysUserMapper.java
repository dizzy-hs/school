package com.dizzy.school.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dizzy.school.admin.entity.SysUser;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    
}
