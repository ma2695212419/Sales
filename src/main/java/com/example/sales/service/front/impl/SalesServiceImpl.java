package com.example.sales.service.front.impl;

import com.example.sales.dao.*;
import com.example.sales.model.entity.*;
import com.example.sales.model.vo.AccessoriesList;
import com.example.sales.service.front.SalesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/5 下午 2:16
 */
@Service
public class SalesServiceImpl implements SalesService {

    @Resource
    private UserDao userDao;
    @Resource
    private ProductChainDao productChainDao;
    @Resource
    private ProductTypeDao productTypeDao;
    @Resource
    private ProductSeriesDao productSeriesDao;
    @Resource
    private ProductNumberDao productNumberDao;
    @Resource
    private ConfiguringSingleDao configuringSingleDao;
    @Resource
    private ConfigurationListDao configurationListDao;
    /**
     * 根据账号密码登录
     *
     * @param user
     * @return
     */
    @Override
    public User loginByUserNameAndPassword(User user) {
        User user1 = userDao.loginByUserNameAndPassword(user);
        return user1;
    }

    /**
     * 获取所有产品线
     *
     * @return
     */
    @Override
    public List<ProductChain> getProductChains() {
        List<ProductChain> productChains = productChainDao.getProductChains();
        return productChains;
    }

    /**
     * 根据产品线id获得产品类别
     *
     * @param pcid
     * @return
     */
    @Override
    public List<ProductType> getProductType(Integer pcid) {
        List<ProductType> productTypes = productTypeDao.selectBypcid(pcid);
        return productTypes;
    }

    /**
     * 根据产品类别id获得产品系列
     *
     * @param ptid
     * @return
     */
    @Override
    public List<ProductSeries> getProductSeries(Integer ptid) {
        List<ProductSeries> productSeries = productSeriesDao.selectByptid(ptid);
        return productSeries;
    }

    /**
     * 根据产品系列id获取产品型号
     *
     * @param psid
     * @return
     */
    @Override
    public List<ProductNumber> getProductNumber(Integer psid) {
        List<ProductNumber> productNumbers = productNumberDao.selectBypsid(psid);
        return productNumbers;
    }

    /**
     * 获取历史配置单信息
     *
     * @return
     */
    @Override
    public List<ConfiguringSingle> selectAll() {
        return configuringSingleDao.selectAll();
    }

    /**
     * 获取详细配置单信息
     *
     * @param
     * @return
     */
    @Override
    public List<AccessoriesList> selectInfo() {
        return configurationListDao.selectInfo();
    }
}
