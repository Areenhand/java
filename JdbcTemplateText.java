package dzkj.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


//测试类
public class JdbcTemplateText {
	
	
	public static void adduser() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean4.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		
		User  user =new User();
		user.setUsername("luky");
		user.setPassword("123456");
		int num = userDao.adduser(user);
		if (num>0) {
			System.out.println("成功插入了"+num+"调数据");
		}else {
			System.out.println("插入失败");
		}
	}
	
	
	public static void update() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean4.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = new User();
		user.setId(1);
		user.setUsername("tom");
		user.setPassword("23456s");
		int num = userDao.adduser(user);
		if (num>0) {
			System.out.println("插入"+num+"条数据");
		}else {
			System.out.println("插入失败");
		}
	}
	
	
	public static void deleteUser() {
		 
	}
	
	
	
	
	
	
	//用execute（）方法建表
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean4.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		User  user =new User();
		user.setUsername("luky");
		user.setPassword("123456");
		int num = userDao.adduser(user);
		if (num>0) {
			System.out.println("成功插入了"+num+"调数据");
		}else {
			System.out.println("插入失败");
		}
		
//		ApplicationContext applicationContext = 
//				new ClassPathXmlApplicationContext("bean4.xml");
//		UserDao userDao = (UserDao) applicationContext.getBean("userdao");
//		User user = new User();
		//
//		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		//建表;
//		jdbcTemplate.execute("create tabl user");
//		jdbcTemplate.execute("create table user（"+"id int primary key auto_increment ,"+"username varchar(50),"+"password varchar(10))");
//		System.out.println("用户表创建成功！");
		
//		List<User> Users = userDao.finallAllUsers(); 
	}
}
