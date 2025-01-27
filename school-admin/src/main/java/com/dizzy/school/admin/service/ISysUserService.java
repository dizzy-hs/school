package com.dizzy.school.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dizzy.school.admin.entity.SysUser;
import com.dizzy.school.admin.dto.request.insert.SysUserInsertRequest;
import com.dizzy.school.admin.dto.request.page.SysUserPageRequest;
import com.dizzy.school.admin.dto.request.update.SysUserUpdateRequest;

public interface ISysUserService extends IService<SysUser> {
    Integer insertUser(SysUserInsertRequest request);
    Integer deleteUser(Long id);
    Integer updateUser(SysUserUpdateRequest request);
    IPage<SysUser> selectUserPage(Page<SysUser> pagination, SysUserPageRequest request);
}
