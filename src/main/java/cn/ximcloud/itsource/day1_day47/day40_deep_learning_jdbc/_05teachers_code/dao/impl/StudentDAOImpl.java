//package cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._05teachers_code.dao.impl;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//
//public class StudentDAOImpl implements IStudentDAO {
//
//	@Override
//	public void save(Student stu) {
//		Connection conn = null;
//		PreparedStatement sm = null;
//		String sql = "insert into student(username,password,intro,age,sex) values(?,?,?,?,?)";
//		try {
//			conn = JDBCUtil.getInstance().getConn();
//			sm = conn.prepareStatement(sql);
//			// 把对象的数据设置进去
//			sm.setString(1, stu.getUsername());
//			sm.setString(2, stu.getPassword());
//			sm.setString(3, stu.getIntro());
//			sm.setInt(4, stu.getAge());
//			sm.setBoolean(5, stu.getSex());
//
//			sm.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtil.getInstance().close(conn, sm, null);
//		}
//	}
//
//	@Override
//	public void update(Student stu) {
//
//	}
//
//	@Override
//	public void delete(Long id) {
//
//	}
//
//	@Override
//	public Student queryOne(Long id) {
//		return null;
//	}
//
//	@Override
//	public StudentList<Student> queryAll() {
//		return null;
//	}
//
////	@Override
////	public Student login(String username, String password) {
////		Connection conn = null;
////		Statement sm = null;
////		ResultSet rs = null;
////		String sql = "select * from student where username='"+username+"' and password='"+password+"'";
////		System.out.println(sql);
////		Student stu = null;
////		try {
////			conn = JDBCUtil.getInstance().getConn();
////			sm = conn.createStatement();
////			// 把对象的数据设置进去
////			rs = sm.executeQuery(sql);
////			while(rs.next()){
////				stu = new Student();
////				stu.setId(rs.getLong("id"));
////				stu.setUsername(username);
////				stu.setPassword(password);
////				stu.setIntro(rs.getString("intro"));
////				stu.setAge(rs.getInt("age"));
////				stu.setSex(rs.getBoolean("sex"));
////				break;
////			}
////
////		} catch (Exception e) {
////			e.printStackTrace();
////		} finally {
////			JDBCUtil.getInstance().close(conn, sm, rs);
////		}
////		return stu;
////	}
//
//
//	@Override
//	public Student login(String username, String password) {
//		Connection conn = null;
//		PreparedStatement sm = null;
//		ResultSet rs = null;
//		String sql = "select * from student where username=? and password=?";
//		Student stu = null;
//		try {
//			conn = JDBCUtil.getInstance().getConn();
//			sm = conn.prepareStatement(sql);
//			// 把对象的数据设置进去
//			sm.setString(1, username);
//			sm.setString(2, password);
//
//			rs = sm.executeQuery();
//			while(rs.next()){
//				stu = new Student();
//				stu.setId(rs.getLong("id"));
//				stu.setUsername(username);
//				stu.setPassword(password);
//				stu.setIntro(rs.getString("intro"));
//				stu.setAge(rs.getInt("age"));
//				stu.setSex(rs.getBoolean("sex"));
//				break;
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtil.getInstance().close(conn, sm, rs);
//		}
//		return stu;
//	}
//
//	@Override
//	public Student login(String username) {
//		Connection conn = null;
//		PreparedStatement sm = null;
//		ResultSet rs = null;
//		String sql = "select * from student where username=?";
//		Student stu = null;
//		try {
//			conn = JDBCUtil.getInstance().getConn();
//			sm = conn.prepareStatement(sql);
//			// 把对象的数据设置进去
//			sm.setString(1, username);
//
//			rs = sm.executeQuery();
//			while(rs.next()){
//				stu = new Student();
//				stu.setId(rs.getLong("id"));
//				stu.setUsername(username);
//				stu.setPassword(rs.getString("password"));
//				stu.setIntro(rs.getString("intro"));
//				stu.setAge(rs.getInt("age"));
//				stu.setSex(rs.getBoolean("sex"));
//				break;
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtil.getInstance().close(conn, sm, rs);
//		}
//		return stu;
//	}
//}
