package com.xmg.p2p.base.mapper;

import com.xmg.p2p.base.domain.SystemDictionaryItem;

public interface SystemDictionaryItemMapper {

    int insert(SystemDictionaryItem record);

    SystemDictionaryItem selectByPrimaryKey(Long id);

    int updateByPrimaryKey(SystemDictionaryItem record);
}