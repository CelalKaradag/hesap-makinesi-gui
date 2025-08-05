package gUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class hesapmakinesi {

	static String ilkSayi = "";
	static String islem = "";

	public static void main(String[] args) {
		JFrame frame =new JFrame("DENEME");
		frame.setSize(400,525);
		JTextField text=new JTextField(90);
		text.setBounds(5,5,375,100);
		frame.add(text);
		text.setFont(new Font("Arial",Font.BOLD,50));


		JButton btn1=new JButton("1");
		btn1.setBounds(5,105,90,90);
		frame.add(btn1);
		btn1.setFont(new Font("Arial",Font.BOLD,50));
		btn1.setBackground(Color.BLUE);
		btn1.addActionListener(e -> text.setText(text.getText()+"1"));

		JButton btn2=new JButton("2");
		btn2.setBounds(100,105,90,90);
		frame.add(btn2);
		btn2.setBackground(Color.BLUE);
		btn2.addActionListener(e -> text.setText(text.getText()+"2"));
		btn2.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn3=new JButton("3");
		btn3.setBounds(195,105,90,90);
		frame.add(btn3);
		btn3.setBackground(Color.BLUE);
		btn3.addActionListener(e -> text.setText(text.getText()+"3"));
		btn3.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn4=new JButton("x");
		btn4.setBounds(290,105,90,90);
		frame.add(btn4);
		btn4.setBackground(Color.BLUE);
		btn4.setFont(new Font("Arial",Font.BOLD,50));
		btn4.addActionListener(e -> {
			ilkSayi = text.getText();
			islem = "x";
			text.setText("");
		});

		JButton btn5=new JButton("4");
		btn5.setBounds(5,200,90,90);
		frame.add(btn5);
		btn5.setBackground(Color.BLUE);
		btn5.addActionListener(e -> text.setText(text.getText()+"4"));
		btn5.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn6=new JButton("5");
		btn6.setBounds(100,200,90,90);
		frame.add(btn6);
		btn6.addActionListener(e -> text.setText(text.getText()+"5"));
		btn6.setBackground(Color.BLUE);
		btn6.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn7=new JButton("6");
		btn7.setBounds(195,200,90,90);
		frame.add(btn7);
		btn7.setBackground(Color.BLUE);
		btn7.addActionListener(e -> text.setText(text.getText()+"6"));
		btn7.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn8=new JButton("-");
		btn8.setBounds(290,200,90,90);
		frame.add(btn8);
		btn8.setBackground(Color.BLUE);
		btn8.addActionListener(e -> {
			ilkSayi = text.getText();
			islem = "-";
			text.setText("");
		});
		btn8.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn9=new JButton("7");
		btn9.setBounds(5,295,90,90);
		frame.add(btn9);
		btn9.setBackground(Color.BLUE);
		btn9.addActionListener(e -> text.setText(text.getText()+"7"));
		btn9.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn10=new JButton("8");
		btn10.setBounds(100,295,90,90);
		frame.add(btn10);
		btn10.setBackground(Color.BLUE);
		btn10.addActionListener(e -> text.setText(text.getText()+"8"));
		btn10.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn11=new JButton("9");
		btn11.setBounds(195,295,90,90);
		frame.add(btn11);
		btn11.setBackground(Color.BLUE);
		btn11.addActionListener(e -> text.setText(text.getText()+"9"));
		btn11.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn12=new JButton("+");
		btn12.setBounds(290,295,90,90);
		frame.add(btn12);
		btn12.setBackground(Color.BLUE);
		btn12.addActionListener(e -> {
			ilkSayi = text.getText();
			islem = "+";
			text.setText("");
		});
		btn12.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn15=new JButton("C");
		btn15.setBounds(5,390,90,90);
		frame.add(btn15);
		btn15.setBackground(Color.BLUE);
		btn15.addActionListener(e -> text.setText(""));
		btn15.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn13=new JButton("0");
		btn13.setBounds(100,390,90,90);
		frame.add(btn13);
		btn13.setBackground(Color.BLUE);
		btn13.addActionListener(e -> text.setText(text.getText()+"0"));
		btn13.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn14=new JButton("/");
		btn14.setBounds(195,390,90,90);
		frame.add(btn14);
		btn14.setBackground(Color.BLUE);
		btn14.addActionListener(e -> {
			ilkSayi = text.getText();
			islem = "/";
			text.setText("");
		});
		btn14.setFont(new Font("Arial",Font.BOLD,50));

		JButton btn16=new JButton("=");
		btn16.setBounds(290,390,90,90);
		frame.add(btn16);
		btn16.setBackground(Color.BLUE);
		btn16.setFont(new Font("Arial",Font.BOLD,50));
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ikinciSayi = text.getText();
				try {
					double sayi1 = Double.parseDouble(ilkSayi);
					double sayi2 = Double.parseDouble(ikinciSayi);
					double sonuc = 0;

					switch (islem) {
						case "+": sonuc = sayi1 + sayi2; break;
						case "-": sonuc = sayi1 - sayi2; break;
						case "x": sonuc = sayi1 * sayi2; break;
						case "/": 
							if (sayi2 != 0) sonuc = sayi1 / sayi2;
							else {
								text.setText("HATA");
								return;
							}
							break;
					}
					text.setText(String.valueOf(sonuc));
				} catch (NumberFormatException ex) {
					text.setText("HATA");
				}
			}
		});

		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}