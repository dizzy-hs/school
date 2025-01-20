package com.dizzy.school.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dizzy.school.admin.dto.request.page.SysUserPageRequest;
import com.dizzy.school.admin.dto.request.page.SysRolePageRequest;
import com.dizzy.school.admin.entity.SysRole;
import com.dizzy.school.admin.entity.SysUser;
import com.dizzy.school.admin.entity.SysUserRoleMapping;

@Mapper
public interface SysUserRoleMappingMapper extends BaseMapper<SysUserRoleMapping> {
    IPage<SysUser> selectUserPageByRoleId(
        Page<SysUser> pagination,
        @Param("request") SysUserPageRequest req,
        @Param("roleId") Long roleId
    );

    IPage<SysRole> selectRolePageByUserId(
        Page<SysRole> pagination,
        @Param("request") SysRolePageRequest req,
        @Param("userId") Long userId
    );
}
