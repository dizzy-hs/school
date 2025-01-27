package com.dizzy.school.admin.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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
        SysPermission sysPermission = new SysPermission();
        BeanUtils.copyProperties(request, sysPermission);
        return baseMapper.insert(sysPermission);
    }

    @Override
    public Integer deletePermission(Integer id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public Integer updatePermission(SysPermissionUpdateRequest request) {
        SysPermission sysPermission = new SysPermission();
        BeanUtils.copyProperties(request, sysPermission);
        return baseMapper.updateById(sysPermission);
    }

    @Override
    public IPage<SysPermission> selectPermissionPage(SysPermissionPageRequest request) {
        Page<SysPermission> pagination = new Page<>(request.getPage(), request.getPage());
        LambdaQueryWrapper<SysPermission> queryWrapper = new LambdaQueryWrapper<>();
        return baseMapper.selectPage(pagination, queryWrapper);
    }
    
}
