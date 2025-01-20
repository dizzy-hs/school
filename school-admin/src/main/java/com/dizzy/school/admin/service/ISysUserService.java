package com.dizzy.school.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dizzy.school.admin.entity.SysUser;
import com.dizzy.school.admin.dto.request.insert.SysUserInsertRequest;
import com.dizzy.school.admin.dto.request.page.SysUserPageRequest;
import com.dizzy.school.admin.dto.request.update.SysUserUpdateRequest;

public interface ISysUserService {
    Integer insertUser(SysUserInsertRequest request);
    Integer deleteUser(Integer id);
    Integer updateUser(SysUserUpdateRequest request);
    IPage<SysUser> selectUserPage(Page<SysUser> pagination, SysUserPageRequest request);
}
