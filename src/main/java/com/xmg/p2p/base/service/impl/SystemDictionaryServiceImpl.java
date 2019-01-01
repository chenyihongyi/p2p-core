package com.xmg.p2p.base.service.impl;

import com.xmg.p2p.base.domain.SystemDictionary;
import com.xmg.p2p.base.domain.SystemDictionaryItem;
import com.xmg.p2p.base.mapper.SystemDictionaryItemMapper;
import com.xmg.p2p.base.mapper.SystemDictionaryMapper;
import com.xmg.p2p.base.query.PageResult;
import com.xmg.p2p.base.query.SystemDictionaryQueryObject;
import com.xmg.p2p.base.service.ISystemDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Elvis Chen
 * @Date 2018/12/29 14:57
 * @Version 1.0
 **/
@Service
public class SystemDictionaryServiceImpl implements ISystemDictionaryService {

    @Autowired
    private SystemDictionaryMapper systemDictionaryMapper;

    @Autowired
    private SystemDictionaryItemMapper systemDictionaryItemMapper;

    @Override
    public PageResult queryDics(SystemDictionaryQueryObject qo) {
        int count = this.systemDictionaryMapper.queryForCount(qo);
        if(count > 0) {
            List<SystemDictionary> list = this.systemDictionaryMapper.query(qo);
            return new PageResult(list, count, qo.getCurrentPage(),
                    qo.getPageSize());
        }
        return PageResult.empty(qo.getPageSize());
    }

    @Override
    public void saveOrUpdateDic(SystemDictionary dictionary) {
    	if(dictionary.getId() != null) {
    		this.systemDictionaryMapper.updateByPrimaryKey(dictionary);
    	} else {
    		this.systemDictionaryMapper.insert(dictionary);
    	}
    }

    @Override
    public PageResult queryItems(SystemDictionaryQueryObject qo) {
       int count = this.systemDictionaryItemMapper.queryForCount(qo);
       if(count > 0) {
           List<SystemDictionaryItem> list = this.systemDictionaryItemMapper.query(qo);
           return new PageResult(list, count, qo.getCurrentPage(), qo.getPageSize());
       }
        return PageResult.empty(qo.getPageSize());
    }

    @Override
    public List<SystemDictionary> listAllDics() {
        return this.systemDictionaryMapper.selectAll();
    }

	@Override
	public void saveOrUpdateItem(SystemDictionaryItem item) {
		if(item.getId()!=null){
			this.systemDictionaryItemMapper.updateByPrimaryKey(item);
		} else {
			this.systemDictionaryItemMapper.insert(item);
		}
		
	}
}
