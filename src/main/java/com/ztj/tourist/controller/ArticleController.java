package com.ztj.tourist.controller;

import com.github.pagehelper.PageInfo;
import com.ztj.tourist.dao.domain.Diary;
import com.ztj.tourist.entity.QO.ArticleDetailQO;
import com.ztj.tourist.entity.QO.ArticleQO;
import com.ztj.tourist.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 10:07
 * @description : 首页文章相关的东西
 * @modified : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 10:07
 */
@RequestMapping("/article")
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 根据类别列举所有文章
     * @param articleQO
     * @return
     */
    @GetMapping(value = "")
    public ModelAndView listArticle(ArticleQO articleQO){
        ModelAndView modelAndView = new ModelAndView("t");
        PageInfo<Diary> diaryListPageInfo =  articleService.listArticle(articleQO);


        List<Diary> diaryList = diaryListPageInfo.getList();
        Diary diary = new Diary();
        diary.setSummaryPicture("https://zhouxiwang.oss-cn-beijing.aliyuncs.com/diary/play/2019qingmingjie/2019qinmingjie_040401.jpg");
        diaryList.stream().forEach(t->t.setSummaryPicture("/img/cp_bg.jpg"));

        diaryList.add(1, diary);
        diaryList.add(3, diary);
        diaryList.add(5, diary);
        diaryList.add(6, diary);
        diaryList.add(7, diary);
        diaryList.add(8, diary);
        diaryList.add(9, diary);
        diaryList.add(10, diary);
        diaryList.add(11, diary);
        diaryList.add(12, diary);
        diaryList.add(13, diary);
        diaryList.add(14, diary);
        diaryList.add(16, diary);
        diaryList.add(17, diary);
        diaryList.add(18, diary);
        diaryList.add(22, diary);

        modelAndView.addObject("articleList", diaryList);
        modelAndView.addObject("currentPage", diaryListPageInfo.getPageNum());
        modelAndView.addObject("totalPage", diaryListPageInfo.getPages());

        return modelAndView;
    }

    @GetMapping(value = "/jump")
    @ResponseBody
    public List<Diary> jumpPage(){

        ArticleQO articleQO = new ArticleQO();
        PageInfo<Diary> diaryListPageInfo =  articleService.listArticle(articleQO);
        List<Diary> diaryList = diaryListPageInfo.getList();
        Diary diary = new Diary();
        diary.setSummaryPicture("https://zhouxiwang.oss-cn-beijing.aliyuncs.com/diary/play/2019qingmingjie/2019qinmingjie_040402.jpg");
        diaryList.stream().forEach(t->t.setSummaryPicture("/img/cp_bg.jpg"));

        diaryList.add(1, diary);
        diaryList.add(3, diary);
        diaryList.add(5, diary);
        diaryList.add(6, diary);
        diaryList.add(7, diary);
        diaryList.add(8, diary);
        diaryList.add(9, diary);
        diaryList.add(10, diary);
        diaryList.add(11, diary);
        diaryList.add(12, diary);
        diaryList.add(13, diary);
        diaryList.add(14, diary);
        diaryList.add(16, diary);
        diaryList.add(17, diary);
        diaryList.add(18, diary);
        diaryList.add(22, diary);

        return diaryList;
    }

    @GetMapping(value = "details")
    public ModelAndView getArticleDetail(ArticleDetailQO articleQO){
        ModelAndView modelAndView = new ModelAndView("details");
        Diary diary =  articleService.getArticle(articleQO);
        modelAndView.addObject("article", diary);
        return modelAndView;
    }

}
