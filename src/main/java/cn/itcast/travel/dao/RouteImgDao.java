package cn.itcast.travel.dao;

import cn.itcast.travel.domain.RouteImg;

import java.util.List;

/**
 * @author HailongZeng
 * @date 1/4/20 1:49 下午
 */
public interface RouteImgDao {

    /**
     * 根据rid查询线路图片
     * @param rid
     * @return
     */
    public List<RouteImg> findByRid(int rid);
}
