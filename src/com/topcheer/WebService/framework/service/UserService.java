package com.topcheer.WebService.framework.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.topcheer.WebService.framework.dao.BaseDao;
import com.topcheer.WebService.framework.dto.User;

@Service("userService")
public class UserService {

	@Autowired
	private BaseDao baseDao;
	
	public List<User> getUserList(){
		return baseDao.selectListBySqlId("topcheer.getUserList", null);
	}
	
	public void insertUser(User user){
		baseDao.insertBySqlId("topcheer.insertUser", user);
	}
	
	public void updateUser(User user){
		baseDao.updateBySqlId("topcheer.updateUser", user);
	}
	
	public void delUser(User user){
		baseDao.delBySqlId("topcheer.delUser", user);
	}
	
	public User getUserInfo(User user){
		return baseDao.selectObjectBySqlId("topcheer.queryUser", user);
	}
}
