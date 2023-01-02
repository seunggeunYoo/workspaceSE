package com.itwill.member;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		System.out.println("0.delete   --> ");
		System.out.println(">>"+memberDao.delete("aaaa"));
		
		System.out.println("1.insert   --> ");
		Member insertMember = new Member("eeee","eeee","유승근","여기저기",19,"T",null);
		int rowCount = memberDao.insert(insertMember);
		 
		
		System.out.println("2.update   --> ");
		Member updateMember = new Member("gggg","gggg","아아아","저기여기",21,"F",null);
		rowCount = memberDao.update(updateMember);
		System.out.println(">> update row count:"+rowCount);
		
		
		System.out.println("3.selectById-> ");
		Member selectMember = memberDao.findByPrimaryKey("cccc");
		System.out.println(">>"+selectMember);
		
		
		System.out.println("4.selectAll--> ");
		System.out.println(">>"+memberDao.findAll());
		
	}

}
