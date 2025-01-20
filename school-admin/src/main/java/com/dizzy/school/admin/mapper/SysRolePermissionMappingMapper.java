package com.dizzy.school.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dizzy.school.admin.dto.request.page.SysRolePageRequest;
import com.dizzy.school.admin.dto.request.page.SysPermissionPageRequest;
import com.dizzy.school.admin.entity.SysRole;
import com.dizzy.school.admin.entity.SysPermission;
import com.dizzy.school.admin.entity.SysRolePermissionMapping;

@Mapper
public interface SysRolePermissionMappingMapper extends BaseMapper<SysRolePermissionMapping> {
    IPage<SysRole> selectRolePageByPermissionId(
        Page<SysRole> pagination,
        @Param("request") SysRolePageRequest req,
        @Param("permissionId") Long permissionId
    );

    IPage<SysPermission> selectPermissionPageByRoleId(
        Page<SysPermission> pagination,
        @Param("request") SysPermissionPageRequest req,
        @Param("roleId") Long roleId
    );
}
