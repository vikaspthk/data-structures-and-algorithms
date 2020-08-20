package com.oracle.vending;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Vending_Machine extends JFrame {

	private JPanel contentPane;
	private JTextField moneyTF;
	private JTextField changeTF;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	double money=0, moneyy=0, n=0;
	String test;
	final static double COST[]={23,25,21,25,25};
	double [] coins = {1,2,5,10,20};
	/**
	 * Launch the application.
	 */
	static int limit[]={5,5,5,5,5};
	private JTextField demoTF;
	private JTextField lemonTF;
	private JTextField cokeTF;
	private JTextField waterTF;
	private JTextField sliceTF;
	private JTextField pepsiTF;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vending_Machine frame = new Vending_Machine();
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
	public Vending_Machine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JFrame rootframe=new JFrame();
		
		
		JLabel lblVendingMachineSimulator = new JLabel("Vending Machine Simulator");
		lblVendingMachineSimulator.setHorizontalAlignment(SwingConstants.CENTER);
		lblVendingMachineSimulator.setBounds(10, 26, 534, 36);
		lblVendingMachineSimulator.setForeground(Color.BLUE);
		lblVendingMachineSimulator.setFont(new Font("Andalus", Font.BOLD, 32));
		contentPane.add(lblVendingMachineSimulator);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 73, 534, 287);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(panel);
		
		JRadioButton lemonRB = new JRadioButton("Lemon");
		lemonRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lemonRB.isSelected()){
					
					demoTF.setText("Price of Lemon is Rs. 23.00");
				}
			}
		});
		buttonGroup.add(lemonRB);
		lemonRB.setToolTipText("Rs. 23");
		lemonRB.setBounds(44, 141, 68, 23);
		
		JRadioButton cocacolaRB = new JRadioButton("Coca-Cola");
		cocacolaRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cocacolaRB.isSelected()){
					
					demoTF.setText("Price of Coca-cola is Rs. 25.00");
				}
			}
		});
		buttonGroup.add(cocacolaRB);
		cocacolaRB.setToolTipText("Rs. 25");
		cocacolaRB.setBounds(114, 141, 100, 23);
		
		JRadioButton waterRB = new JRadioButton("Water");
		waterRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(waterRB.isSelected()){
					
					demoTF.setText("Price of Water is Rs. 21.00");
				}
			}
		});
		buttonGroup.add(waterRB);
		waterRB.setToolTipText("Rs. 22");
		waterRB.setBounds(216, 141, 76, 23);
		
		JRadioButton sliceRB = new JRadioButton("Slice");
		sliceRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sliceRB.isSelected()){
					
					demoTF.setText("Price of Slice is Rs. 25.00");
				}
			}
		});
		buttonGroup.add(sliceRB);
		sliceRB.setToolTipText("Rs. 25");
		sliceRB.setBounds(294, 141, 86, 23);
		
		JRadioButton pepsiRB = new JRadioButton("Pepsi");
		pepsiRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pepsiRB.isSelected()){
					
					demoTF.setText("Price of Pepsi is Rs. 25.00");
				}
			}
		});
		buttonGroup.add(pepsiRB);
		pepsiRB.setToolTipText("Rs. 25");
		pepsiRB.setBounds(382, 141, 89, 23);
		panel.setLayout(null);
		panel.add(lemonRB);
		panel.add(cocacolaRB);
		panel.add(waterRB);
		panel.add(sliceRB);
		panel.add(pepsiRB);
		
		
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this will work only if we have enough money
				
				//money=Double.parseDouble(moneyTF.getText());
				//money=Double.parseDouble(test);
				if(lemonRB.isSelected()){
					
					if(limit[0]<=0){
						JOptionPane.showMessageDialog(rootframe, "Sorry no lemon drink present");
					}else
					n=n-COST[0];
					limit[0]--;
					
				}
				else if(waterRB.isSelected()){
					if(limit[2]<=0){
						JOptionPane.showMessageDialog(rootframe, "Sorry no lemon drink present");
					}else
					n=n-COST[2];
					limit[2]--;
				}
				else if(cocacolaRB.isSelected()){
					if(limit[1]<=0){
						JOptionPane.showMessageDialog(rootframe, "Sorry no lemon drink present");
					}else
					
					n=n-COST[1];
					limit[1]--;
				}
				else if(sliceRB.isSelected()){
					if(limit[3]<=0){
						JOptionPane.showMessageDialog(rootframe, "Sorry no lemon drink present");
					}else
					
					n=n-COST[3];
					limit[3]--;
				}
				else if(pepsiRB.isSelected()){
					if(limit[4]<=0){
						JOptionPane.showMessageDialog(rootframe, "Sorry no lemon drink present");
					}else
					
					n=n-COST[4];
					limit[4]--;
				}
				
				if (n<0){
					JOptionPane.showMessageDialog(rootframe, "Sorry You dont have enough money plz add few more bucks");
				}else{
					Vending_Machine vm=new Vending_Machine();
					changeTF.setText(Double.toString(n));
					double change=Double.parseDouble(changeTF.getText());
					JOptionPane.showMessageDialog(rootframe, "Plz collect your Product and Change Rs. "+change);
					vm.coinChangeDP(coins, change);
					
				}
				lemonRB.setSelected(false);
				waterRB.setSelected(false);
				cocacolaRB.setSelected(false);
				pepsiRB.setSelected(false);
				sliceRB.setSelected(false);
				moneyTF.setText(" ");
				changeTF.setText(" ");
				demoTF.setText(" ");
				n=0;
				lemonTF.setText(Integer.toString(limit[0]));
				cokeTF.setText(Integer.toString(limit[1]));
				waterTF.setText(Integer.toString(limit[2]));
				sliceTF.setText(Integer.toString(limit[3]));
				pepsiTF.setText(Integer.toString(limit[4]));
			}
		});
		btnPurchase.setBounds(141, 253, 89, 23);
		panel.add(btnPurchase);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(rootframe,"Thank you.. Please collect your cash Rs. "+money);
				System.exit(0);
			}
		});
		btnCancel.setBounds(260, 253, 89, 23);
		panel.add(btnCancel);
		
		JLabel lblInsertMoney = new JLabel("Inserted Money:");
		lblInsertMoney.setBounds(71, 55, 100, 14);
		panel.add(lblInsertMoney);
		 
		JLabel lblChange = new JLabel("Change:");
		lblChange.setBounds(110, 96, 46, 14);
		panel.add(lblChange);
		
		moneyTF = new JTextField();
		moneyTF.setEditable(false);
		moneyTF.setBounds(181, 52, 86, 20);
		panel.add(moneyTF);
		moneyTF.setColumns(10);
		
		
		
		changeTF = new JTextField();
		changeTF.setEditable(false);
		changeTF.setBounds(181, 93, 86, 20);
		panel.add(changeTF);
		changeTF.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while(true){
				
				test=JOptionPane.showInputDialog("Insert Coins");
				int a=Integer.parseInt(test);
				if(a==5 || a==10|| a==2||a==1){
					
					n=n+a;
					moneyTF.setText(Double.toString(n));
				}
				else{JOptionPane.showMessageDialog(rootframe, "Invalid coin, plz insert valid coin");}
				if(test==null){
				break;}
				
				}
				//moneyTF.setText(Double.toString(n));
				
			}
		});
		btnInsert.setBounds(291, 63, 89, 23);
		panel.add(btnInsert);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWelcome.setBounds(181, 11, 94, 14);
		panel.add(lblWelcome);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 122, 1, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 231, 483, 2);
		panel.add(separator_1);
		
		demoTF = new JTextField();
		demoTF.setHorizontalAlignment(SwingConstants.CENTER);
		demoTF.setEditable(false);
		demoTF.setBackground(null);
		demoTF.setBounds(87, 200, 340, 20);
		panel.add(demoTF);
		demoTF.setBorder(null);
		demoTF.setColumns(10);
		
		lemonTF = new JTextField();
		lemonTF.setToolTipText("Stock");
		lemonTF.setHorizontalAlignment(SwingConstants.CENTER);
		lemonTF.setEditable(false);
		lemonTF.setBounds(54, 169, 41, 20);
		panel.add(lemonTF);
		lemonTF.setColumns(10);
		
		
		JLabel lblToRaviGupta = new JLabel("To: Ravi gupta");
		lblToRaviGupta.setBounds(41, 360, 114, 14);
		contentPane.add(lblToRaviGupta);
		
		JLabel lblByVikasPathak = new JLabel("By: Vikas Pathak");
		lblByVikasPathak.setBounds(441, 360, 113, 14);
		contentPane.add(lblByVikasPathak);
		lemonTF.setText(Integer.toString(limit[0]));
		
		cokeTF = new JTextField();
		cokeTF.setToolTipText("Stock");
		cokeTF.setHorizontalAlignment(SwingConstants.CENTER);
		cokeTF.setEditable(false);
		cokeTF.setBounds(130, 169, 41, 20);
		panel.add(cokeTF);
		cokeTF.setColumns(10);
		cokeTF.setText(Integer.toString(limit[1]));
		
		waterTF = new JTextField();
		waterTF.setHorizontalAlignment(SwingConstants.CENTER);
		waterTF.setEditable(false);
		waterTF.setBounds(226, 171, 35, 20);
		panel.add(waterTF);
		waterTF.setColumns(10);
		waterTF.setText(Integer.toString(limit[2]));
		
		sliceTF = new JTextField();
		sliceTF.setHorizontalAlignment(SwingConstants.CENTER);
		sliceTF.setEditable(false);
		sliceTF.setBounds(314, 169, 35, 20);
		panel.add(sliceTF);
		sliceTF.setColumns(10);
		sliceTF.setText(Integer.toString(limit[3]));
		
		pepsiTF = new JTextField();
		pepsiTF.setHorizontalAlignment(SwingConstants.CENTER);
		pepsiTF.setEditable(false);
		pepsiTF.setBounds(407, 171, 29, 20);
		panel.add(pepsiTF);
		pepsiTF.setColumns(10);
		pepsiTF.setText(Integer.toString(limit[4]));
		
	}
	
	public double coinChangeDP(double[] coins, double total) {
		
		double len = coins.length;
		double [] T = new double[(int) (total+1)];
		double [] R = new double[(int) (total+1)];
		T[0] = 0;

		for (double i=1; i<=total; i++) {
			T[(int) i] = Integer.MAX_VALUE - 1;
			R[(int) i] = -1;
		}
		
		for (double j=0; j<coins.length; j++) {
			for (double i=1; i<= total; i++) {
				if (i >= coins[(int) j]) {
					if (T[(int) (i-coins[(int) j])]+1 < T[(int) i]) {
						T[(int) i] = 1 + T[(int) (i - coins[(int) j])];
						R[(int) i] = j;
					}
				}
			}
		}
		
		printCoins(R, coins);
		return T[(int) total];
	}
	
	private void printCoins(double R[], double coins[]) {
        if (R[R.length - 1] == -1) {
            System.out.println("Solution not possible!");
            return;
        }
        double start = R.length - 1;
        System.out.print("Coins for Total: ");
        while ( start != 0 ) {
            double j = R[(int) start];
            //System.out.print(coins[(int) j] + " ");
            JOptionPane.showMessageDialog(null, "coin: "+coins[(int) j] +" ");
            start = start - coins[(int) j];
        }
    }
	
	
	
	
	
	
	
}
