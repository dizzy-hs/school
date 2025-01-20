package com.dizzy.school.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dizzy.school.admin.dto.request.insert.SysRoleInsertRequest;
import com.dizzy.school.admin.dto.request.page.SysRolePageRequest;
import com.dizzy.school.admin.dto.request.update.SysRoleUpdateRequest;
import com.dizzy.school.admin.entity.SysRole;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface ISysRoleService {
    Integer insertRole(SysRoleInsertRequest request);
    Integer deleteRole(Integer id);
    Integer updateRole(SysRoleUpdateRequest request);
    IPage<SysRole> selectRolePage(Page<SysRole> pagination, SysRolePageRequest request);
}
