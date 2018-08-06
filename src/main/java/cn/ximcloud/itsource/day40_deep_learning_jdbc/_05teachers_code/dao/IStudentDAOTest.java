//package cn.ximcloud.itsource.day40_deep_learning_jdbc._05teachers_code.dao;
//
//import static org.junit.Assert.fail;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import org.junit.Test;
//
//import cn.itsource.dao.impl.StudentDAOImpl;
//import cn.itsource.domain.Student;
//import cn.itsource.util.JDBCUtil;
//
//public class IStudentDAOTest {
//	IStudentDAO dao = new StudentDAOImpl();
//	@Test
//	public void testSave() {
//		Student stu = new Student();
//		stu.setAge(19);
//		stu.setUsername("小李");
//		stu.setPassword("3333");
//		stu.setIntro("三好学生");
//		stu.setSex(false);
//
//		dao.save(stu);
//	}
//
//	@Test
//	public void testUpdate() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDelete() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryOne() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testLogin() {
//		//1 模拟获得了前台传入的账号密码
//		String username = "sadf开水果卡上的";
//		String password = "23423' or 1=1 or '";
//
//		//2 调用dao的方法
//		Student student = dao.login(username, password);
//		System.out.println(student);
//		//3 判断student是否为空，
//		if(student==null){
//			System.out.println("账号或者密码错误！");
//		}else{
//			System.out.println("恭喜你，登录成功！");
//		}
//	}
//
//
//
//
//
//	@Test
//	public void testLogin2() {
//		//1 模拟获得了前台传入的账号密码
//		String username = "小明";
//		String password = "3333";
//
//		//2 调用dao的方法
//		Student student = dao.login(username);
//		// 如果student非空表示账号正确
//		if(student==null){
//			System.out.println("账号错误！");
//		}
//
//		// 如果账号正确在进行密码的判断
//		if(student != null && student.getPassword().equals(password)){
//			System.out.println("登录成功！");
//		}else{
//			System.out.println("密码错误");
//		}
//	}
//
//	/*
//	 * 测试事务
//	 */
//	@Test
//	public void testTrans() {
//		Connection conn = null;
//		Statement sm = null;
//		try {
//			conn = JDBCUtil.getInstance().getConn();
//			sm = conn.createStatement();
//
//			conn.setAutoCommit(false);  // 关闭自动提交
//
//			String sql = "update account set balance=balance-1000 where username='张三'";
//			sm.executeUpdate(sql);
//
//			System.out.println(1/0);
//
//			sql = "update account set balance=balance+1000 where username='包猪婆'";
//			sm.executeUpdate(sql);
//
//			conn.commit();   // 手动提交事务
//		} catch (Exception e) {
//			try {
//				conn.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//			JDBCUtil.getInstance().close(conn, sm, null);
//		}
//
//
//	}
//
//	/*
//	 * 在添加一条产品信息的同时，库存表页同时增加一条刚才添加的新产品的库存数据
//	 */
//	@Test
//	public void testGetId() {
//		Connection conn = null;
//		Statement sm = null;
//		try {
//			conn = JDBCUtil.getInstance().getConn();
//			sm = conn.createStatement();
//
//			String sql = "insert into product(productName,dir_id) values('超级鼠标',50)";
//
//			/*
//			 * 1 sm.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);  第二参数表示开启获取生成的主键
//			 * 2 在Statement对象中调用获得主键的方法
//			 * 		ResultSet getGeneratedKeys()
//			 * 3 返回的数据仅仅是获得主键 ResultSet，里面 数据是一行一列
//			 */
//			sm.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
//			ResultSet keys = sm.getGeneratedKeys();
//			keys.next();
//			Long id = keys.getLong(1);
////			System.out.println(id);
//
//			sql = "insert into product_stock(product_id,store_num) values("+id+",0)";
//			sm.executeUpdate(sql);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtil.getInstance().close(conn, sm, null);
//		}
//	}
//
//	/*
//	 * 在添加一条产品信息的同时，库存表页同时增加一条刚才添加的新产品的库存数据
//	 */
//	@Test
//	public void testGetId2() {
//		Connection conn = null;
//		PreparedStatement sm = null;
//		try {
//			conn = JDBCUtil.getInstance().getConn();
//			String sql = "insert into product(productName,dir_id) values('超级鼠标',50)";
//			sm = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//
//			sm.executeUpdate();
//
//			ResultSet keys = sm.getGeneratedKeys();
//			keys.next();
//			Long id = keys.getLong(1);
////			System.out.println(id);
//
//			sql = "insert into product_stock(product_id,store_num) values("+id+",0)";
//			sm.executeUpdate(sql);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtil.getInstance().close(conn, sm, null);
//		}
//	}
//
//}
