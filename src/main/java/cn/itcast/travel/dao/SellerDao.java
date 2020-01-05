package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Seller;

/**
 * @author HailongZeng
 * @date 1/4/20 1:49 下午
 */
public interface SellerDao {

    /**
     * 根据sid查询商家信息
     * @param sid
     * @return
     */
    public Seller findBySid(int sid);

}
