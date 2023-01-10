package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.JTabbedPane;

public class shopMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shopMainFrame frame = new shopMainFrame();
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
	public shopMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel globalSouthMainpanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) globalSouthMainpanel.getLayout();
		flowLayout.setHgap(30);
		globalSouthMainpanel.setBackground(Color.WHITE);
		contentPane.add(globalSouthMainpanel, BorderLayout.SOUTH);
		
		JButton globalSeachMenuButton = new JButton("");
		globalSeachMenuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalSeachMenuButton.setBorder(null);
		globalSeachMenuButton.setOpaque(false);
		globalSeachMenuButton.setIcon(new ImageIcon(shopMainFrame.class.getResource("/images/search_dog50.png")));
		globalSouthMainpanel.add(globalSeachMenuButton);
		
		JButton globalHomeMenuButton = new JButton("");
		globalHomeMenuButton.setBorder(null);
		globalHomeMenuButton.setOpaque(false);
		globalHomeMenuButton.setIcon(new ImageIcon(shopMainFrame.class.getResource("/images/user.png")));
		globalSouthMainpanel.add(globalHomeMenuButton);
		
		JButton globalMemberMenuButton = new JButton("");
		globalMemberMenuButton.setBorder(null);
		globalMemberMenuButton.setOpaque(false);
		globalMemberMenuButton.setIcon(new ImageIcon(shopMainFrame.class.getResource("/images/cart50.png")));
		globalSouthMainpanel.add(globalMemberMenuButton);
		
		JTabbedPane shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		JTabbedPane producttabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("제품", null, producttabbedPane, null);
		
		PopularProductPanel popularProductPanel = new PopularProductPanel();
		producttabbedPane.addTab("인기제품", null, popularProductPanel, null);
		
		JTabbedPane membertabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("회원", null, membertabbedPane, null);
		
		MemberJoinPanel memberJoinPanel = new MemberJoinPanel();
		membertabbedPane.addTab("가입", null, memberJoinPanel, null);
	}

}
