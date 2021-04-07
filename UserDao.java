package dzkj.jdbc;

import java.util.List;

public interface UserDao {
	//添加用户
	public int adduser(User user);
	//更新账户
	public int updateUser(User user);
	//删除账户
	public int deleteUser(int id);
	 //查询所有
	public List<User> finallAllUsers();
	
}
