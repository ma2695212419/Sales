package com.example.sales.model.vo;

import java.util.List;

/**
 * @author 马泽朋
 * @version 1.0
 * @date 2020/3/7 下午 3:11
 */
public class AccessoriesList {


    private String clid;

    private String cid;

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


    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid;
    }

    @Override
    public String toString() {
        return "AccessoriesList{" +
                "cid=" + cid +
                ", accessoriesListVoList=" + accessoriesListVoList +
                '}';
    }
}
