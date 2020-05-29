package springbootjsp.zzq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springbootjsp.zzq.entity.User;

@Mapper
public interface UserDao {

	/**
	 * 新增用户
	 * 
	 * @param user
	 * @return
	 */
	public boolean addUser(User user);

	/**
	 * 单个查询
	 * 
	 * @param id
	 * @return
	 */
	public User getUser(int id);

	/**
	 * 查询全部
	 * 
	 * @return
	 */
	public List<User> getUsers();
}
