package resultset;

import java.sql.Connection;

import dao.address.DataSource;

public class ResultSetMain {

	public static void main(String[] args) throws Exception {
		
		DataSource dataSource = new DataSource();
		Connection con = dataSource.getConnection();
		System.out.println(con);
		
		dataSource.close(con);

	}

}
