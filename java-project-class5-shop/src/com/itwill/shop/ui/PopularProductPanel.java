package com.itwill.shop.ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;

public class PopularProductPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PopularProductPanel() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 113, 270, 415);
		add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.ORANGE);
		scrollPane.setViewportView(table);

	}
}
