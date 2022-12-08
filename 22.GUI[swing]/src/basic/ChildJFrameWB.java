package basic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class ChildJFrameWB extends JFrame {

	private JPanel contentPane;
	private JButton cancleBtn;
	private JButton Btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChildJFrameWB frame = new ChildJFrameWB();
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
	public ChildJFrameWB() {
		setTitle("나의첫번째윈도우");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 261, 447);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Btn = new JButton("확인");
		Btn.setToolTipText("확인");
		Btn.setBounds(12, 39, 97, 46);
		contentPane.add(Btn);
		
		cancleBtn = new JButton("취소");
		cancleBtn.setBounds(136, 39, 97, 46);
		contentPane.add(cancleBtn);
	}
}
