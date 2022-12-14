package com.itwill.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.common.DataSource;
import com.itwill.guest.GuestSQL;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {
	private DataSource dataSource;

	public MemberDao() throws Exception {
		dataSource = new DataSource();
		

	}
	
	public int insert(Member newMember) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_INSERT);
		pstmt.setString(1,newMember.getM_id());
		pstmt.setString(2,newMember.getM_password());
		pstmt.setString(3,newMember.getM_name());
		pstmt.setString(4,newMember.getM_address());
		pstmt.setInt(5, newMember.getM_age());
		pstmt.setString(6, newMember.getM_married());
		int insertRowCount=pstmt.executeUpdate();
		return insertRowCount;
	}
/*
	public int insert(Member member) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_INSERT);
		
		pstmt.setString(1, member.getM_id());
		pstmt.setString(2, member.getM_password());
		pstmt.setString(3, member.getM_name());
		pstmt.setString(4, member.getM_address());
		pstmt.setInt(5, member.getM_age());
		pstmt.setString(6, member.getM_married());
		
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;

	}
*/
	public int update(Member updateMember)throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_UPDATE);
		pstmt.setString(1, updateMember.getM_password());
		pstmt.setString(2, updateMember.getM_name());
		pstmt.setString(3, updateMember.getM_address());
		pstmt.setInt(4, updateMember.getM_age());
		pstmt.setString(5, updateMember.getM_married());
		//pstmt.setDate(6,new  java.sql.Date(updateMember.getM_regdate().getTime()));
		pstmt.setString(6, updateMember.getM_id());
		int updateRowCount = pstmt.executeUpdate();
		return updateRowCount;
	}
/*
	public int update(Member member) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_UPDATE);
		
		
		pstmt.setString(1, member.getM_password());
		pstmt.setString(2, member.getM_name());
		pstmt.setString(3, member.getM_address());
		pstmt.setInt(4, member.getM_age());
		pstmt.setString(5, member.getM_married());
		pstmt.setString(6, member.getM_id());
		
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	*/
	
	public int delete(String m_id) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_DELETE);
		pstmt.setString(1, m_id);
		int deleteRowCount=pstmt.executeUpdate();
		return deleteRowCount;
	}
/*
	public int delete(String m_id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_DELETE);
		
		pstmt.setString(1, m_id);
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
		
	}
	*/
	public Member findByPrimaryKey(String m_id)throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_SELECT_BY_ID);
		pstmt.setString(1,m_id);
		ResultSet rs=pstmt.executeQuery();
		
		Member findMember=null;
		if(rs.next()) {
			findMember=new Member( 
						rs.getString("m_id"),
						rs.getString("m_password"),
						rs.getString("m_name"),
						rs.getString("m_address"),
						rs.getInt("m_age"),
						rs.getString("m_married"),
						rs.getDate("m_regdate"));
		}
		return findMember;
	}
/*
	public Member findByPrimaryKey(String m_id) throws Exception {
		Member findMember=null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_SELECT_By_NO);
		
		pstmt.setString(1, m_id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
		
			findMember = new Member(rs.getString("m_id"),
									rs.getString("m_password"),
									rs.getString("m_name"),
									rs.getString("m_address"),
									rs.getInt("m_age"),
									rs.getString("m_married"),
									rs.getDate("m_regdate"));
					
		}
		return findMember;
	}
*/
	public ArrayList<Member> findAll() throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		ArrayList<Member> memberList=new ArrayList<Member>();
		while(rs.next()) {
			memberList.add(new Member(
						rs.getString("m_id"),
						rs.getString("m_password"),
						rs.getString("m_name"),
						rs.getString("m_address"),
						rs.getInt("m_age"),
						rs.getString("m_married"),
						rs.getDate("m_regdate"))
					 );
		}
		return memberList;
	}
	/*
	public List<Member> findAll() throws Exception {
		List<Member> memberList = new ArrayList<Member>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_SELECT_ALL);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Member member = new Member (rs.getString("m_id"),
										rs.getString("m_password"),
										rs.getString("m_name"),
										rs.getString("m_address"),
										rs.getInt("m_age"),
										rs.getString("m_married"),
										rs.getDate("m_regdate"));
			
			
		}
	
		return memberList;
	}
*/
}
