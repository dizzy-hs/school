-- MySQL8.0

-- 创建数据库用户 school, 密码为 school123456
-- CREATE USER'school'@'localhost' IDENTIFIED BY'school123456';

-- 授权用户 school 对数据库 school 的所有权限
-- GRANT ALL PRIVILEGES ON school.* TO'school'@'localhost';

-- 刷新权限
-- FLUSH PRIVILEGES;

-- 创建数据库
-- DROP DATABASE IF EXISTS school;
-- CREATE DATABASE school DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

-- 使用数据库
-- USE school;

-- 创建用户表
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` BIGINT PRIMARY NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` VARCHAR(50) NOT NULL COMMENT '用户名',
  `password` VARCHAR(255) NOT NULL COMMENT '密码',
  `is_valid` TINYINT NOT NULL DEFAULT 1 COMMENT '是否有效; 1: 有效, 0: 无效',
  `created_at` DATETIME NOT NULL COMMENT '创建时间',
  `updated_at` DATETIME NOT NULL COMMENT '更新时间',
  `is_deleted` TINYINT NOT NULL DEFAULT 0 COMMENT '是否删除; 1: 删除, 0: 未删除',
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户表';
INSERT INTO `sys_user` (`username`, `password`, `is_valid`, `created_at`, `updated_at`, `is_deleted`) VALUES ("admin", "admin123456", 1, now(), now(), 0);

-- 创建角色表
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` BIGINT PRIMARY NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` VARCHAR(100) NOT NULL COMMENT '角色名称',
  `code` VARCHAR(100) NOT NULL COMMENT '角色编码',
  `description` VARCHAR(255) COMMENT '角色描述',
  `is_valid` TINYINT NOT NULL DEFAULT 1 COMMENT '是否有效; 1: 有效, 0: 无效',
  `created_at` DATETIME NOT NULL COMMENT '创建时间',
  `updated_at` DATETIME NOT NULL COMMENT '更新时间',
  `is_deleted` TINYINT NOT NULL DEFAULT 0 COMMENT '是否删除; 1: 删除, 0: 未删除',
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='角色表';
INSERT INTO `sys_role` (`name`, `code`, `description`, `is_valid`, `created_at`, `updated_at`, `is_deleted`) VALUES ("超级管理员", "super_admin", "超级管理员", 1, now(), now(), 0);

-- 创建权限表
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` BIGINT PRIMARY NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` VARCHAR(100) NOT NULL COMMENT '权限名称',
  `code` VARCHAR(100) NOT NULL COMMENT '权限编码',
  `description` VARCHAR(255) COMMENT '权限描述',
  `is_valid` TINYINT NOT NULL DEFAULT 1 COMMENT '是否有效; 1: 有效, 0: 无效',
  `created_at` DATETIME NOT NULL COMMENT '创建时间',
  `updated_at` DATETIME NOT NULL COMMENT '更新时间',
  `is_deleted` TINYINT NOT NULL DEFAULT 0 COMMENT '是否删除; 1: 删除, 0: 未删除',
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='权限表';

-- 创建用户角色关系表
DROP TABLE IF EXISTS `sys_user_role_mapping`;
CREATE TABLE `sys_user_role_mapping` (
  `id` BIGINT PRIMARY NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` BIGINT NOT NULL COMMENT '用户ID',
  `role_id` BIGINT NOT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户角色关系表';

-- 创建角色权限关系表
DROP TABLE IF EXISTS `sys_role_permission_mapping`;
CREATE TABLE `sys_role_permission_mapping` (
  `id` BIGINT PRIMARY NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` BIGINT NOT NULL COMMENT '角色ID',
  `permission_id` BIGINT NOT NULL COMMENT '权限ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='角色权限关系表';
