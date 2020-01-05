package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Category;

import java.util.List;

/**
 * @author HailongZeng
 * @date 12/26/19 7:43 下午
 */
public interface CategoryDao {

    public List<Category> findAll();
}
