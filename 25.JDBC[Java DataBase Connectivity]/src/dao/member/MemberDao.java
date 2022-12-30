package dao.member;

import java.io.Reader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {

	public MemberDao() {

	}

	public void insert(Member newmember) throws Exception {
		/*****************데이타베이스접속정보***********/
	    String driverClass="oracle.jdbc.OracleDriver";
	    String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper06";
		String password="jdeveloper06";
		/***********************************************/
		
		String insertSQL="insert into member values('"+newmember.getM_id()+"',"
				+ "'"+newmember.getM_password()+"',"
						+ "'"+newmember.getM_name()+"',"
								+ "'"+newmember.getM_address()+"',"
										+ "'"+newmember.getM_age()+"',"
												+ "'"+newmember.getM_married()+"',"
														+ "'"+newmember.getM_regdate()+"')";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL);
		
		
		System.out.println(">>insert row count:"+rowCount+" 행 insert");
		stmt.close();
		con.close();
	}

	
	public void update(Member updatemember) throws Exception {
		/*****************데이타베이스접속정보***********/
	    String driverClass="oracle.jdbc.OracleDriver";
	    String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper06";
		String password="jdeveloper06";
		/***********************************************/
		String updateSQL = "update member set m_password='"+updatemember.getM_password()+""
				+ "',m_name='"+updatemember.getM_name()+""
						+ "',m_address='"+updatemember.getM_address()+""
								+ "',m_age='"+updatemember.getM_age()+""
										+ "',m_married='"+updatemember.getM_married()+""
												+ "',m_regdate='"+updatemember.getM_regdate()+""
														+ "' where m_id="+updatemember.getM_id();
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSQL);
		System.out.println(">> "+rowCount+" 행 update");
		
		stmt.close();
		con.close();

	}

	public void delete(String id) throws Exception {
		/*****************데이타베이스접속정보***********/
	    String driverClass="oracle.jdbc.OracleDriver";
	    String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper06";
		String password="jdeveloper06";
		/***********************************************/
		String deleteSQL="delete member where m_id ="+id;
		
		Class.forName(deleteSQL);
		Connection con =DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSQL);
		System.out.println(">>"+rowCount+ "행 delete");
		stmt.close();
		con.close();
		

	}

	public void findByPrimaryKey(String id) throws Exception {
		/*****************데이타베이스접속정보***********/
	    String driverClass="oracle.jdbc.OracleDriver";
	    String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper06";
		String password="jdeveloper06";
		/***********************************************/
		String selectSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member where m_id="+id;
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSQL);
		if(rs.next()) {
			String i=rs.getString("m_id");
			String password1=rs.getString("m_password");
			String name=rs.getString("m_phone");
			String address=rs.getString("m_address");
			int age=rs.getInt("m_age");
			char married = "m_married".charAt(0);
			Date regdate = rs.getDate("m_regdate");
			
			System.out.println(i+"\t"+password1+"\t"+name+"\t"+address+"\t"+age+"\t"+married+"\t"+regdate);
		}else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		
		rs.close();
		stmt.close();
		con.close();

	}

	public void findAll() throws Exception {
		/*****************데이타베이스접속정보***********/
	    String driverClass="oracle.jdbc.OracleDriver";
	    String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper06";
		String password="jdeveloper06";
		/***********************************************/
		String selectSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(selectSQL);
		if(rs.next()) {
			String i=rs.getString("m_id");
			String password1=rs.getString("m_password");
			String name=rs.getString("m_phone");
			String address=rs.getString("m_address");
			int age=rs.getInt("m_age");
			char married = "m_married".charAt(0);
			Date regdate = rs.getDate("m_regdate");
			
			System.out.println(i+"\t"+password1+"\t"+name+"\t"+address+"\t"+age+"\t"+married+"\t"+regdate);
		}else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		
		rs.close();
		stmt.close();
		con.close();
		

		

	}
}
