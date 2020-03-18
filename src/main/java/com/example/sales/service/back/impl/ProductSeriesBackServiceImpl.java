package com.example.sales.service.back.impl;

import com.example.sales.dao.ProductSeriesDao;
import com.example.sales.model.entity.ProductSeries;
import com.example.sales.model.vo.ProductSeriesVo;
import com.example.sales.service.back.ProductSeriesBackService;
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
public class ProductSeriesBackServiceImpl implements ProductSeriesBackService {

    @Resource
    private ProductSeriesDao productSeriesDao;


    @Override
    public List<ProductSeriesVo> getProductSeries() {
        return productSeriesDao.getProductSeries();
    }

    @Override
    @Transactional
    public boolean addProductSeries(ProductSeries productSeries) {
        int insert = productSeriesDao.insert(productSeries);
        if (insert>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delProductSeries(Integer psid) {
        int delete = productSeriesDao.deleteByPrimaryKey(psid);
        if (delete>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean updProductSeries(ProductSeries productSeries) {
        int update = productSeriesDao.updateByPrimaryKeySelective(productSeries);
        if (update>0){
            return true;
        }
        return false;
    }
}
