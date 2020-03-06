package com.example.sales.service.back.impl;

import com.example.sales.dao.ProductNumberDao;
import com.example.sales.model.entity.ProductNumber;
import com.example.sales.model.vo.ProductNumberVo;
import com.example.sales.service.back.ProductNumberBackService;
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
public class ProductNumberBackServiceImpl implements ProductNumberBackService {

    @Resource
    private ProductNumberDao productNumberDao;


    @Override
    public List<ProductNumberVo> getProductNumbers() {
        return productNumberDao.getProductNumbers();
    }


    @Override
    @Transactional
    public boolean addProductNumber(ProductNumber productNumber) {
        int insert = productNumberDao.insert(productNumber);
        if (insert>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delProductNumber(Integer pnid) {
        int delete = productNumberDao.deleteByPrimaryKey(pnid);
        if (delete>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean updProductNumber(ProductNumber productNumber) {
        int update = productNumberDao.updateByPrimaryKeySelective(productNumber);
        if (update>0){
            return true;
        }
        return false;
    }
}
