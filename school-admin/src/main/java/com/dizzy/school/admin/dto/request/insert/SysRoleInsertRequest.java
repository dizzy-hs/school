package com.dizzy.school.admin.dto.request.insert;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleInsertRequest {

    @NotBlank(message = "角色名称不能为空")
    @Size(max = 100, message = "角色名称长度不能超过100")
    private String name;

    @Size(max = 100, message = "角色编码长度不能超过100")
    private String code;

    @Size(max = 255, message = "角色描述长度不能超过200")
    private String description;

    @NotNull(message = "角色状态不能为空")
    @Max(value = 1, message = "角色状态值必须为0或1")
    @Min(value = 0, message = "角色状态值必须为0或1")
    private Byte isValid;
}
