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
    public IPage<SysUser> selectUserPageByRoleId(Page<SysUser> pagination, SysUserPageRequest request, Long roleId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectUserPageByRoleId'");
    }

    @Override
    public IPage<SysRole> selectRolePageByUserId(Page<SysRole> pagination, SysRolePageRequest request, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectRolePageByUserId'");
    }
    
}
