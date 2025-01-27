package com.dizzy.school.admin.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dizzy.school.admin.dto.request.insert.SysUserInsertRequest;
import com.dizzy.school.admin.dto.request.page.SysUserPageRequest;
import com.dizzy.school.admin.dto.request.update.SysUserUpdateRequest;
import com.dizzy.school.admin.entity.SysUser;
import com.dizzy.school.admin.mapper.SysUserMapper;
import com.dizzy.school.admin.service.ISysUserService;

@Primary
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public Integer insertUser(SysUserInsertRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertUser'");
    }

    @Override
    public Integer deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public Integer updateUser(SysUserUpdateRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public IPage<SysUser> selectUserPage(Page<SysUser> pagination, SysUserPageRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectUserPage'");
    }
    
}
