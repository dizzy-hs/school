package com.dizzy.school.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dizzy.school.admin.dto.request.insert.SysPermissionInsertRequest;
import com.dizzy.school.admin.dto.request.page.SysPermissionPageRequest;
import com.dizzy.school.admin.dto.request.update.SysPermissionUpdateRequest;
import com.dizzy.school.admin.entity.SysPermission;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface ISysPermissionService {
    Integer insertPermission(SysPermissionInsertRequest request);
    Integer deletePermission(Integer id);
    Integer updatePermission(SysPermissionUpdateRequest request);
    IPage<SysPermission> selectPermissionPage(Page<SysPermission> pagination, SysPermissionPageRequest request);
}
