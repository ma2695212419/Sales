package com.example.sales.model.vo;

import java.util.List;

/**
 * @author 马泽朋
 * @version 1.0
 * @date 2020/3/7 下午 3:11
 */
public class AccessoriesList {

    private Integer cid;

    List<AccessoriesListVo> accessoriesListVoList;

    private long zongjia;

    public long getZongjia() {
        return zongjia;
    }

    public void setZongjia(long zongjia) {
        this.zongjia = zongjia;
    }

    public List<AccessoriesListVo> getAccessoriesListVoList() {
        return accessoriesListVoList;
    }

    public void setAccessoriesListVoList(List<AccessoriesListVo> accessoriesListVoList) {
        this.accessoriesListVoList = accessoriesListVoList;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "AccessoriesList{" +
                "cid=" + cid +
                ", accessoriesListVoList=" + accessoriesListVoList +
                '}';
    }
}
