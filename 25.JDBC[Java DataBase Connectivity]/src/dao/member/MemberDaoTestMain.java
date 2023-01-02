package dao.member;

import java.util.List;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		MemberDao memberDao=new MemberDao();
		
		
		int rowCount = memberDao.delete("aaaa");
		System.out.println("0.delete   -->"+ rowCount);
		

		
		
		System.out.println("1.insert   --> ");
		Member newmember = new Member("dddd","dddd","모찌","내가있는곳",20,'T',null);
	    rowCount = memberDao.insert(newmember);
		System.out.println(">> insert row count :"+ rowCount);

		
		System.out.println("2.update   --> ");
		Member updatemember = new Member("bbbb","bbbb","가가가","경기도",10,'F',null);
		rowCount = memberDao.update(updatemember);
		System.out.println(">>update row count:"+ rowCount);
		
		
		
		System.out.println("3.selectById-> ");
		Member findMember = memberDao.findByPrimaryKey("bbbb");
		if(findMember !=null) {
			System.out.println(">>"+findMember);
		}else {
			System.out.println(">>조건에 만족하는 주소록 존재안함");
		}
		System.out.println(">>"+memberDao.findByPrimaryKey("cccc"));
		
		
		System.out.println("4.selectAll--> ");
		List<Member> memberList = memberDao.findAll();
		System.out.println(memberList);
		
		
		
		
	}

}
