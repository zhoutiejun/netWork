package com.ztj.tourist.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ztj.tourist.dao.domain.Diary;
import com.ztj.tourist.dao.domain.DiaryExample;
import com.ztj.tourist.dao.mapper.DiaryMapper;
import com.ztj.tourist.entity.QO.ArticleDetailQO;
import com.ztj.tourist.entity.QO.ArticleQO;
import com.ztj.tourist.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 10:12
 * @description :
 * @modified : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 10:12
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private DiaryMapper diaryMapper;

    @Override
    public PageInfo<Diary> listArticle(ArticleQO articleQO) {
        DiaryExample diaryExample = new DiaryExample();
        diaryExample.createCriteria().andTypeEqualTo(articleQO.getType());
        diaryExample.setOrderByClause(" create_time desc ");
        PageHelper.startPage(articleQO.getPageNum(),articleQO.getPageSize());
        List<Diary> diaryList = diaryMapper.selectByExample(diaryExample);
        PageInfo<Diary> pageInfo = new PageInfo<Diary>(diaryList);
        return pageInfo;
    }

    @Override
    public Diary getArticle(ArticleDetailQO articleQO) {
        return diaryMapper.selectByPrimaryKey(articleQO.getId());
    }
}
