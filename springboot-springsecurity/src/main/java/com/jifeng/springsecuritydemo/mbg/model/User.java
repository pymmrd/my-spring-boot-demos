package com.jifeng.springsecuritydemo.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 用户名
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * 昵称
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * 密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 账号状态（0正常 1停用)
     *
     * @mbggenerated
     */
    private String status;

    /**
     * 邮箱
     *
     * @mbggenerated
     */
    private String email;

    /**
     * 电话
     *
     * @mbggenerated
     */
    private String phonenumber;

    /**
     * 用户性别（0男，1女，2未知)
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * 头像
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * 用户类型（0管理员，1普通用户)
     *
     * @mbggenerated
     */
    private String userType;

    /**
     * 创建人
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
     * 更新人
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
     * 删除标志（0代表未删除，1代表已删除)
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", nickName=").append(nickName);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", email=").append(email);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", sex=").append(sex);
        sb.append(", avatar=").append(avatar);
        sb.append(", userType=").append(userType);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}