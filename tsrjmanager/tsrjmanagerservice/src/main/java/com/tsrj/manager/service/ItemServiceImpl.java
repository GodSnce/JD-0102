package com.tsrj.manager.service;

import com.tsrj.manager.mapper.TbItemMapper;
import com.tsrj.manager.po.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper mapper;

	@Override
	public TbItem queryItemById(Long id) {
		if (id == null) {
			return null;
		}
		return mapper.selectByPrimaryKey(id);
	}

}
