package com.maple.bird.mergecrawler.seek;

import com.maple.bird.mergecrawler.enumeration.SeekType;

import java.util.ArrayList;

/**
 *
 * 功能描述:探寻接口
 * @auther: ZhiliHuang
 * @date: 2018/5/24 21:08
 */
public interface Seek<T> {

    /**
     *
     * 功能描述: 探寻数据
     *
     * @param:
     * @return:
     * @auther: ZhiliHuang
     * @date: 2018/5/24 21:46
     */
    public <T> T seeking(int count, SeekType type);

    /**
     *
     * 功能描述:网站验证
     *
     * @param:
     * @return:
     * @auther: ZhiliHuang
     * @date: 2018/5/24 21:46
     */
    public boolean validate();


}
