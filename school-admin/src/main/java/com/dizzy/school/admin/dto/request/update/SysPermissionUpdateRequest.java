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
public class SysPermissionUpdateRequest {

    @NotNull(message = "id不能为空")
    private Long id;

    @Size(max = 100, message = "权限名称长度不能超过100")
    private String name;

    @Size(max = 100, message = "权限编码长度不能超过100")
    private String code;

    @Size(max = 255, message = "权限描述长度不能超过255")
    private String description;

    @Min(value = 0, message = "权限类型必须为0或1")
    @Max(value = 1, message = "权限类型必须为0或1")
    private Byte isValid;

    @Min(value = 0, message = "是否删除必须为0或1")
    @Max(value = 1, message = "是否删除必须为0或1")
    private Byte isDeleted;
}
