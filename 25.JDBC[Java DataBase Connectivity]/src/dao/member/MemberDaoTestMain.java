package dao.member;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		System.out.println("0.delete   --> ");
		memberDao.delete(23);
		
		System.out.println("1.insert   --> ");
		Member newmember = new Member("dddd","dddd","모찌","내가있는곳",20,'T',null);
		memberDao.insert(newmember);
		
		System.out.println("2.update   --> ");
		Member updatemember = new Member("bbbb","bbbb","가가가","경기도",10,'F',null);
		memberDao.update(updatemember);
		
		System.out.println("3.selectById-> ");
		memberDao.findByPrimaryKey("aaaa");
		
		
		System.out.println("4.selectAll--> ");
		memberDao.findAll();
		
		
	}

}
