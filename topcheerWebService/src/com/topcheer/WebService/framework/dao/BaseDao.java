package com.topcheer.WebService.framework.dao;

import java.util.List;
import org.apache.poi.ss.formula.functions.T;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.topcheer.WebService.framework.dto.BaseDto;

@SuppressWarnings("hiding")
public class BaseDao extends SqlSessionDaoSupport {

	public <T extends BaseDto> List<T> selectListBySqlId(String sqlid,
			Object para) {
		return this.getSqlSession().selectList(sqlid, para);
	}

	public int insertBySqlId(String sqlid, Object value) {
		return this.getSqlSession().insert(sqlid, value);
	}

	public <T extends BaseDto> T selectObjectBySqlId(String sqlId, Object param) {
		return this.getSqlSession().selectOne(sqlId, param);
	}

	public String selectStringBySqlId(String sqlId, Object param) {
		return this.getSqlSession().selectOne(sqlId, param);
	}

	public int selectIntBySqlId(String sqlId, Object param) {
		return this.getSqlSession().selectOne(sqlId, param);
	}

	public void updateBySqlId(String sqlId,Object param){
		this.getSqlSession().update(sqlId, param);
	}
	
	public void delBySqlId(String sqlId,Object param){
		this.getSqlSession().delete(sqlId, param);
	}
	
}
