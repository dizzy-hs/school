package com.dizzy.school.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dizzy.school.admin.dto.request.page.SysPermissionPageRequest;
import com.dizzy.school.admin.dto.request.page.SysRolePageRequest;
import com.dizzy.school.admin.entity.SysPermission;
import com.dizzy.school.admin.entity.SysRole;
import com.dizzy.school.admin.entity.SysUserRoleMapping;

public interface ISysRolePermissionMappingService extends IService<SysUserRoleMapping> {
    IPage<SysRole> selectRolePageByPermissionId(Page<SysRole> pagination, SysRolePageRequest request, Long permissionId);
    IPage<SysPermission> selectPermissionPageByRoleId(Page<SysPermission> pagination, SysPermissionPageRequest request, Long roleId);
}
