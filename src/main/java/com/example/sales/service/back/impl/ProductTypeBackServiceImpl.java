package com.example.sales.service.back.impl;

import com.example.sales.dao.ProductTypeDao;
import com.example.sales.model.entity.ProductType;
import com.example.sales.model.vo.ProductTypeVo;
import com.example.sales.service.back.ProductTypeBackService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/5 15:17
 * @package com.example.sales.service.back
 */
@Service
public class ProductTypeBackServiceImpl implements ProductTypeBackService {

    @Resource
    private ProductTypeDao productTypeDao;


    @Override
    public List<ProductTypeVo> getProductTypes() {
        return productTypeDao.getProductTypes();
    }

    @Override
    @Transactional
    public boolean addProductType(ProductType productType) {
        int insert = productTypeDao.insert(productType);
        if (insert>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delProductType(Integer ptid) {
        int delete = productTypeDao.deleteByPrimaryKey(ptid);
        if (delete>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean updProductType(ProductType productType) {
        int update = productTypeDao.updateByPrimaryKeySelective(productType);
        if (update>0){
            return true;
        }
        return false;
    }
}
