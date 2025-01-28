package height.Converter;

import java.awt.EventQueue;
import java.text.DecimalFormat;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class HeigthConverter extends JFrame {

	private JPanel contentPane;
	private JTextField ftTxtField;
	private JTextField inchTxtField;
	private JTextField cmTextField;
	private JTextField kmTextfield;
	private JTextField milesTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeigthConverter frame = new HeigthConverter();
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
	public HeigthConverter() {
		setTitle("Height Converter");
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 233, 233));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ftLabel = new JLabel("Feet");
		ftLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		ftLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ftLabel.setBounds(216, 47, 96, 42);
		contentPane.add(ftLabel);
		
		JLabel inchLabel = new JLabel("Inches");
		inchLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		inchLabel.setBounds(216, 129, 96, 42);
		inchLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(inchLabel);
		
		ftTxtField = new JTextField();
		ftTxtField.setFont(new Font("Verdana", Font.BOLD, 14));
		ftTxtField.setBackground(new Color(255, 255, 255));
		ftTxtField.setBounds(424, 47, 132, 42);
		contentPane.add(ftTxtField);
		ftTxtField.setColumns(10);
		
		inchTxtField = new JTextField();
		inchTxtField.setFont(new Font("Verdana", Font.BOLD, 14));
		inchTxtField.setBounds(424, 129, 132, 42);
		contentPane.add(inchTxtField);
		inchTxtField.setColumns(10);
		
		JButton converterBtn = new JButton("Convert To");
		converterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double feet, inches, centimetres, km, mile;
				
				try {
					inches = Double.parseDouble(inchTxtField.getText());
					feet = Double.parseDouble(ftTxtField.getText());
					
					centimetres = (feet*12 + inches)* 2.54;
					cmTextField.setText(String.valueOf(String.valueOf(new DecimalFormat("##.###").format(centimetres))));
					
					km = centimetres/100000;
					kmTextfield.setText(String.valueOf(new DecimalFormat("##.###").format(km)));
					
					mile = (double)centimetres/ 160934.4 ;	
					milesTextField.setText( String.valueOf(new DecimalFormat("##.###").format(mile)));	
					
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					//System.out.println("Please enter a number!");
					cmTextField.setText("Invalid !");
					kmTextfield.setText("Invalid !");
					milesTextField.setText("Invalid !");
				}
			}
		});
		converterBtn.setFont(new Font("Verdana", Font.BOLD, 18));
		converterBtn.setBounds(145, 192, 496, 47);
		contentPane.add(converterBtn);
		
		cmTextField = new JTextField();
		cmTextField.setFont(new Font("Verdana", Font.BOLD, 14));
		cmTextField.setBounds(145, 265, 96, 42);
		contentPane.add(cmTextField);
		cmTextField.setColumns(10);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ftTxtField.setText(" ");
				inchTxtField.setText(" ");
				cmTextField.setText(" ");
				kmTextfield.setText(" ");
				milesTextField.setText(" ");
				
			}
		});
		clearBtn.setFont(new Font("Verdana", Font.BOLD, 16));
		clearBtn.setBounds(233, 343, 96, 42);
		contentPane.add(clearBtn);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBtn.setFont(new Font("Verdana", Font.BOLD, 16));
		exitBtn.setBounds(458, 343, 96, 42);
		contentPane.add(exitBtn);
		
		JLabel centimetreLabel = new JLabel("Centimetres");
		centimetreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		centimetreLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		centimetreLabel.setBounds(10, 263, 119, 47);
		contentPane.add(centimetreLabel);
		
		kmTextfield = new JTextField();
		kmTextfield.setFont(new Font("Verdana", Font.BOLD, 14));
		kmTextfield.setColumns(10);
		kmTextfield.setBounds(369, 262, 96, 42);
		contentPane.add(kmTextfield);
		
		JLabel kmLabel = new JLabel("Kilometers");
		kmLabel.setHorizontalAlignment(SwingConstants.CENTER);
		kmLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		kmLabel.setBounds(251, 260, 111, 47);
		contentPane.add(kmLabel);
		
		milesTextField = new JTextField();
		milesTextField.setFont(new Font("Verdana", Font.BOLD, 14));
		milesTextField.setColumns(10);
		milesTextField.setBounds(548, 265, 90, 42);
		contentPane.add(milesTextField);
		
		JLabel milesLabel = new JLabel("Miles");
		milesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		milesLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		milesLabel.setBounds(473, 260, 65, 47);
		contentPane.add(milesLabel);
		
		JLabel lblNewLabel = new JLabel("Height Converter");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(203, 10, 286, 26);
		contentPane.add(lblNewLabel);
	}
}
