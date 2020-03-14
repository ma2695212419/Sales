package com.example.sales.model.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/14 17:28
 * @package com.example.sales.model.vo
 */
public class Configuration implements Serializable {

    /**
     * 报价单编号
     */
    private String cid;

    /**
     * 售前人员
     */
    private String uid;

    /**
     * 售前人员
     */
    private String uname;

    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 联系人,销售人员
     */
    private String ucontactPerson;

    /**
     * 销售人员联系电话
     */
    private String uphone;

    /**
     * 销售人员邮件
     */
    private String umail;

    /**
     * 报价单位
     */
    private String quotationUnit;

    /**
     * 客户联系人
     */
    private String ccontactPerson;

    /**
     * 客户电话
     */
    private String cphone;

    /**
     * 客户邮件
     */
    private String cmail;

    /**
     * 报价日期
     */
    private String saleDate;

    /**
     * 产品清单
     */
    private List<ConfigurationListVo> configurationListsVo;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

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

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getUcontactPerson() {
        return ucontactPerson;
    }

    public void setUcontactPerson(String ucontactPerson) {
        this.ucontactPerson = ucontactPerson;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUmail() {
        return umail;
    }

    public void setUmail(String umail) {
        this.umail = umail;
    }

    public String getQuotationUnit() {
        return quotationUnit;
    }

    public void setQuotationUnit(String quotationUnit) {
        this.quotationUnit = quotationUnit;
    }

    public String getCcontactPerson() {
        return ccontactPerson;
    }

    public void setCcontactPerson(String ccontactPerson) {
        this.ccontactPerson = ccontactPerson;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCmail() {
        return cmail;
    }

    public void setCmail(String cmail) {
        this.cmail = cmail;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public List<ConfigurationListVo> getConfigurationListsVo() {
        return configurationListsVo;
    }

    public void setConfigurationListsVo(List<ConfigurationListVo> configurationListsVo) {
        this.configurationListsVo = configurationListsVo;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "cid='" + cid + '\'' +
                ", uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", clientName='" + clientName + '\'' +
                ", ucontactPerson='" + ucontactPerson + '\'' +
                ", uphone='" + uphone + '\'' +
                ", umail='" + umail + '\'' +
                ", quotationUnit='" + quotationUnit + '\'' +
                ", ccontactPerson='" + ccontactPerson + '\'' +
                ", cphone='" + cphone + '\'' +
                ", cmail='" + cmail + '\'' +
                ", saleDate=" + saleDate +
                ", configurationListsVo=" + configurationListsVo +
                '}';
    }
}
