package com.maple.bird.mergecrawler.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Auther: ZhiliHuang
 * @Date: 2018/5/24 21:27
 * @Description:探寻类型
 */
@Getter
@AllArgsConstructor
public enum SeekType {
    NORMAL(0),//普通
    SORT(1),//按顺序
    SORT_DESC(2),;//按降序

    private int code;


}
