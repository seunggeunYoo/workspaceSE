package com.itwill.member.test;

import java.util.List;

import com.itwill.member.Member;
import com.itwill.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		MemberDao memberDao=new MemberDao();
		System.out.println("0.delete   --> "+memberDao.delete("dddd"));
		System.out.println("1.insert   --> "+memberDao.insert(new Member("dddd", "dddd", "디디디", "서울시", 34, "T", null)));
		System.out.println("2.update   --> "+memberDao.update(new Member("dddd", "dddd", "디변경", "부산시", 37, "F", null)));
		System.out.println("3.selectById-> "+memberDao.findByPrimaryKey("dddd"));
		System.out.println("4.selectAll--> "+memberDao.findAll());
		
		/*
		MemberDao memberDao=new MemberDao();
		System.out.println("0.delete   --> ");
		System.out.println(">>"+memberDao.delete("qqqq"));
		
		System.out.println("1.insert   --> ");
		Member insertMember = new Member("aaaa","aaaa","아아아아","여기요요요기",21,"F",null);
		int rowCount = memberDao.insert(insertMember);
		 
		
		System.out.println("2.update   --> ");
		Member updateMember = new Member("cccc","cccc","이이이","오오오",22,"F",null);
		rowCount = memberDao.update(updateMember);
		System.out.println(">> update row count:"+rowCount);
		
		System.out.println("3.selectById-> ");
		Member selectMember = memberDao.findByPrimaryKey("dddd");
		System.out.println(">>"+selectMember);
		
		
		System.out.println("4.selectAll--> ");
		System.out.println(">>"+memberDao.findAll());
		*/
		
	}

}
