package com.ztj.tourist.service.impl;

import com.ztj.tourist.dao.domain.Diary;
import com.ztj.tourist.dao.mapper.DiaryMapper;
import com.ztj.tourist.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 9:46
 * @description :
 * @modified : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 9:46
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Resource
    private DiaryMapper diaryMapper;

    @Override
    public void getS() {

        List<Diary> diaryList =  diaryMapper.selectByExample(null);
    }
}
