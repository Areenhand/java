package dzkj.jdbc;

import java.util.List;

public interface UserDao {
	//����û�
	public int adduser(User user);
	//�����˻�
	public int updateUser(User user);
	//ɾ���˻�
	public int deleteUser(int id);
	 //��ѯ����
	public List<User> finallAllUsers();
	
}
