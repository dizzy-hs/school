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
public class SysPermissionInsertRequest {

    @NotBlank(message = "权限名称不能为空")
    @Size(max = 100, message = "权限名称长度不能超过100")
    private String name;

    @NotBlank(message = "权限代码不能为空")
    @Size(max = 100, message = "权限代码长度不能超过100")
    private String code;

    @NotNull(message = "权限描述不能为空")
    @Size(max = 255, message = "权限描述长度不能超过255")
    private String description;

    @Min(value = 0, message = "是否有效必须为0或1")
    @Max(value = 1, message = "是否有效必须为0或1")
    private Byte isValid;
}
