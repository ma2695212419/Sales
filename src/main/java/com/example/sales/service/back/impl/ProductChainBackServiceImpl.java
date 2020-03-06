package com.example.sales.service.back.impl;

import com.example.sales.dao.ProductChainDao;
import com.example.sales.model.entity.ProductChain;
import com.example.sales.service.back.ProductChainBackService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/5 15:17
 * @package com.example.sales.service.back
 */
@Service
public class ProductChainBackServiceImpl implements ProductChainBackService {

    @Resource
    private ProductChainDao productChainDao;


    @Override
    public List<ProductChain> getChain() {
        return productChainDao.getProductChains();
    }

    @Override
    @Transactional
    public boolean addProductChain(ProductChain productChain) {
        int insert = productChainDao.insert(productChain);
        if (insert>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delProductChain(Integer pcid) {
        int delete = productChainDao.deleteByPrimaryKey(pcid);
        if (delete>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean updProductChain(ProductChain productChain) {
        int update = productChainDao.updateByPrimaryKeySelective(productChain);
        if (update>0){
            return true;
        }
        return false;
    }
}
