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
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

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
		
		final JTextArea WriteTextArea = new JTextArea();
		JScrollPane writeScrollPane = new JScrollPane(WriteTextArea);
		WriteTextArea.setBounds(10, 11, 193, 154);
		contentPane.add(writeScrollPane, BorderLayout.CENTER);
		writeScrollPane.setVisible(true);
		writeScrollPane.setBounds(10, 11, 193, 154);
		
		final JTextArea ReadTextArea = new JTextArea();
		JScrollPane readScrollPane = new JScrollPane(ReadTextArea);
		ReadTextArea.setBounds(231, 11, 193, 154);
		contentPane.add(readScrollPane, BorderLayout.CENTER);
		readScrollPane.setVisible(true);
		readScrollPane.setBounds(231, 11, 193, 154);
		
		JButton WriteListToFile = new JButton("Write List to File");
		WriteListToFile.setBounds(10, 208, 113, 23);
		contentPane.add(WriteListToFile);
		WriteListToFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String myString = null;
				int randomNumber = (int) (Math.random() * 100);
				System.out.println(randomNumber);
				for (int i = 0; i <=randomNumber; i++)
				{
					myString += String.valueOf(i) + System.getProperty("line.separator");
				}
				WriteTextArea.setText(myString);
			}
		});  
			
		
		JButton ReadFromFile = new JButton("Read From File");
		ReadFromFile.setBounds(286, 174, 138, 23);
		contentPane.add(ReadFromFile);
		ReadFromFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					FileReader fstream = null;
					String myString = "";
					fstream = new FileReader("lab6.txt");
					BufferedReader in = new BufferedReader(fstream);
					String myLine = in.readLine();
					if (myLine != null) 
						myString += myLine;
					while(myLine != null)
					{					
						myLine = in.readLine();
						if (myLine != null)
							myString += myLine;
					}
					ReadTextArea.setText(myString);
					in.close();
					
				}catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		});

		JButton ReadListFromFile = new JButton("Read List From File");
		ReadListFromFile.setBounds(258, 208, 166, 23);
		contentPane.add(ReadListFromFile);
		ReadListFromFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					try
					{
						FileReader fstream = null;
						String myString = "";
						fstream = new FileReader("lab6a.txt");
						BufferedReader in = new BufferedReader(fstream);
						String myLine = in.readLine();
						if (myLine != null) 
							myString += myLine;
						while(myLine != null)
						{					
							myLine = in.readLine();
							if (myLine != null)
								myString += myLine;
						}
						ReadTextArea.setText(myString);
						in.close();
						
					}catch (IOException ioe) {
						ioe.printStackTrace();
					}
				}
			}
				
		
		);
		
		JButton WritetoFile = new JButton("Write to File");
		WritetoFile.setBounds(10, 176, 113, 23);
		contentPane.add(WritetoFile);
		WritetoFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File writtenText = new File("Lab6.txt");
			
				
				try{ FileOutputStream output = new FileOutputStream(writtenText);
				 byte[] textInBytes = WriteTextArea.getText().getBytes();
					output.write(textInBytes);
				
					output.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
					
				}
					
			
		});
	}
	public static JTextField getTextField(){
		return WriteTextArea;
	}
}
