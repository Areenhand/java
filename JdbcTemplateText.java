package dzkj.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


//������
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
			System.out.println("�ɹ�������"+num+"������");
		}else {
			System.out.println("����ʧ��");
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
			System.out.println("����"+num+"������");
		}else {
			System.out.println("����ʧ��");
		}
	}
	
	
	public static void deleteUser() {
		 
	}
	
	
	
	
	
	
	//��execute������������
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean4.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		User  user =new User();
		user.setUsername("luky");
		user.setPassword("123456");
		int num = userDao.adduser(user);
		if (num>0) {
			System.out.println("�ɹ�������"+num+"������");
		}else {
			System.out.println("����ʧ��");
		}
		
//		ApplicationContext applicationContext = 
//				new ClassPathXmlApplicationContext("bean4.xml");
//		UserDao userDao = (UserDao) applicationContext.getBean("userdao");
//		User user = new User();
		//
//		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		//����;
//		jdbcTemplate.execute("create tabl user");
//		jdbcTemplate.execute("create table user��"+"id int primary key auto_increment ,"+"username varchar(50),"+"password varchar(10))");
//		System.out.println("�û������ɹ���");
		
//		List<User> Users = userDao.finallAllUsers(); 
	}
}
