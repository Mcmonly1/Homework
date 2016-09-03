package Week5.Lab2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class AnimalTest extends JFrame implements ActionListener {

	private Raven oRaven;
	private Bat oBat;
	private Dog oDog;
	private Frog oFrog;
	
	private JRadioButton rbFlyingAnimal;
	private JRadioButton rbNonFlyingAnimal;
	private JRadioButton rbRaven;
	private JRadioButton rbBat;
	private JRadioButton rbDog;
	private JRadioButton rbFrog;
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		if (source == rbFlyingAnimal)
		{
			rbRaven.setEnabled(true);
			rbBat.setEnabled(true);
			rbDog.setEnabled(false);
			rbFrog.setEnabled(false);
		}
		if (source == rbNonFlyingAnimal)
		{
			rbRaven.setEnabled(false);
			rbBat.setEnabled(false);
			rbDog.setEnabled(true);
			rbFrog.setEnabled(true);
		}
		if (source == rbRaven)
		{
			oRaven = new Raven(false, true);
			oBat = null;
			oDog = null;
			oFrog = null;
		}
		if (source == rbBat)
		{
			oRaven = null;
			oBat = new Bat(false, true);
			oDog = null;
			oFrog = null;
		}
		if (source == rbDog)
		{
			oRaven = null;
			oBat = null;
			oDog = new Dog(false, true);
			oFrog = null;
		}
		if (source == rbFrog)
		{
			oRaven = null;
			oBat = null;
			oDog = null;
			oFrog = new Frog(false, true);
		}
	}
	
	
	private JPanel contentPane;
	private final ButtonGroup AnimalGroup = new ButtonGroup();
	private final ButtonGroup FlyingAnimals = new ButtonGroup();
	private final ButtonGroup NonFlyingAnimals = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalTest frame = new AnimalTest();
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
	public AnimalTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Animal");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rbFlyingAnimal = new JRadioButton("Flying");
		AnimalGroup.add(rbFlyingAnimal);
		rbFlyingAnimal.setBounds(0, 32, 109, 23);
		contentPane.add(rbFlyingAnimal);
		rbNonFlyingAnimal.addActionListener(this);
		
		JRadioButton rbNonFlyingAnimal = new JRadioButton("NonFlying");
		AnimalGroup.add(rbNonFlyingAnimal);
		rbNonFlyingAnimal.setBounds(0, 58, 109, 23);
		contentPane.add(rbNonFlyingAnimal);
		
		JLabel lblFlying = new JLabel("Flying");
		lblFlying.setBounds(169, 11, 46, 14);
		contentPane.add(lblFlying);
		
		JRadioButton rdRaven = new JRadioButton("Raven");
		FlyingAnimals.add(rdRaven);
		rdRaven.setBounds(148, 32, 109, 23);
		contentPane.add(rdRaven);
		
		JRadioButton rdBat = new JRadioButton("Frog");
		FlyingAnimals.add(rdBat);
		rdBat.setBounds(148, 58, 109, 23);
		contentPane.add(rdBat);
		
		JLabel lblNonflying = new JLabel("Non-Flying");
		lblNonflying.setBounds(296, 11, 72, 14);
		contentPane.add(lblNonflying);
		
		JRadioButton rdDog = new JRadioButton("Dog");
		NonFlyingAnimals.add(rdDog);
		rdDog.setBounds(282, 32, 109, 23);
		contentPane.add(rdDog);
		
		JRadioButton rdFrog = new JRadioButton("Frog");
		NonFlyingAnimals.add(rdFrog);
		rdFrog.setBounds(282, 58, 109, 23);
		contentPane.add(rdFrog);
		
		JButton Takeoff = new JButton("Take Off");
		Takeoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (oRaven != null)
				{
					outPut.setText("Not Implemented");
				}
				if (oBat != null)
				{
					outPut.setText("Not Implemented");
				}
				if (oDog != null)
				{
					outPut.setText("Not implemented");
				}
				if (oFrog != null)
				{
					outPut.setText("Not Implemented");
				}
			}
		});
		Takeoff.setBounds(20, 141, 89, 23);
		contentPane.add(Takeoff);
		
		JButton Movement = new JButton("Movement");
		Movement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (oRaven != null)
				{
					outPut.setText("Not Implemented");
				}
				if (oBat != null)
				{
					outPut.setText("Not Implemented");
				}
				if (oDog != null)
				{
					outPut.setText("Not implemented");
				}
				if (oFrog != null)
				{
					outPut.setText("Not Implemented");
				}
			}
		});
		Movement.setBounds(126, 141, 89, 23);
		contentPane.add(Movement);
		
		JButton Fly = new JButton("Fly");
		Fly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (oRaven != null)
				{
					outPut.setText("Not Implemented");
				}
				if (oBat != null)
				{
					outPut.setText("Not Implemented");
				}
				if (oDog != null)
				{
					outPut.setText("Not implemented");
				}
				if (oFrog != null)
				{
					outPut.setText("Not Implemented");
				}
			}
		});
		Fly.setBounds(225, 141, 89, 23);
		contentPane.add(Fly);
		
		JButton Run = new JButton("Run");
		Run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (oRaven != null)
				{
					outPut.setText("Not Implemented");
				}
				if (oBat != null)
				{
					outPut.setText("Not Implemented");
				}
				if (oDog != null)
				{
					outPut.setText("Not implemented");
				}
				if (oFrog != null)
				{
					outPut.setText("Not Implemented");
				}
			}
		});
		Run.setBounds(324, 141, 89, 23);
		contentPane.add(Run);
		
		rdRaven.setEnabled(false);
		rdBat.setEnabled(false);
		rdDog.setEnabled(false);
		rdFrog.setEnabled(false);
	}
}
