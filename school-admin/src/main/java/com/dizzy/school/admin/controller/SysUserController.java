package com.dizzy.school.admin.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dizzy.school.admin.service.ISysUserService;

import cn.hutool.extra.tokenizer.Result;

@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    
    private final ISysUserService sysUserService;

    public SysUserController(@Qualifier("sysUserService") ISysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

}
