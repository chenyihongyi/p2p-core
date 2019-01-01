package com.xmg.p2p.base.mapper;

import com.xmg.p2p.base.domain.SystemDictionaryItem;
import com.xmg.p2p.base.query.SystemDictionaryQueryObject;

import java.util.List;

public interface SystemDictionaryItemMapper {

    int insert(SystemDictionaryItem record);

    SystemDictionaryItem selectByPrimaryKey(Long id);

    int updateByPrimaryKey(SystemDictionaryItem record);

    /**
     * 分页查询
     * @param qo
     * @return
     */
    int queryForCount(SystemDictionaryQueryObject qo);

    List<SystemDictionaryItem> query(SystemDictionaryQueryObject qo);
}