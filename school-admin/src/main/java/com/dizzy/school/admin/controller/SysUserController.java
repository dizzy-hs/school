package com.dizzy.school.admin.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dizzy.school.admin.dto.request.insert.SysUserInsertRequest;
import com.dizzy.school.admin.dto.request.page.SysRolePageRequest;
import com.dizzy.school.admin.dto.request.page.SysUserPageRequest;
import com.dizzy.school.admin.dto.request.update.SysUserUpdateRequest;
import com.dizzy.school.admin.service.ISysUserRoleMappingService;
import com.dizzy.school.admin.service.ISysUserService;
import com.dizzy.school.admin.utils.Result;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sys/users")
public class SysUserController {
    
    private final ISysUserService sysUserService;
    private final ISysUserRoleMappingService sysUserRoleMappingService;

    public SysUserController(
        ISysUserService sysUserService,
        ISysUserRoleMappingService sysUserRoleMappingService
    ) {
        this.sysUserService = sysUserService;
        this.sysUserRoleMappingService = sysUserRoleMappingService;
    }

    @PostMapping("")
    public Result insertUser(@RequestBody @Valid SysUserInsertRequest request) {
        return Result.success(sysUserService.insertUser(request));
    }

    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable Long id) {
        return Result.success(sysUserService.deleteUser(id));
    }

    @PutMapping("")
    public Result updateUser(@RequestBody @Valid SysUserUpdateRequest request) {
        return Result.success(sysUserService.updateUser(request));
    }

    @GetMapping("/{id}")
    public Result selectUser(@PathVariable("id") Long id) {
        return Result.success(sysUserService.getById(id));
    }

    @GetMapping("")
    public Result selectUserPage(@ModelAttribute @Valid SysUserPageRequest request) {
        return Result.success(sysUserService.selectUserPage(request));
    }

    @GetMapping("/{id}/roles")
    public Result selectRolePageByUserId(
        @PathVariable("id") Long id,
        @ModelAttribute @Valid SysRolePageRequest request
    ) {
        return Result.success(sysUserRoleMappingService.selectRolePageByUserId(request, id));
    }

}
