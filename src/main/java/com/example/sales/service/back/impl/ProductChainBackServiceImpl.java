package com.example.sales.service.back.impl;

import com.example.sales.dao.back.ProductChainBackDao;
import com.example.sales.model.entity.ProductChain;
import com.example.sales.service.back.ProductChainBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/5 15:17
 * @package com.example.sales.service.back
 */
@Service
public class ProductChainBackServiceImpl implements ProductChainBackService {

    @Autowired
    private ProductChainBackDao productChainBackDao;


    @Override
    public List<ProductChain> getChain() {
        return productChainBackDao.selectAll();
    }

    @Override
    public boolean addProductChain(ProductChain productChain) {
        int insert = productChainBackDao.insert(productChain);
        if (insert>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delProductChain(Integer pcid) {
        int delete = productChainBackDao.deleteByPrimaryKey(pcid);
        if (delete>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updProductChain(ProductChain productChain) {
        int update = productChainBackDao.updateByPrimaryKeySelective(productChain);
        if (update>0){
            return true;
        }
        return false;
    }
}
