package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.Periodo;

public class FrameCadastroAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblPeriodo;

	public FrameCadastroAlunos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula:");
		lblMatricula.setBounds(10, 14, 55, 14);
		contentPane.add(lblMatricula);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(62, 11, 111, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 42, 55, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(62, 39, 111, 20);
		contentPane.add(textNome);
		
		lblPeriodo = new JLabel("Per\u00EDodo:");
		lblPeriodo.setBounds(10, 73, 55, 14);
		contentPane.add(lblPeriodo);
		
		JComboBox comboPeriodo = new JComboBox();
		comboPeriodo.setModel(new DefaultComboBoxModel(Periodo.values()));
		comboPeriodo.setBounds(62, 69, 111, 22);
		contentPane.add(comboPeriodo);
		
		JButton btnSalvarAluno = new JButton("SalvarAluno");
		btnSalvarAluno.setBounds(49, 120, 124, 23);
		contentPane.add(btnSalvarAluno);
		
		JScrollPane scrollPaneListaDeAlunos = new JScrollPane();
		scrollPaneListaDeAlunos.setBounds(213, 39, 199, 211);
		contentPane.add(scrollPaneListaDeAlunos);
		
		JList listAlunos = new JList();
		scrollPaneListaDeAlunos.setViewportView(listAlunos);
		
		JLabel lblListaDeAlunos = new JLabel("Lista de Alunos:");
		lblListaDeAlunos.setBounds(212, 14, 85, 14);
		contentPane.add(lblListaDeAlunos);
	}
}
