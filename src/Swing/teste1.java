package Swing;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.github.lgooddatepicker.components.DatePicker;

public class teste1 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Teste");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel();		
		panel.add(new JLabel("CADASTRO"), posicionar(-1,-1));
		panel.setLayout(new GridBagLayout());
		
		
		panel.add(new JLabel("Nome:"), posicionar(0, 0));
		JTextField nomeField = new JTextField(20);
		panel.add(nomeField, posicionar(1, 0));
		
		panel.add(new JLabel("CPF:"), posicionar(0, 1));
		JTextField cpfField = new JTextField(20);
		panel.add(cpfField, posicionar(1, 1));
		
		panel.add(new JLabel("Email:"), posicionar(0, 2));
		JTextField emailField = new JTextField(20);
		panel.add(emailField, posicionar(1, 2));
		
		String[] options = {"", "Solteiro", "Casado","União Estável", "Viúvo"};
		
		panel.add(new JLabel("Condição:"), posicionar(0, 3));
		JComboBox <String> genero = new JComboBox <>(options);
		genero.addActionListener(e ->
		System.out.println("Condição: "+ genero.getSelectedItem()));
		panel.add(genero,posicionar(1, 3));
			
		JButton submitButton =new JButton("Salvar");
		panel.add(submitButton, posicionar(1, 4));
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nomeField.getText();
				JOptionPane.showConfirmDialog(frame, "Olá, "+ name + "!");
			}
		});
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
		
	}
	static GridBagConstraints posicionar(int x, int y) {
		var cts = new GridBagConstraints();
		cts.gridx = x;
		cts.gridy = y;
		cts.insets = new Insets(10,10,10,10);
		return cts;
		
	}

}
