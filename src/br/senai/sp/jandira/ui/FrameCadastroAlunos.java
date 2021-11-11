package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

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
import javax.swing.DefaultListModel;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Periodo;
import br.senai.sp.jandira.repository.AlunoRepository;

public class FrameCadastroAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblPeriodo;
	private int posicao;

	public FrameCadastroAlunos() {
		
		//Exemplo de Uso do For Each
		
		/*String[] diasDaSemana = {
				"Domingo",
				"Segunda",
				"Terça",
				"Quarta",
				"Quinta",
				"Sexta",
				"Sábado"
		};
		
		for(String dia : diasDaSemana) {
			System.out.println(dia);
		}*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula:");
		lblMatricula.setBounds(10, 14, 66, 14);
		contentPane.add(lblMatricula);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(75, 11, 111, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 42, 66, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(75, 39, 111, 20);
		contentPane.add(textNome);
		
		lblPeriodo = new JLabel("Per\u00EDodo:");
		lblPeriodo.setBounds(10, 73, 55, 14);
		contentPane.add(lblPeriodo);
		
		JComboBox comboPeriodo = new JComboBox();
		DefaultComboBoxModel<String> modelPeriodos = new DefaultComboBoxModel<String>();
		
		for (Periodo p : Periodo.values()) {
			modelPeriodos.addElement(p.getDescrição());
		}
		
		comboPeriodo.setModel(modelPeriodos);
		comboPeriodo.setBounds(62, 69, 111, 22);
		contentPane.add(comboPeriodo);
		
		JButton btnSalvarAluno = new JButton("Salvar Aluno");
		btnSalvarAluno.setBounds(49, 120, 124, 23);
		contentPane.add(btnSalvarAluno);
		
		JScrollPane scrollPaneListaDeAlunos = new JScrollPane();
		scrollPaneListaDeAlunos.setBounds(213, 39, 199, 211);
		contentPane.add(scrollPaneListaDeAlunos);
		
		DefaultListModel<String> listaModel = new DefaultListModel<String>();
		
		JList listAlunos = new JList(listaModel);
		scrollPaneListaDeAlunos.setViewportView(listAlunos);
		
		JLabel lblListaDeAlunos = new JLabel("Lista de Alunos:");
		lblListaDeAlunos.setBounds(212, 14, 124, 14);
		contentPane.add(lblListaDeAlunos);
		
		JButton btnExibirAlunos = new JButton("Exibir Alunos");
		btnExibirAlunos.setBounds(49, 154, 124, 23);
		contentPane.add(btnExibirAlunos);
		
		AlunoRepository turma = new AlunoRepository(3);
		
		btnSalvarAluno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				aluno.setMatricula(textMatricula.getText());
				aluno.setNome(textNome.getText());
				
				turma.gravar(aluno, posicao);
				posicao++;
				
				//Adicionar o nome do aluno ao model da lista
				
				listaModel.addElement(aluno.getNome());
				
			}
		});
		
		btnExibirAlunos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(Aluno aluno : turma.listarTodos()) {
					System.out.println(aluno.getNome());
					System.out.println(aluno.getMatricula());
					System.out.println("------------------");
				}
				
			}
		});
	}
}
