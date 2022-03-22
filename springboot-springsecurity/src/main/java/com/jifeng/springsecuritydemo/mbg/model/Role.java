package com.jifeng.springsecuritydemo.mbg.model;

import java.io.Serializable;

public class Role implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 角色名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 角色权限字符串
     *
     * @mbggenerated
     */
    private String roleKey;

    /**
     * 角色状态（0正常 1停用）
     *
     * @mbggenerated
     */
    private String status;

    /**
     * 是否删除（0未删除 1已删除）
     *
     * @mbggenerated
     */
    private Integer delFlag;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", roleKey=").append(roleKey);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}