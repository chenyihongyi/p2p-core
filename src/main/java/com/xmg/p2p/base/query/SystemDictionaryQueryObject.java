package com.xmg.p2p.base.query;

import org.springframework.util.StringUtils;

/**
 * 数据字典查询对象
 * @Author Elvis Chen
 * @Date 2018/12/29 14:14
 * @Version 1.0
 **/
public class SystemDictionaryQueryObject extends QueryObject{

    private String keyword;

    private Long parentId;

    public String getKeyword(){
         return StringUtils.hasLength(keyword) ? keyword : null;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
