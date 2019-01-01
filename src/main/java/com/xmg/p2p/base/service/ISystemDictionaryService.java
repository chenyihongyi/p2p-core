package com.xmg.p2p.base.service;

import com.xmg.p2p.base.domain.SystemDictionary;
import com.xmg.p2p.base.domain.SystemDictionaryItem;
import com.xmg.p2p.base.query.PageResult;
import com.xmg.p2p.base.query.SystemDictionaryQueryObject;

import java.util.List;

/**
 * 数据字典相关服务
 * @Author Elvis Chen
 * @Date 2018/12/29 14:53
 * @Version 1.0
 **/
public interface ISystemDictionaryService {

    /**
     * 数据字典分类分页查询
     * @param qo
     * @return
     */
    PageResult queryDics(SystemDictionaryQueryObject qo);

	/**
	 * 修改或保存数据字典分类
	 * @param dictionary
	 */
	void saveOrUpdateDic(SystemDictionary dictionary);

	/**
	 * 数据字典明细的分页查询
	 * @param qo
	 * @return
	 */
	PageResult queryItems(SystemDictionaryQueryObject qo);

	/**
	 * 查询所有的数据字典明细
	 * @return
	 */
	List<SystemDictionary> listAllDics();

	/**
	 * 修改或者保存数据字典明细
	 * @param item
	 */
    void saveOrUpdateItem(SystemDictionaryItem item);
}
