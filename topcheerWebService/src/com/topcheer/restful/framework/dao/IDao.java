package com.topcheer.restful.framework.dao;

import java.util.List;
import java.util.Map;

import com.topcheer.restful.framework.dto.BaseDto;

public interface IDao {
	
	/**
	 * 根据条件获取数据列表
	 * @param <T> 继承于BaseDto的数据封装类型
	 * @param sqlid SqlId
	 * @param para 条件
	 * @return 获取的数据列表
	 */
	public <T extends BaseDto> List<T> selectListObject(String sqlid,
			T para);
	
	/**
	 * 根据条件获取数据列表
	 * @param sqlid SqlId
	 * @param para 条件
	 * @return 获取的数据列表Map
	 */
	public List<Map<String,Object>> selectListMap(String sqlid,
			Map<String,Object> para);
	
	/***
	 * 插入数据
	 * @param <T> 继承于BaseDto的用户封装类
 	 * @param sqlid sqlid
	 * @param value 插入数据
	 * @return 响应行数
	 */
	public <T extends BaseDto> int insert(String sqlid, T value);
	
	/***
	 * 插入数据
	 * @param sqlid sqlID
	 * @param value Map类型数据
	 * @return 响应行数
	 */
	public int insert(String sqlid, Map<String,Object> value);

	/***
	 * 根据条件获取单个数据
	 * @param <T> 基础与BastDto的数据类型
	 * @param sqlId SqlID
	 * @param param 条件
	 * @return 用户自定义封装类型的数据
	 */
	public <T extends BaseDto> T selectObject(String sqlId, T param);

	/***
	 * 根据条件取得单个数据
	 * @param sqlId sqlid
	 * @param param 条件
	 * @return map类型的数据
	 */
	public Map<String,Object> selectMap(String sqlId, Map<String,Object> param);
	
	/***
	 * 根据条件获取一个String值，用于获取单条数据的单个属性
	 * @param sqlId sqlId
	 * @param param 条件
	 * @return 返回结果
	 */
	public <T extends BaseDto>String selectString(String sqlId, T param);

	/***
	 * 根据条件查询出一个Int值，用于获取Count等
	 * @param sqlId sqlid
	 * @param param 条件
	 * @return 返回结果
	 */
	public <T extends BaseDto>int selectInt(String sqlId, T param);
	
	/***
	 * 根据条件获取一个String值，用于获取单条数据的单个属性
	 * @param sqlId sqlId
	 * @param param 条件
	 * @return 返回结果
	 */
	public String selectString(String sqlId, Map<String,Object> param);

	/***
	 * 根据条件查询出一个Int值，用于获取Count等
	 * @param sqlId sqlid
	 * @param param 条件
	 * @return 返回结果
	 */
	public int selectInt(String sqlId,  Map<String,Object> param);

	/**
	 * 根据条件更新数据
	 * @param sqlId SqlId
	 * @param param 条件及更新内容
	 */
	public <T extends BaseDto>void update(String sqlId, T param);
	
	/**
	 * 根据条件更新数据
	 * @param sqlId SqlId
	 * @param param 条件及更新内容
	 */
	public void update(String sqlId, Map<String,Object> param);

	/**
	 * 根据条件删除数据
	 * @param sqlId SqlID
	 * @param param 条件数据
	 */
	public <T extends BaseDto>void del(String sqlId, T param);
	
	/**
	 * 根据条件删除数据
	 * @param sqlId SqlID
	 * @param param 条件数据
	 */
	public void del(String sqlId, Map<String,Object> param);
}
