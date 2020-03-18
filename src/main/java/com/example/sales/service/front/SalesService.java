package com.example.sales.service.front;

import com.example.sales.model.entity.*;
import com.example.sales.model.vo.AccessoriesList;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/5 下午 2:14
 */
public interface SalesService {
    /**
     * 根据账号密码登录
     * @param user
     * @return
     */
    public User loginByUserNameAndPassword(User user);

    /**
     * 获取所有产品线
     * @return
     */
    public List<ProductChain> getProductChains();

    /**
     * 根据产品线id获得产品类别
     * @param pcid
     * @return
     */
    public List<ProductType> getProductType(Integer pcid);

    /**
     * 根据产品类别id获得产品系列
     * @param ptid
     * @return
     */
    public List<ProductSeries> getProductSeries(Integer ptid);

    /**
     * 根据产品系列id获取产品型号
     * @param psid
     * @return
     */
    public List<ProductNumber> getProductNumber(Integer psid);

    /**
     * 获取历史配置单信息
     * @return
     */
    List<ConfiguringSingle> selectAll();

    /**
     * 获取详细配置单信息
     * @param
     * @return
     */
    List<AccessoriesList> selectInfo();

    /**
     * 根据系统sid查询型号
     * @param psid
     * @return
     */
    ProductSeries selectByPrimaryKey(Integer psid);

    /**
     * 根据型号查询基础配置
     * @param psid
     * @return
     */
    List<ProductNumber> selectBypsid(Integer psid);

    /**
     * 查询所有升级配件
     * @return
     */
    List<Accessories> getAccessories();

}
