package com.xmg.p2p.base.mapper;

import com.xmg.p2p.base.domain.RealAuth;
import java.util.List;

public interface RealAuthMapper {

    int insert(RealAuth record);

    RealAuth selectByPrimaryKey(Long id);

    int updateByPrimaryKey(RealAuth record);
}