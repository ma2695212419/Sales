package com.example.sales.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * configuring_single
 * @author 
 */
@Data
public class ConfiguringSingle implements Serializable {
    /**
     * 报价单编号
     */
    private String cid;

    /**
     * 售前人员
     */
    private String uid;

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
    private Integer uphone;

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
    private Integer cphone;

    /**
     * 客户邮件
     */
    private String cmail;

    /**
     * 报价日期
     */
    private Date saleDate;

    private static final long serialVersionUID = 1L;
}