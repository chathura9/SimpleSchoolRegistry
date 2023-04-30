package oopProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class schoolRegistry {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					schoolRegistry window = new schoolRegistry();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public schoolRegistry() {
		initialize();
	}
	
	private String[] header = {"Name","Age","Gender","Grade","Salary","Type"};
	private DefaultTableModel dtm = new DefaultTableModel(null,header);
	private JTextField teacherName;
	private JTextField teacherAge;
	private JTextField teacherSalary;
	private JTextField studentName;
	private JTextField studentAge;
	private JTextField studentGrade;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(0, 255, 255));
		frame.setForeground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 716, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JTable table = new JTable(dtm);
		table.setBackground(new Color(72, 209, 204));
		JScrollPane scrollPane = new JScrollPane(table);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(170, 171, 213));
		frame.getContentPane().add(panel, BorderLayout.EAST);
		
		JLabel teacherTable = new JLabel("Teacher Information");
		teacherTable.setForeground(new Color(0, 0, 255));
		teacherTable.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("Name: ");
		
		teacherName = new JTextField();
		teacherName.setBackground(new Color(211, 211, 211));
		teacherName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Age: ");
		
		teacherAge = new JTextField();
		teacherAge.setBackground(new Color(211, 211, 211));
		teacherAge.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Salary: ");
		
		teacherSalary = new JTextField();
		teacherSalary.setBackground(new Color(211, 211, 211));
		teacherSalary.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Gender: ");
		
		JRadioButton teacherMale = new JRadioButton("Male");
		teacherMale.setBackground(new Color(170, 171, 213));
		
		JRadioButton teacherFemale = new JRadioButton("Female");
		teacherFemale.setBackground(new Color(170, 171, 213));
		
		JButton teacherBtn = new JButton("Add");
		teacherBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(teacherMale.isSelected()) {
					addTeacher("Male");
				}
				else if (teacherFemale.isSelected()) {
					addTeacher("Female");
				}
				
			}
			
		});
		teacherBtn.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		
		JLabel lblNewLabel_3 = new JLabel("Student Information");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		
		JLabel lblNewLabel_4 = new JLabel("Name: ");
		
		JLabel lblNewLabel_1_1 = new JLabel("Age: ");
		
		studentName = new JTextField();
		studentName.setBackground(new Color(211, 211, 211));
		studentName.setColumns(10);
		
		studentAge = new JTextField();
		studentAge.setBackground(new Color(211, 211, 211));
		studentAge.setColumns(10);
		
		JLabel student = new JLabel("Grade: ");
		
		studentGrade = new JTextField();
		studentGrade.setBackground(new Color(211, 211, 211));
		studentGrade.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Gender: ");
		
		JRadioButton studentMale = new JRadioButton("Male");
		studentMale.setBackground(new Color(170, 171, 213));
		
		JRadioButton studentFemale = new JRadioButton("Female");
		studentFemale.setBackground(new Color(170, 171, 213));
		
		JButton studentBtn_1 = new JButton("Add");
		studentBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(studentMale.isSelected()) {
					addStudent("Male");
				}
				else if (studentFemale.isSelected()) {
					addStudent("Female");
				}
			}
		});
		
		studentBtn_1.setBackground(UIManager.getColor("CheckBoxMenuItem.background"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
									.addComponent(teacherAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
									.addComponent(teacherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(teacherTable)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_2_1))
									.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(teacherMale)
										.addComponent(teacherSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(teacherFemale)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(21)
											.addComponent(teacherBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_3))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(student, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGap(34)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(studentGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(studentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(studentAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_2_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(20)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(studentFemale)
										.addComponent(studentMale, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap(116, Short.MAX_VALUE)
							.addComponent(studentBtn_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(teacherTable)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(teacherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(teacherAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(teacherSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1)
						.addComponent(teacherMale))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(teacherFemale)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(teacherBtn)
					.addGap(18)
					.addComponent(lblNewLabel_3)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(studentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_4)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(studentAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_1)))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(student))
						.addComponent(studentGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(studentMale))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel_2_1_1)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(studentFemale)
					.addGap(7)
					.addComponent(studentBtn_1)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	

	public void addTeacher(String gender) {
		Teacher teacher = new Teacher();
		teacher.setName(teacherName.getText());
		teacher.setAge(Integer.parseInt(teacherAge.getText()));
		teacher.setSalary(Integer.parseInt(teacherSalary.getText()) );
		teacher.setGender(gender);
		
		dtm.addRow(new Object[] {
				teacher.getName(),
				teacher.getAge(),
				teacher.getGender(),
				"N/A",
				teacher.getSalary(),
				teacher.myType()
		});
	}
		public void addStudent(String gender) {
			Student student = new Student();
			student.setName(studentName.getText());
			student.setAge(Integer.parseInt(studentAge.getText()));
			student.setGrade(Integer.parseInt(studentGrade.getText()));
			//teacher.setSalary(Integer.parseInt(teacherSalary.getText()) );
			student.setGender(gender);
			
			dtm.addRow(new Object[] {
					student.getName(),
					student.getAge(),
					student.getGender(),
					student.getGrade(),
					"N/A",
					student.myType()
			});
	}
	
}

