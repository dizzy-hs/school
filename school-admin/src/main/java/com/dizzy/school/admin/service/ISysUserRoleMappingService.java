package com.dizzy.school.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dizzy.school.admin.entity.SysUserRoleMapping;
import com.dizzy.school.admin.dto.request.page.SysUserPageRequest;
import com.dizzy.school.admin.entity.SysUser;
import com.dizzy.school.admin.dto.request.page.SysRolePageRequest;
import com.dizzy.school.admin.entity.SysRole;

import com.baomidou.mybatisplus.core.metadata.IPage;

public interface ISysUserRoleMappingService extends IService<SysUserRoleMapping> {
    IPage<SysUser> selectUserPageByRoleId(SysUserPageRequest request, Long roleId);
    IPage<SysRole> selectRolePageByUserId(SysRolePageRequest request, Long userId);
}
