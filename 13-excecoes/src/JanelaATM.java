import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaATM extends JFrame {

	ATM atm = new ATM(2283982);
	
	public JanelaATM() {
		
		JLabel lbAbastecer = new JLabel("Abastecer");
		JLabel lbRetirar = new JLabel("Retirar");
		JComboBox cbCedula = 
				new JComboBox(new Object[] {5, 10, 20, 50, 100});
		JTextField tfQtdCedulas =
				new JTextField(10);
		JButton btAbastecer = new JButton("Abastecer");
		JTextField tfValorRetirar =
				new JTextField(10);
		JButton btRetirar = new JButton("Retirar");
		JLabel lbCedulas = new JLabel("Cédulas:");
		JLabel lbCedulasDisponiveis 
			= new JLabel("5: 0, 10: 0, 20: 0, 50: 0, 100:0");
		
		this.setLayout(new FlowLayout());
		
		this.getContentPane().add(lbAbastecer);
		this.getContentPane().add(cbCedula);
		this.getContentPane().add(tfQtdCedulas);
		this.getContentPane().add(btAbastecer);
				
		this.getContentPane().add(lbRetirar);
		this.getContentPane().add(tfValorRetirar);
		this.getContentPane().add(btRetirar);
		
		this.getContentPane().add(lbCedulas);
		this.getContentPane().add(lbCedulasDisponiveis);
		
		
		this.pack();
		
		this.setTitle("ATM");
		//this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		btAbastecer.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				int numero = 
						Integer.parseInt(tfQtdCedulas.getText());
				int cedulas = 
						(int) cbCedula.getSelectedItem(); 
				try {
					atm.abastecer(numero, cedulas);
					lbCedulasDisponiveis.setText(atm.toString());
				} catch (IllegalArgumentException ex) {
					JOptionPane
						.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		
		btRetirar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor = Integer.parseInt(tfValorRetirar.getText());
				atm.retirar(valor);				
				lbCedulasDisponiveis.setText(atm.toString());
			}
		});
		
		
		
		
		
		
		
		
	}
	
}
