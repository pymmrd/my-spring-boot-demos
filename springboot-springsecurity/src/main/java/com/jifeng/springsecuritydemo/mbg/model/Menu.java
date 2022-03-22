package com.jifeng.springsecuritydemo.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Menu implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 菜单名
     *
     * @mbggenerated
     */
    private String menuName;

    /**
     * 路由表
     *
     * @mbggenerated
     */
    private String path;

    /**
     * 组件路径
     *
     * @mbggenerated
     */
    private String component;

    /**
     * 菜单状态（0显示 1隐藏）
     *
     * @mbggenerated
     */
    private String visible;

    /**
     * 菜单状态 （0正常 1停用）
     *
     * @mbggenerated
     */
    private String status;

    /**
     * 权限标识
     *
     * @mbggenerated
     */
    private String perms;

    /**
     * 菜单图标
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * 创建者
     *
     * @mbggenerated
     */
    private Long createBy;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新者
     *
     * @mbggenerated
     */
    private Long updateBy;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 是否删除（0未删除 1已删除）
     *
     * @mbggenerated
     */
    private Integer delFlag;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", menuName=").append(menuName);
        sb.append(", path=").append(path);
        sb.append(", component=").append(component);
        sb.append(", visible=").append(visible);
        sb.append(", status=").append(status);
        sb.append(", perms=").append(perms);
        sb.append(", icon=").append(icon);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}