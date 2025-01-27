package com.dizzy.school.admin.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dizzy.school.admin.dto.request.insert.SysRoleInsertRequest;
import com.dizzy.school.admin.dto.request.page.SysRolePageRequest;
import com.dizzy.school.admin.dto.request.update.SysRoleUpdateRequest;
import com.dizzy.school.admin.entity.SysRole;
import com.dizzy.school.admin.mapper.SysRoleMapper;
import com.dizzy.school.admin.service.ISysRoleService;

@Primary
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

    @Override
    public Integer insertRole(SysRoleInsertRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertRole'");
    }

    @Override
    public Integer deleteRole(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteRole'");
    }

    @Override
    public Integer updateRole(SysRoleUpdateRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateRole'");
    }

    @Override
    public IPage<SysRole> selectRolePage(Page<SysRole> pagination, SysRolePageRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectRolePage'");
    }
    
}
