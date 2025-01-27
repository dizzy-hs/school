package com.dizzy.school.admin.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dizzy.school.admin.dto.request.page.SysRolePageRequest;
import com.dizzy.school.admin.dto.request.page.SysUserPageRequest;
import com.dizzy.school.admin.entity.SysRole;
import com.dizzy.school.admin.entity.SysUser;
import com.dizzy.school.admin.entity.SysUserRoleMapping;
import com.dizzy.school.admin.mapper.SysUserRoleMappingMapper;
import com.dizzy.school.admin.service.ISysUserRoleMappingService;

@Primary
@Service
public class SysUserRoleMappingServiceImpl extends ServiceImpl<SysUserRoleMappingMapper, SysUserRoleMapping> implements ISysUserRoleMappingService {

    @Override
    public IPage<SysUser> selectUserPageByRoleId(SysUserPageRequest request, Long roleId) {
        Page<SysUser> pagination = new Page<>(request.getPage(), request.getSize());
        return this.baseMapper.selectUserPageByRoleId(pagination, request, roleId);
    }

    @Override
    public IPage<SysRole> selectRolePageByUserId(SysRolePageRequest request, Long userId) {
        Page<SysRole> pagination = new Page<>(request.getPage(), request.getSize());
        return this.baseMapper.selectRolePageByUserId(pagination, request, userId);
    }
    
}
