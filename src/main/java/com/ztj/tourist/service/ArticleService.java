package com.ztj.tourist.service;

import com.github.pagehelper.PageInfo;
import com.ztj.tourist.dao.domain.Diary;
import com.ztj.tourist.entity.QO.ArticleDetailQO;
import com.ztj.tourist.entity.QO.ArticleQO;

/**
 * @author : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 10:10
 * @description : 文章相关的东西
 * @modified : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 10:10
 */
public interface ArticleService {

    /**
     * 按照查询条件搜索文章
     * @param articleQO
     * @return
     */
    PageInfo<Diary> listArticle(ArticleQO articleQO);

    /**
     * 查询具体文章
     * @param articleQO
     * @return
     */
    Diary getArticle(ArticleDetailQO articleQO);
}
