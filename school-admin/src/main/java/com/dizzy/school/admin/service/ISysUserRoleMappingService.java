package com.dizzy.school.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dizzy.school.admin.entity.SysUserRoleMapping;
import com.dizzy.school.admin.dto.request.page.SysUserPageRequest;
import com.dizzy.school.admin.entity.SysUser;
import com.dizzy.school.admin.dto.request.page.SysRolePageRequest;
import com.dizzy.school.admin.entity.SysRole;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface ISysUserRoleMappingService extends IService<SysUserRoleMapping> {
    IPage<SysUser> selectUserPageByRoleId(Page<SysUser> pagination, SysUserPageRequest request, Long roleId);
    IPage<SysRole> selectRolePageByUserId(Page<SysRole> pagination, SysRolePageRequest request, Long userId);
}
