package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;

/**
 * @author HailongZeng
 * @date 1/4/20 3:24 下午
 */
public interface FavoriteDao {

    /**
     * 根据rid和uid查询收藏信息
     * @param rid
     * @param uid
     * @return
     */
    public Favorite findByRidAndUid(int rid, int uid);

    /**
     * 根据rid查询被收藏次数
     * @param rid
     * @return
     */
    public int findCountByRid(int rid);

    /**
     * 给tab_favorite添加一条数据
     * @param rid
     * @param uid
     */
    public void add(int rid, int uid);

    /**
     * 给tab_favorite取消一条数据
     * @param rid
     * @param uid
     */
    public void del(int rid, int uid);
}
