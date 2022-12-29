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
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/***********************************************/
		
		String insertSQL="insert into member(m_id,m_password,m_name,m_address,m_age,m_married,m_regdate)\n"
				+ "                values('"+newmember.getM_id()+"',"
									   + "'"+newmember.getM_password()+"',"
									   + "'"+newmember.getM_name()+"',"
								       + "'"+newmember.getM_address()+""
									  + "',"+newmember.getM_age()+","
									   + "'"+newmember.getM_married()+""
											+ "',sysdate)";
		
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
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/***********************************************/
		String updateSQL = "update member set password='"+updatemember.getM_password()+
											   "',name='"+updatemember.getM_name()+
											"',address='"+updatemember.getM_address()+
											    "',age='"+updatemember.getM_age()+
											"',married='"+updatemember.getM_married()+
											"',regdate='"+updatemember.getM_regdate()+
										   "' where id ="+updatemember.getM_id();
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSQL);
		System.out.println(">> "+rowCount+" 행 update");
		
		stmt.close();
		con.close();

	}

	public void delete(int age) throws Exception {
		/*****************데이타베이스접속정보***********/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/***********************************************/
		String deleteSQL="delete member where m_age ="+age;
		
		Class.forName(deleteSQL);
		Connection con =DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSQL);
		System.out.println(">>"+rowCount+ "행 delete");
		stmt.close();
		con.close();
		

	}

	public void findByPrimaryKey(String m_id) throws Exception {
		/*****************데이타베이스접속정보***********/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/***********************************************/
		String selectSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate where m_id="+m_id;
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSQL);
		if(rs.next()) {
			String id=rs.getString("m_id");
			String password1=rs.getString("m_password");
			String name=rs.getString("m_phone");
			String address=rs.getString("m_address");
			int age=rs.getInt("m_age");
			Reader married = rs.getCharacterStream("m_married");
			Date regdate = rs.getDate("m_regdate");
			
			System.out.println(id+"\t"+password1+"\t"+name+"\t"+address+"\t"+age+"\t"+married+"\t"+regdate);
		}else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		
		rs.close();
		stmt.close();
		con.close();

	}

	public void findAll() throws Exception {

	}
}
