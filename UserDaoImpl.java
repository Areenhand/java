package dzkj.jdbc;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDaoImpl implements UserDao {
	
	private JdbcTemplate jdbcTemplate;
	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//����û���
	@Override
	public int adduser(User user) {

		String sql = "insert into User(username,password) values(?,?)";
		Object[] object = new Object[] {
				user.getUsername(),
				user.getPassword(),
		};
		int number = this.jdbcTemplate.update(sql,object);
		return number;
	}
	
	//�����û�
	@Override
	public int updateUser(User user) {
		//����SQL
		String sql = "update user set usename=?,password=? where id= ?";
		//		ִ����Ӳ�����������SQL���Ӱ���ֵ
		Object[] object = new Object[] {
				user.getUsername(),
				user.getPassword(),
				user.getId()
		};
		int number = this.jdbcTemplate.update(sql,object);
		return number;
	}
	
	//ɾ���û�
	@Override
	public int deleteUser(int id) {
		String sql = "delete from user where id=?";
		int number = this.jdbcTemplate.update(sql,id);
		return number;
	}

	
	//��ѯ�����û���Ϣ
	@Override
	public List<User> finallAllUsers() {
		String sql = "select * from user";
		
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}

}
