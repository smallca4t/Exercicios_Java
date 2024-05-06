package veiculos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import javax.swing.JTextField;

public class GerenciamentoVeiculo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Cadastro cadastroVeiculo;
    private JTable table;
    private DefaultTableModel model;
    private JTextField textFieldmodelo;
    private JTextField textFieldmarca;
    private JTextField textFieldano;
    private JComboBox<String> comboBox;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GerenciamentoVeiculo frame = new GerenciamentoVeiculo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GerenciamentoVeiculo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 250, 600, 350);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.text);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel titulo = new JLabel("Cadastro de Veículos");
        titulo.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
        titulo.setBounds(24, 11, 214, 52);
        contentPane.add(titulo);

        JLabel lblmodelo = new JLabel("Modelo");
        lblmodelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblmodelo.setBounds(58, 73, 76, 19);
        contentPane.add(lblmodelo);

        textFieldmodelo = new JTextField();
        textFieldmodelo.setBounds(157, 75, 81, 19);
        contentPane.add(textFieldmodelo);
        textFieldmodelo.setColumns(10);

        JLabel lblMarca = new JLabel("Marca");
        lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblMarca.setBounds(58, 117, 76, 19);
        contentPane.add(lblMarca);

        textFieldmarca = new JTextField();
        textFieldmarca.setColumns(10);
        textFieldmarca.setBounds(157, 119, 81, 19);
        contentPane.add(textFieldmarca);

        JLabel lblTipo = new JLabel("Tipo");
        lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTipo.setBounds(58, 208, 76, 19);
        contentPane.add(lblTipo);

        JLabel lblCombustivel = new JLabel("Combustível:");
        lblCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblCombustivel.setBounds(58, 248, 91, 16);
        lblCombustivel.setVisible(false);
        contentPane.add(lblCombustivel);

        JLabel lblCilindrada = new JLabel("Cilindrada:");
        lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblCilindrada.setBounds(58, 250, 91, 13);
        lblCilindrada.setVisible(false);
        contentPane.add(lblCilindrada);

        JLabel lblCarga = new JLabel("Carga:");
        lblCarga.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblCarga.setBounds(58, 250, 91, 13);
        lblCarga.setVisible(false);
        contentPane.add(lblCarga);

        JTextField textFieldCaracteristicas = new JTextField();
        textFieldCaracteristicas.setBounds(157, 249, 81, 19);
        textFieldCaracteristicas.setVisible(false);
        contentPane.add(textFieldCaracteristicas);
        textFieldCaracteristicas.setColumns(10);

        comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "", "Carro", "Moto", "Caminhão" }));
        comboBox.setBounds(157, 209, 81, 21);
        contentPane.add(comboBox);

        JLabel lblAno = new JLabel("Ano");
        lblAno.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblAno.setBounds(58, 167, 76, 19);
        contentPane.add(lblAno);

        textFieldano = new JTextField();
        textFieldano.setColumns(10);
        textFieldano.setBounds(157, 169, 81, 19);
        contentPane.add(textFieldano);

        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedVehicle = (String) e.getItem();
                    System.out.println("Selecionado: " + selectedVehicle);

                    lblCombustivel.setVisible(selectedVehicle.equals("Carro"));
                    lblCilindrada.setVisible(selectedVehicle.equals("Moto"));
                    lblCarga.setVisible(selectedVehicle.equals("Caminhão"));

                    textFieldCaracteristicas.setVisible(selectedVehicle.equals("Carro") || selectedVehicle.equals("Moto")
                            || selectedVehicle.equals("Caminhão"));
                }
            }
        });

        JButton btnSalvar = new JButton("Cadastrar veículo");
        btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnSalvar.setBounds(321, 87, 135, 31);
        contentPane.add(btnSalvar);
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String modelo = textFieldmodelo.getText();
                String marca = textFieldmarca.getText();
                String tipo = (String) comboBox.getSelectedItem();
                String caracteristicas = textFieldCaracteristicas.getText();
                String ano = textFieldano.getText();

                if (modelo.isEmpty() || marca.isEmpty() || tipo.isEmpty() || ano.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                } else {
                    cadastroVeiculo.SalvarEmArquivo("dadosVeiculos.txt", modelo, marca, tipo, caracteristicas, ano);
                    JOptionPane.showMessageDialog(null, "Dados salvos!");
                }
            }
        });

        JButton btnListar = new JButton("Listar Veículos");
        btnListar.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnListar.setBounds(321, 147, 135, 31);
        contentPane.add(btnListar);
        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarVeiculos();
            }
        });

        cadastroVeiculo = new Cadastro(); // Inicializando a instância de Cadastro
    }

    private void listarVeiculos() {
        model = new DefaultTableModel();
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("Ano");
        model.addColumn("Tipo");
        model.addColumn("Combustível");

        try (BufferedReader reader = new BufferedReader(new FileReader("dadosVeiculos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 5) {
                    model.addRow(parts);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JButton btnAlterar = new JButton("Alterar");
        btnAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                int selectedColumn = table.getSelectedColumn();
                if (selectedRow != -1 && selectedColumn != -1) {
                    String columnName = table.getColumnName(selectedColumn);
                    String currentValue = (String) table.getValueAt(selectedRow, selectedColumn);
                    String newValue = JOptionPane.showInputDialog(null, "Novo valor para " + columnName + ":",
                            currentValue);
                    if (newValue != null && !newValue.isEmpty()) {
                        table.setValueAt(newValue, selectedRow, selectedColumn);
                        salvarAlteracoes(table, model); // Chamada para salvar as alterações no arquivo
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um campo para alterar.");
                }
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(btnAlterar, BorderLayout.SOUTH);

        JOptionPane.showMessageDialog(null, panel, "Lista de Veículos", JOptionPane.PLAIN_MESSAGE);
    }

    private void salvarAlteracoes(JTable table, DefaultTableModel model) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dadosVeiculos.txt"))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.write(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1) {
                        writer.write(", ");
                    }
                }
                writer.newLine();
            }
            writer.flush();
            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao salvar as alterações.");
        }
    }
}