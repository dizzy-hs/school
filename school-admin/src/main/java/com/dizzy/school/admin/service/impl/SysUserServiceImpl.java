package com.dizzy.school.admin.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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
        SysUser user = new SysUser();
        BeanUtils.copyProperties(request, user);
        return this.baseMapper.insert(user);
    }

    @Override
    public Integer deleteUser(Long id) {
        return this.baseMapper.deleteById(id);
    }

    @Override
    public Integer updateUser(SysUserUpdateRequest request) {
        SysUser user = new SysUser();
        BeanUtils.copyProperties(request, user);
        return this.baseMapper.updateById(user);
    }

    @Override
    public IPage<SysUser> selectUserPage(SysUserPageRequest request) {
        Page<SysUser> pageable = new Page<>(request.getPage(), request.getSize());
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        return this.baseMapper.selectPage(pageable, queryWrapper);
    }
}
