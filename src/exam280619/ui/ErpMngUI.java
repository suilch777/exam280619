package exam280619.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exam280619.dao.TitleDao;
import exam280619.dto.Title;


import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ErpMngUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnTtl;
	private TitleDao ttlDao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErpMngUI frame = new ErpMngUI();
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
	public ErpMngUI() {
		initComponents();
	}
	private void initComponents() {
		setTitle("ERP\uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 121);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(20, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnEmp = new JButton("\uC0AC\uC6D0\uAD00\uB9AC");
		btnEmp.setPreferredSize(new Dimension(100, 50));
		contentPane.add(btnEmp);
		
		JButton btnDpt = new JButton("\uBD80\uC11C\uAD00\uB9AC");
		btnDpt.setPreferredSize(new Dimension(100, 50));
		contentPane.add(btnDpt);
		
		btnTtl = new JButton("\uC9C1\uCC45\uAD00\uB9AC");
		btnTtl.addActionListener(this);
		btnTtl.setPreferredSize(new Dimension(100, 50));
		contentPane.add(btnTtl);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnTtl) {
			actionPerformedBtnTtl(e);
		}
	}
	protected void actionPerformedBtnTtl(ActionEvent e) {
		List<Title> ttlList = ttlDao.selectTitleByAll();
		Title[] eList = new Title[ttlList.size()];
		ttlList.toArray(eList);
		
	}
}
