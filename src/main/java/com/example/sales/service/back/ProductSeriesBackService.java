package com.example.sales.service.back;

import com.example.sales.model.entity.ProductSeries;
import com.example.sales.model.vo.ProductSeriesVo;

import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/5 15:18
 * @package com.example.sales.service.back
 */
public interface ProductSeriesBackService {

    List<ProductSeriesVo> getProductSeries();

    boolean addProductSeries(ProductSeries productSeries);

    boolean delProductSeries(Integer psid);

    boolean updProductSeries(ProductSeries productSeries);
}
