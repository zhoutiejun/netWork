package com.ztj.tourist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhoutiejun@youngyedu.com, 2019/11/20 0020 下午 16:35
 * @description : 相册相关的东西
 * @modified : zhoutiejun@youngyedu.com, 2019/11/20 0020 下午 16:35
 */
@Controller
public class AlbumController {

    @RequestMapping("/album")
    public ModelAndView listAlbum(){
        ModelAndView modelAndView = new ModelAndView("album");
        List<String> albumList = new ArrayList<String>(){{
            add("https://zhouxiwang.oss-cn-beijing.aliyuncs.com/diary/play/2019duanwujie/2019duanwujie_0401.jpg");
            add("https://zhouxiwang.oss-cn-beijing.aliyuncs.com/diary/play/2019qingmingjie/2019qinmingjie_040401.jpg");
            add("https://zhouxiwang.oss-cn-beijing.aliyuncs.com/diary/play/2019qingmingjie/2019qinmingjie_040401.jpg");
            add("https://zhouxiwang.oss-cn-beijing.aliyuncs.com/diary/play/2019qingmingjie/2019qinmingjie_040401.jpg");
            add("https://zhouxiwang.oss-cn-beijing.aliyuncs.com/diary/play/2019qingmingjie/2019qinmingjie_040401.jpg");}};
        modelAndView.addObject("albumList",albumList);
        return modelAndView;
    }
}
