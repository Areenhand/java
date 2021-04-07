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
	
	//添加用户；
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
	
	//更新用户
	@Override
	public int updateUser(User user) {
		//定义SQL
		String sql = "update user set usename=?,password=? where id= ?";
		//		执行添加操作，返回受SQL语句影响的值
		Object[] object = new Object[] {
				user.getUsername(),
				user.getPassword(),
				user.getId()
		};
		int number = this.jdbcTemplate.update(sql,object);
		return number;
	}
	
	//删除用户
	@Override
	public int deleteUser(int id) {
		String sql = "delete from user where id=?";
		int number = this.jdbcTemplate.update(sql,id);
		return number;
	}

	
	//查询所有用户信息
	@Override
	public List<User> finallAllUsers() {
		String sql = "select * from user";
		
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}

}
