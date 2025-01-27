package com.dizzy.school.admin.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dizzy.school.admin.dto.request.insert.SysPermissionInsertRequest;
import com.dizzy.school.admin.dto.request.page.SysPermissionPageRequest;
import com.dizzy.school.admin.dto.request.update.SysPermissionUpdateRequest;
import com.dizzy.school.admin.entity.SysPermission;
import com.dizzy.school.admin.mapper.SysPermissionMapper;
import com.dizzy.school.admin.service.ISysPermissionService;

@Primary
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements ISysPermissionService {

    @Override
    public Integer insertPermission(SysPermissionInsertRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPermission'");
    }

    @Override
    public Integer deletePermission(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePermission'");
    }

    @Override
    public Integer updatePermission(SysPermissionUpdateRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePermission'");
    }

    @Override
    public IPage<SysPermission> selectPermissionPage(Page<SysPermission> pagination, SysPermissionPageRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectPermissionPage'");
    }
    
}
