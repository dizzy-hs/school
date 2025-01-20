package com.dizzy.school.admin.dto.request.update;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleUpdateRequest {
    @NotNull(message = "id不能为空")
    private Long id;

    @Size(max = 100, message = "角色名称长度不能超过100")
    private String name;

    @Size(max = 100, message = "角色编码长度不能超过100")
    private String code;

    @Size(max = 255, message = "角色描述长度不能超过255")
    private String description;

    @Max(value = 1, message = "角色状态值只能为0或1")
    @Min(value = 0, message = "角色状态值只能为0或1")
    private Byte isValid;

    @Max(value = 1, message = "角色删除状态值只能为0或1")
    @Min(value = 0, message = "角色删除状态值只能为0或1")
    private Byte isDeleted;
}
