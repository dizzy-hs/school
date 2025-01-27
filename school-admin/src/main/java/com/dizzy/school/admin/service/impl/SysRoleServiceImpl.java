package com.dizzy.school.admin.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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
        SysRole sysRole = new SysRole();
        BeanUtils.copyProperties(request, sysRole);
        return this.baseMapper.insert(sysRole);
    }

    @Override
    public Integer deleteRole(Integer id) {
        return this.baseMapper.deleteById(id);
    }

    @Override
    public Integer updateRole(SysRoleUpdateRequest request) {
        SysRole sysRole = new SysRole();
        BeanUtils.copyProperties(request, sysRole);
        return this.baseMapper.updateById(sysRole);
    }

    @Override
    public IPage<SysRole> selectRolePage(SysRolePageRequest request) {
        Page<SysRole> page = new Page<>(request.getPage(), request.getPage());
        LambdaQueryWrapper<SysRole> queryWrapper = new LambdaQueryWrapper<>();
        return this.baseMapper.selectPage(page, queryWrapper);
    }
    
}
