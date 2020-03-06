package com.example.sales.service.back.impl;

import com.example.sales.dao.AccessoriesDao;
import com.example.sales.model.entity.Accessories;
import com.example.sales.service.back.ProductAccessoriesBackService;
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
public class ProductAccessoriesBackServiceImpl implements ProductAccessoriesBackService {

    @Resource
    private AccessoriesDao accessoriesDao;


    @Override
    public List<Accessories> getAccessories() {
        return accessoriesDao.getAccessories();
    }

    @Override
    @Transactional
    public boolean addAccessories(Accessories productNumber) {
        int insert = accessoriesDao.insert(productNumber);
        if (insert>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delAccessories(Integer aid) {
        int delete = accessoriesDao.deleteByPrimaryKey(aid);
        if (delete>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean updAccessories(Accessories productNumber) {
        int update = accessoriesDao.updateByPrimaryKeySelective(productNumber);
        if (update>0){
            return true;
        }
        return false;
    }
}
