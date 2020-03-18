package com.example.sales.service.back;

import com.example.sales.model.entity.ProductType;
import com.example.sales.model.vo.ProductTypeVo;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/5 15:18
 * @package com.example.sales.service.back
 */
public interface ProductTypeBackService {

    List<ProductTypeVo> getProductTypes();

    boolean addProductType(ProductType productType);

    boolean delProductType(Integer ptid);

    boolean updProductType(ProductType productType);
}
