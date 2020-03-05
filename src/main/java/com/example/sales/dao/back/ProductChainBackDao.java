package com.example.sales.dao.back;


import com.example.sales.model.entity.ProductChain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface ProductChainBackDao {

    List<ProductChain> selectAll();

    int deleteByPrimaryKey(Integer pcid);

    int insert(ProductChain productChain);

    int updateByPrimaryKeySelective(ProductChain productChain);

}