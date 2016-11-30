package com.topcheer.restful.framework.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.topcheer.restful.framework.dao.IDao;
import com.topcheer.restful.framework.dto.BaseDto;

public class BaseService {

	@Autowired
	protected IDao baseDao;
	
	
	public int insert4Object(String sqlid, BaseDto value) {
		return baseDao.insert(sqlid, value);
	}

	public int insert4Map(String sqlid, Map<String, Object> value) {
		return baseDao.insert(sqlid, value);
	}

	public <T extends BaseDto>T selectObject(String sqlId, T param) {
		return baseDao.selectObject(sqlId, param);
	}

	public  void del4Object(String sqlId, BaseDto param) {
		baseDao.del(sqlId, param);

	}

	public void del4Map(String sqlId, Map<String, Object> param) {
		baseDao.del(sqlId, param);

	}

	public int selectInt4Object(String sqlId, BaseDto param) {
		return baseDao.selectInt(sqlId, param);
	}

	public  String selectString4Object(String sqlId, BaseDto param) {
		return baseDao.selectString(sqlId, param);
	}

	public String selectString4Map(String sqlId, Map<String, Object> param) {
		return baseDao.selectString(sqlId, param);
	}

	public <T extends BaseDto> void update4Object(String sqlId, T param) {
		baseDao.update(sqlId, param);

	}

	public void update4Map(String sqlId, Map<String, Object> param) {
		baseDao.update(sqlId, param);

	}

	public int selectInt4Map(String sqlId,  Map<String,Object> param) {
		return baseDao.selectInt(sqlId, param);
	}

	public List<Map<String, Object>> selectListMap(String sqlid,
			Map<String, Object> para) {
		return baseDao.selectListMap(sqlid, para);
	}

	public  <T extends BaseDto> List<T> selectListObject(String sqlid, T para) {
		return baseDao.selectListObject(sqlid, para);
	}

	public Map<String, Object> selectMap(String sqlId, Map<String, Object> param) {
		return baseDao.selectMap(sqlId, param);
	}
}
