package com.dizzy.school.admin.dto.request.page;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserPageRequest {

    @Size(max = 100, message = "用户名长度不能超过100")
    private String username;

    @Min(value = 0, message = "用户状态必须为0或1")
    @Max(value = 1, message = "用户状态必须为0或1")
    private Boolean isValid;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAtBegin;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAtEnd;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAtBegin;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAtEnd;

    @Min(value = 0, message = "是否删除必须为0或1")
    @Max(value = 1, message = "是否删除必须为0或1")
    private Boolean isDeleted;

    Integer page;
    Integer size;
}
