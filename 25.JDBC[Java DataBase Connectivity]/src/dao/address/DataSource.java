package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 데이타베이스 설정정보를 사용해서 
 Connection 객체를 생성하고 해지하는 역할을 하는 클래스
 (Dao객체들이 사용하는 클래스)
 */
public class DataSource {
	/*****************데이타베이스접속정보***********/
	String driverClass="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	/***********************************************/
	/*
	 * connection 객체를 생성해서 반환하는 메쏘드
	 */
	public Connection getConnection() throws Exception {
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
		
	}
	/*
	 * Connection 객체를 close하는 메쏘드
	 */
	public void close(Connection con) throws Exception {
		con.close();
		
	}

}
