package com.example.sales.service.back;

import com.example.sales.model.entity.Accessories;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/5 15:18
 * @package com.example.sales.service.back
 */
public interface ProductAccessoriesBackService {

    List<Accessories> getAccessories();

    boolean addAccessories(Accessories accessories);

    boolean delAccessories(Integer aid);

    boolean updAccessories(Accessories accessories);
}
