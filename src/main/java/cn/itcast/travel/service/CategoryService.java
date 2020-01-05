package cn.itcast.travel.service;

import cn.itcast.travel.domain.Category;

import java.util.List;

/**
 * @author HailongZeng
 * @date 12/26/19 7:47 下午
 */
public interface CategoryService {

    public List<Category> findAll();
}
