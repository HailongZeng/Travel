package cn.itcast.travel.service;

/**
 * @author HailongZeng
 * @date 1/4/20 3:22 下午
 */
public interface FavoriteService {

    /**
     * 判断用户uid是否收藏线路rid
     * @param rid
     * @param uid
     * @return
     */
    public boolean isFavorite(String rid, int uid);

    /**
     * 给用户uid添加收藏线路rid
     * @param rid
     * @param uid
     */
    public void addFavorite(String rid, int uid);

    /**
     * 给用户uid取消收藏线路rid
     * @param rid
     * @param uid
     */
    public void delFavorite(String rid, int uid);
}
