package com.itwill.member.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.member.Member;
import com.itwill.member.MemberService;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class MemberMainFrame extends JFrame {
	/*********1.MemberService멤버필드선언*********/
	private MemberService memberService;
	/*
	ProductService productService;
	....
	*/
	/**************로그인한 회원*****************/
	private Member  loginMember = null;
	
	private JPanel contentPane;
	private JTextField idTF;
	private JPasswordField passTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JComboBox ageCB;
	private JCheckBox marriedCK;
	private JLabel idMsgLB;
	private JTextField loginIdTF;
	private JPasswordField loginPassTF;
	private JTextField infoidTF;
	private JPasswordField infopassTF;
	private JTextField infonameTF;
	private JTextField infoaddressTF;
	private JTabbedPane memberTabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberMainFrame()throws Exception {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 561);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu memberMenu = new JMenu("회원");
		menuBar.add(memberMenu);
		
		JMenuItem loginMenuItem = new JMenuItem("로그인");
		memberMenu.add(loginMenuItem);
		
		JMenuItem joinMenuItem = new JMenuItem("가입");
		memberMenu.add(joinMenuItem);
		
		JSeparator separator_1 = new JSeparator();
		memberMenu.add(separator_1);
		
		JMenuItem logoutNewMenuItem = new JMenuItem("로그아웃");
		memberMenu.add(logoutNewMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		JMenuItem exitNewMenuItem = new JMenuItem("종료");
		memberMenu.add(exitNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		JPanel memberLoginPanel = new JPanel();
		memberLoginPanel.setBackground(Color.PINK);
		memberTabbedPane.addTab("회원로그인", null, memberLoginPanel, null);
		memberLoginPanel.setLayout(null);
		
		JLabel passwordLB = new JLabel("아이디");
		passwordLB.setBounds(36, 111, 57, 15);
		memberLoginPanel.add(passwordLB);
		
		JLabel lblNewLabel_6 = new JLabel("패쓰워드");
		lblNewLabel_6.setBounds(36, 173, 57, 15);
		memberLoginPanel.add(lblNewLabel_6);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(136, 108, 116, 21);
		memberLoginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPassTF = new JPasswordField();
		loginPassTF.setBounds(136, 170, 116, 21);
		memberLoginPanel.add(loginPassTF);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********회원로그인************/
				try {
					String id = loginIdTF.getText();
					String pass=new String(loginPassTF.getPassword());
					
					int result = memberService.login(id, pass);
					if(result == 0) {
						//로그인성공
						loginProcess(id);
						
						
					}else {
						JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인하세요.");
						loginIdTF.setSelectionStart(0);
						loginIdTF.setSelectionEnd(id.length());
						loginIdTF.requestFocus();
					}
					
				}catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		loginBtn.setBounds(38, 232, 97, 23);
		memberLoginPanel.add(loginBtn);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		joinBtn.setBounds(155, 232, 97, 23);
		memberLoginPanel.add(joinBtn);
		
		JPanel memberJoinPanel = new JPanel();
		memberJoinPanel.setBackground(SystemColor.activeCaption);
		memberTabbedPane.addTab("회원가입", null, memberJoinPanel, null);
		memberJoinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(53, 60, 57, 15);
		memberJoinPanel.add(lblNewLabel);
		
		idTF = new JTextField();
		idTF.setBounds(131, 57, 116, 21);
		memberJoinPanel.add(idTF);
		idTF.setColumns(10);
		
		JLabel 패쓰워드 = new JLabel("패쓰워드");
		패쓰워드.setBounds(53, 109, 57, 15);
		memberJoinPanel.add(패쓰워드);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(53, 162, 57, 15);
		memberJoinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(53, 205, 57, 15);
		memberJoinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(53, 264, 57, 15);
		memberJoinPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결혼여부");
		lblNewLabel_5.setBounds(53, 326, 57, 15);
		memberJoinPanel.add(lblNewLabel_5);
		
		passTF = new JPasswordField();
		passTF.setBounds(131, 107, 116, 18);
		memberJoinPanel.add(passTF);
		
		nameTF = new JTextField();
		nameTF.setBounds(131, 159, 116, 21);
		memberJoinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(131, 202, 116, 21);
		memberJoinPanel.add(addressTF);
		addressTF.setColumns(10);
		
		ageCB = new JComboBox();
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34"}));
		ageCB.setBounds(131, 260, 116, 23);
		memberJoinPanel.add(ageCB);
		
		marriedCK = new JCheckBox("");
		marriedCK.setBounds(131, 322, 27, 19);
		memberJoinPanel.add(marriedCK);
		
		JButton memberJoinBtn = new JButton("가입");
		memberJoinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*********** 회원가입 ************/
				try {
					/******TextField로 부터 데이타얻기*****/
					String id = idTF.getText();
					String password=new String(passTF.getPassword());
					String name=nameTF.getText();
					String address=addressTF.getText();
					/***********유효성체크****************/
					if(id.equals("")) {
						 idMsgLB.setText("아이디를 입력하세요.");
						 idTF.requestFocus();
						return;
					}
					String ageStr=(String)ageCB.getSelectedItem();
					int age = Integer.parseInt(ageStr);
					String married="";
					if(marriedCK.isSelected()) {
						married="T";
					}else {
						married="F";
					}
					
					
					Member newMember=new Member(id,password,name,address,age,married,null);
					boolean isAdd = memberService.addMember(newMember);
					if(isAdd) {
						//로그인화면전환
						 memberTabbedPane.setSelectedIndex(1);
					}else {
						JOptionPane.showMessageDialog(null, "이미사용하고있는 아이디입니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
					}
				}catch (Exception e1) {
					System.out.println("회원가입-->"+e1.getMessage());
				}
			}
		});
		memberJoinBtn.setBounds(47, 391, 97, 23);
		memberJoinPanel.add(memberJoinBtn);
		
		JButton memberCancleBtn = new JButton("취소");
		memberCancleBtn.setBounds(160, 391, 97, 23);
		memberJoinPanel.add(memberCancleBtn);
		
		idMsgLB = new JLabel("");
		idMsgLB.setForeground(Color.RED);
		idMsgLB.setBounds(131, 88, 116, 15);
		memberJoinPanel.add(idMsgLB);
		
		JPanel memberinfopanel = new JPanel();
		memberinfopanel.setBackground(Color.ORANGE);
		memberTabbedPane.addTab("회원정보", null, memberinfopanel, null);
		memberinfopanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(47, 52, 57, 15);
		memberinfopanel.add(lblNewLabel_1);
		
		infoidTF = new JTextField();
		infoidTF.setEnabled(false);
		infoidTF.setColumns(10);
		infoidTF.setBounds(125, 49, 116, 21);
		memberinfopanel.add(infoidTF);
		
		infopassTF = new JPasswordField();
		infopassTF.setEditable(false);
		infopassTF.setBounds(125, 99, 116, 18);
		memberinfopanel.add(infopassTF);
		
		JLabel 패쓰워드_1 = new JLabel("패쓰워드");
		패쓰워드_1.setBounds(47, 101, 57, 15);
		memberinfopanel.add(패쓰워드_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(47, 154, 57, 15);
		memberinfopanel.add(lblNewLabel_2_1);
		
		infonameTF = new JTextField();
		infonameTF.setEditable(false);
		infonameTF.setColumns(10);
		infonameTF.setBounds(125, 151, 116, 21);
		memberinfopanel.add(infonameTF);
		
		infoaddressTF = new JTextField();
		infoaddressTF.setEditable(false);
		infoaddressTF.setColumns(10);
		infoaddressTF.setBounds(125, 194, 116, 21);
		memberinfopanel.add(infoaddressTF);
		
		JLabel lblNewLabel_3_1 = new JLabel("주소");
		lblNewLabel_3_1.setBounds(47, 197, 57, 15);
		memberinfopanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("나이");
		lblNewLabel_4_1.setBounds(47, 256, 57, 15);
		memberinfopanel.add(lblNewLabel_4_1);
		
		JComboBox infoageCB = new JComboBox();
		infoageCB.setBounds(125, 252, 116, 23);
		memberinfopanel.add(infoageCB);
		
		JCheckBox infomarriedCK = new JCheckBox("");
		infomarriedCK.setEnabled(false);
		infomarriedCK.setBounds(125, 314, 27, 19);
		memberinfopanel.add(infomarriedCK);
		
		JLabel lblNewLabel_5_1 = new JLabel("결혼여부");
		lblNewLabel_5_1.setBounds(47, 318, 57, 15);
		memberinfopanel.add(lblNewLabel_5_1);
		
		/******2.MemberService멤버필드객체생성*********/
		memberService=new MemberService();
	}//생성자끝
	
	private void loginProcess(String id) throws Exception {
		/***************로그인성공시 해야할 일*****************
		 1.로그인성공함멤버객체 멤버필드에저장
		 2.MemberMainFrame 타이틀 변경
		 3.로그인,회원가입탭 불활성화
		 4.회원정보보기 화면전환
		 *****************************************************/
		
		//1.로그인성공함멤버객체 멤버필드에저장
		this.loginMember = memberService.memberDetail(id);
		
		
		
		//2.MemberMainFrame 타이틀 변경
		setTitle(id+"님 로그인");
		//3. 로그인,회원가입탭 불활성화
		memberTabbedPane.setEnabledAt(0, false);
		memberTabbedPane.setEnabledAt(1, false);
		//4.회원정보보기 화면전환
		memberTabbedPane.setSelectedIndex(2);
		
		/****회원상세데이타보여주기******/
		infoidTF.setText(loginMember.getM_id());
		infopassTF.setText(loginMember.getM_password());
		infonameTF.setText(loginMember.getM_name());
		infoaddressTF.setText(loginMember.getM_address());
		
		
	}
}