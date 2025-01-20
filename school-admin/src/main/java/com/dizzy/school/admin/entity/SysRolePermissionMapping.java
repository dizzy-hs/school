package com.dizzy.school.admin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName(value = "sys_role_permission_mapping")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRolePermissionMapping {

    @TableId(value = "id")
    private Long id;

    @TableField(value = "role_id")
    private Long roleId;

    @TableField(value = "permission_id")
    private Long permissionId;
}
