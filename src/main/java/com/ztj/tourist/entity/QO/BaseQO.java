package com.ztj.tourist.entity.QO;

/**
 * @author : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 10:19
 * @description :
 * @modified : zhoutiejun@youngyedu.com, 2019/11/20 0020 上午 10:19
 */
public class BaseQO {

    private Integer pageNum = 1;

    private Integer pageSize = 9;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
