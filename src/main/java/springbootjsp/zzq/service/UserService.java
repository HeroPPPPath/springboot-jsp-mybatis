package springbootjsp.zzq.service;

import java.util.List;

import springbootjsp.zzq.entity.User;
public interface UserService {

	public boolean addUser(User user);

	public User getUser(int id);

	public List<User> getUsers();
}

