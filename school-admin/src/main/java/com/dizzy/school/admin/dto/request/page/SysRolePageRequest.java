package com.dizzy.school.admin.dto.request.page;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRolePageRequest {
    @Size(max = 100, message = "角色名称长度不能超过100")
    private String name;

    @Size(max = 100, message = "角色编码长度不能超过100")
    private String code;

    @Size(max = 255, message = "角色描述长度不能超过255")
    private String description;

    @Min(value = 0, message = "角色状态必须为0或1")
    @Max(value = 1, message = "角色状态必须为0或1")
    private Byte isValid;

    private LocalDateTime createdAtBegin;
    private LocalDateTime createdAtEnd;
    private LocalDateTime updatedAtBegin;
    private LocalDateTime updatedAtEnd;

    @Min(value = 0, message = "是否删除必须为0或1")
    @Max(value = 1, message = "是否删除必须为0或1")
    private Byte isDeleted;
}
