package com.dizzy.school.admin.dto.request.insert;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserInsertRequest {

    @Size(max = 100, message = "用户名长度不能超过100")
    private String username;

    @Size(max = 100, message = "密码长度不能超过100")
    private String password;

    @Min(value = 0, message = "用户类型必须为0或1")
    @Max(value = 1, message = "用户类型必须为0或1")
    private Boolean isValid;
}
