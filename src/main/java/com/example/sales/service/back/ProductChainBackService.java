package com.example.sales.service.back;

import com.example.sales.model.entity.ProductChain;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/5 15:18
 * @package com.example.sales.service.back
 */
public interface ProductChainBackService {

    List<ProductChain> getChain();

    boolean addProductChain(ProductChain productChain);

    boolean delProductChain(Integer pcid);

    boolean updProductChain(ProductChain productChain);
}
