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
public class SysUserUpdateRequest {
    @NotNull(message = "id不能为空")
    private Long id;

    @Size(max = 100, message = "用户名长度不能超过100")
    private String username;

    @Size(max = 100, message = "密码长度不能超过100")
    private String password;

    @Min(value = 0, message = "是否有效必须为0或1")
    @Max(value = 1, message = "是否有效必须为0或1")
    private Boolean isValid;

    @Min(value = 0, message = "是否删除必须为0或1")
    @Max(value = 1, message = "是否删除必须为0或1")
    private Boolean isDeleted;
}
