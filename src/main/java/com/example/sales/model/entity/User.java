package com.example.sales.model.entity;

import java.io.Serializable;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    /**
     * 用户账号
     */
    private String uid;

    /**
     * 用户名称
     */
    private String uname;

    /**
     * 密码
     */
    private String upassword;

    /**
     * 性别0 为女 1为男
     */
    private Integer ugender;

    /**
     * 用户权限0为管理员1为售前
     */
    private Integer identity;

    /**
     * 用户状态 0为离职 1 为正常
     */
    private Integer ustatus;

    /**
     * 联系电话
     */
    private Integer uphone;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public Integer getUgender() {
        return ugender;
    }

    public void setUgender(Integer ugender) {
        this.ugender = ugender;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    public Integer getUphone() {
        return uphone;
    }

    public void setUphone(Integer uphone) {
        this.uphone = uphone;
    }
}