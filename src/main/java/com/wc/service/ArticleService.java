package com.wc.service;

import com.wc.pojo.Article;
import com.wc.pojo.PageBean;

public interface ArticleService {
    //新增文章
    void add(Article article);

    //条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);

    void deleteById(Integer id);

    void update(Article article);

    PageBean<Article> listAll(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
