package com.example.sales.service.back;

import com.example.sales.model.entity.ProductNumber;
import com.example.sales.model.vo.ProductNumberVo;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/5 15:18
 * @package com.example.sales.service.back
 */
public interface ProductNumberBackService {

    List<ProductNumberVo> getProductNumbers();

    boolean addProductNumber(ProductNumber productNumber);

    boolean delProductNumber(Integer pnid);

    boolean updProductNumber(ProductNumber productNumber);
}
