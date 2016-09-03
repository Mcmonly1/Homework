package Week6.Lab1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;

public class GUIReadWrite extends JFrame {
public static JTextField WriteTextArea;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIReadWrite frame = new GUIReadWrite();
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
	public GUIReadWrite() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton WriteToFile = new JButton("Write To File");
		WriteToFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("test");
			}
		});
		
		JTextArea WriteTextArea = new JTextArea();
		JScrollPane writeScrollPane = new JScrollPane(WriteTextArea);
		WriteTextArea.setBounds(10, 11, 193, 154);
		contentPane.add(writeScrollPane, BorderLayout.CENTER);
		writeScrollPane.setVisible(true);
		writeScrollPane.setBounds(10, 11, 193, 154);
		
		JTextArea ReadTextArea = new JTextArea();
		JScrollPane readScrollPane = new JScrollPane(ReadTextArea);
		ReadTextArea.setBounds(231, 11, 193, 154);
		contentPane.add(readScrollPane, BorderLayout.CENTER);
		readScrollPane.setVisible(true);
		readScrollPane.setBounds(231, 11, 193, 154);
		
		JButton WriteListToFile = new JButton("Write List to File");
		WriteListToFile.setBounds(10, 208, 113, 23);
		contentPane.add(WriteListToFile);
		
		JButton ReadFromFile = new JButton("Read From File");
		ReadFromFile.setBounds(286, 174, 138, 23);
		contentPane.add(ReadFromFile);
		
		JButton ReadListFromFile = new JButton("Read List From File");
		ReadListFromFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ReadListFromFile.setBounds(258, 208, 166, 23);
		contentPane.add(ReadListFromFile);
		
		JButton WritetoFile = new JButton("Write to File");
		WritetoFile.setBounds(10, 176, 113, 23);
		contentPane.add(WritetoFile);
	}
	public static JTextField getTextField(){
		return WriteTextArea;
	}
}
