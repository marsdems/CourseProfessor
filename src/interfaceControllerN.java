import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.BevelBorder;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;

// Test comment
public class interfaceControllerN {

	private JFrame frame;
	private final JPanel loginPage = new JPanel();
	private final CardLayout cl_Content = new CardLayout(10, 14);
	private final JPanel Content = new JPanel();
	private final JPanel courseSelection = new JPanel();
	private final JPanel CoursePage = new JPanel();
	private final JPanel FeedBack = new JPanel();
	private final JPanel Schedule = new JPanel();
	private final JLabel SelectProfTest = new JLabel("Select a Professor to see \r\nRatings and Feedback");
	private final JList cProfessorList = new JList();
	private final JButton btnViewSyllabus = new JButton("View Syllabus");
	private final JLabel lblFeedback = new JLabel("FeedBack");
	private final JTextPane viewFeedback = new JTextPane();
	private final JButton btnLeaveFeedback = new JButton("Leave FeedBack");
	private final JList cTimeList = new JList();
	private final JLabel lblSelectATime = new JLabel("Select a Time");
	private final JButton btnAddToSchedule = new JButton("Add to Schedule");
	private final JLabel lblPickProfessorYour = new JLabel("Pick Professor your Leaving Feedback for");
	private final JButton btnAddFeedback = new JButton("Add FeedBack");
	private final JLabel lblEnterARating = new JLabel("Select a Rating");
	private final JLabel lblWriteCommentsHere = new JLabel("Write Comments Here");
	private final JTextArea feedbacktxt = new JTextArea();
	private final JList fPickProf = new JList();
	private final JSpinner rateSpinner = new JSpinner();
	private final JLabel lblStars = new JLabel("Stars");
	private final JLabel schLbl = new JLabel("Schedule");
	private final JButton btnGoBackTo = new JButton("Go Back to Course Selection");
	private final JTextPane scheduleDisplay = new JTextPane();
	private final JButton btnBackToSelector = new JButton("Back to Selector");
	private final JPanel ProfessorPage = new JPanel();
	private final JPanel TimePage = new JPanel();
	private final JButton btnBackToSelector_1 = new JButton("Back to Selector");
	private final JLabel lblCoursesThey = new JLabel("Courses They're Teaching");
	private final JTextPane pViewFeedBack = new JTextPane();
	private final JLabel lblOtherUserFeedback = new JLabel("Other User Feedback");
	private final JButton btnViewCourse = new JButton("View Course");
	private final JList pCourseList = new JList();
	
	
	//Variables I will need to get correct information:
	
	private String selectedCourse;
	private String selectedProf;
	private String User;
	private final JPanel SearchResults = new JPanel();
	private final JButton btnViewSelectedCo = new JButton("View Selected Course");
	private final JList resultslist = new JList();
	private final JLabel resultsLabel = new JLabel("Course Search Results");
	private final JLabel lblUsername = new JLabel("Username:");
	private final JTextField UserNameTxt = new JTextField();
	private final JLabel lblPassword = new JLabel("Password:");
	private final JPasswordField PassTxt = new JPasswordField();
	private final JButton btnRegister = new JButton("Register...");
	private final JButton btnLogin = new JButton("Login");
	private final JPanel byCourseContainer = new JPanel();
	private final JLabel lblSelectADepartment = new JLabel("Select a Department:");
	private final JComboBox comboBox = new JComboBox();
	private final JLabel lblCourseNumber = new JLabel("Course Number:");
	private final JFormattedTextField textField = new JFormattedTextField();
	private final JLabel lblEnterStartTime = new JLabel("Enter Start Time:");
	private final JFormattedTextField formattedTextField = new JFormattedTextField();
	private final JButton btnFindCourses = new JButton("Find Courses...");
	private final JLabel lblSearchForCourses = new JLabel("Search by Course");
	private final JLabel lblSearchByProfessor = new JLabel("Search by Professor");
	private final JPanel byProfessorContainer = new JPanel();
	private final JLabel lblProfessorsLastname = new JLabel("Professor's Lastname:");
	private final JTextField textField_1 = new JTextField();
	private final JButton btnFindCourses_1 = new JButton("Find Courses...");
	private final JButton btnViewSchedule = new JButton("View Schedule");
	private final JButton btnLogout = new JButton("Logout");
	private final Component horizontalStrut = Box.createHorizontalStrut(20);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceControllerN window = new interfaceControllerN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	
	//TODO: Create here instance of the classes that will hold information
	//this will include Course, Professor, User, Schedule(the ones they made)
	public interfaceControllerN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 542, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(Content);
		Content.setLayout(cl_Content);
		Content.add(loginPage, "login");
		//frame.setSize(new Dimension(500, 150));
		GridBagLayout gbl_loginPage = new GridBagLayout();
		gbl_loginPage.columnWidths = new int[]{0, 0, 298, 0, 0, 0};
		gbl_loginPage.rowHeights = new int[]{0, 0, 0, 0};
		gbl_loginPage.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_loginPage.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		loginPage.setLayout(gbl_loginPage);
		
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.gridx = 1;
		gbc_lblUsername.gridy = 0;
		loginPage.add(lblUsername, gbc_lblUsername);
		
		GridBagConstraints gbc_UserNameTxt = new GridBagConstraints();
		gbc_UserNameTxt.gridwidth = 2;
		gbc_UserNameTxt.insets = new Insets(0, 0, 5, 5);
		gbc_UserNameTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_UserNameTxt.gridx = 2;
		gbc_UserNameTxt.gridy = 0;
		loginPage.add(UserNameTxt, gbc_UserNameTxt);
		
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 1;
		loginPage.add(lblPassword, gbc_lblPassword);
		
		GridBagConstraints gbc_PassTxt = new GridBagConstraints();
		gbc_PassTxt.gridwidth = 2;
		gbc_PassTxt.insets = new Insets(0, 0, 5, 5);
		gbc_PassTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_PassTxt.gridx = 2;
		gbc_PassTxt.gridy = 1;
		loginPage.add(PassTxt, gbc_PassTxt);
		
		GridBagConstraints gbc_btnRegister = new GridBagConstraints();
		gbc_btnRegister.anchor = GridBagConstraints.EAST;
		gbc_btnRegister.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegister.gridx = 2;
		gbc_btnRegister.gridy = 2;
		btnRegister.addActionListener(new BtnRegisterActionListener());
		loginPage.add(btnRegister, gbc_btnRegister);
		
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridx = 3;
		gbc_btnLogin.gridy = 2;
		btnLogin.addActionListener(new BtnLoginActionListener());
		loginPage.add(btnLogin, gbc_btnLogin);
		
		Content.add(courseSelection, "findCourses");
		GridBagLayout gbl_courseSelection = new GridBagLayout();
		gbl_courseSelection.columnWidths = new int[]{167, 105, 0};
		gbl_courseSelection.rowHeights = new int[]{0, 0, 116, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_courseSelection.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_courseSelection.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		courseSelection.setLayout(gbl_courseSelection);
		
		GridBagConstraints gbc_lblSearchForCourses = new GridBagConstraints();
		gbc_lblSearchForCourses.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblSearchForCourses.insets = new Insets(0, 0, 5, 5);
		gbc_lblSearchForCourses.gridx = 0;
		gbc_lblSearchForCourses.gridy = 0;
		courseSelection.add(lblSearchForCourses, gbc_lblSearchForCourses);
		
		GridBagConstraints gbc_byCourseContainer = new GridBagConstraints();
		gbc_byCourseContainer.insets = new Insets(0, 0, 5, 0);
		gbc_byCourseContainer.gridheight = 2;
		gbc_byCourseContainer.gridwidth = 2;
		gbc_byCourseContainer.fill = GridBagConstraints.BOTH;
		gbc_byCourseContainer.gridx = 0;
		gbc_byCourseContainer.gridy = 1;
		byCourseContainer.setBorder(new LineBorder(new Color(0, 0, 0)));
		courseSelection.add(byCourseContainer, gbc_byCourseContainer);
		GridBagLayout gbl_byCourseContainer = new GridBagLayout();
		gbl_byCourseContainer.columnWidths = new int[]{16, 94, -2, 0};
		gbl_byCourseContainer.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_byCourseContainer.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_byCourseContainer.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		byCourseContainer.setLayout(gbl_byCourseContainer);
		
		GridBagConstraints gbc_lblSelectADepartment = new GridBagConstraints();
		gbc_lblSelectADepartment.anchor = GridBagConstraints.WEST;
		gbc_lblSelectADepartment.gridwidth = 2;
		gbc_lblSelectADepartment.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectADepartment.gridx = 0;
		gbc_lblSelectADepartment.gridy = 0;
		lblSelectADepartment.setBorder(new EmptyBorder(5, 5, 0, 0));
		byCourseContainer.add(lblSelectADepartment, gbc_lblSelectADepartment);
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 5, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Business (BUS)", "Computer Science (CSE)", "Marketing (MKT)", "Statistics (STA)", "Mathematics (MTH)"}));
		byCourseContainer.add(comboBox, gbc_comboBox);
		
		GridBagConstraints gbc_lblCourseNumber = new GridBagConstraints();
		gbc_lblCourseNumber.anchor = GridBagConstraints.EAST;
		gbc_lblCourseNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourseNumber.gridx = 0;
		gbc_lblCourseNumber.gridy = 2;
		lblCourseNumber.setBorder(new EmptyBorder(0, 5, 0, 0));
		byCourseContainer.add(lblCourseNumber, gbc_lblCourseNumber);
		textField.setColumns(10);
		
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		byCourseContainer.add(textField, gbc_textField);
		
		GridBagConstraints gbc_lblEnterStartTime = new GridBagConstraints();
		gbc_lblEnterStartTime.anchor = GridBagConstraints.EAST;
		gbc_lblEnterStartTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterStartTime.gridx = 0;
		gbc_lblEnterStartTime.gridy = 3;
		byCourseContainer.add(lblEnterStartTime, gbc_lblEnterStartTime);
		
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.gridwidth = 2;
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 1;
		gbc_formattedTextField.gridy = 3;
		byCourseContainer.add(formattedTextField, gbc_formattedTextField);
		
		GridBagConstraints gbc_btnFindCourses = new GridBagConstraints();
		gbc_btnFindCourses.gridwidth = 2;
		gbc_btnFindCourses.anchor = GridBagConstraints.EAST;
		gbc_btnFindCourses.insets = new Insets(0, 0, 0, 5);
		gbc_btnFindCourses.gridx = 1;
		gbc_btnFindCourses.gridy = 4;
		btnFindCourses.addActionListener(new BtnFindCoursesActionListener());
		byCourseContainer.add(btnFindCourses, gbc_btnFindCourses);
		
		GridBagConstraints gbc_lblSearchByProfessor = new GridBagConstraints();
		gbc_lblSearchByProfessor.anchor = GridBagConstraints.WEST;
		gbc_lblSearchByProfessor.insets = new Insets(0, 0, 5, 5);
		gbc_lblSearchByProfessor.gridx = 0;
		gbc_lblSearchByProfessor.gridy = 4;
		courseSelection.add(lblSearchByProfessor, gbc_lblSearchByProfessor);
		
		GridBagConstraints gbc_byProfessorContainer = new GridBagConstraints();
		gbc_byProfessorContainer.insets = new Insets(0, 0, 5, 0);
		gbc_byProfessorContainer.gridheight = 2;
		gbc_byProfessorContainer.gridwidth = 2;
		gbc_byProfessorContainer.fill = GridBagConstraints.VERTICAL;
		gbc_byProfessorContainer.gridx = 0;
		gbc_byProfessorContainer.gridy = 5;
		byProfessorContainer.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		courseSelection.add(byProfessorContainer, gbc_byProfessorContainer);
		GridBagLayout gbl_byProfessorContainer = new GridBagLayout();
		gbl_byProfessorContainer.columnWidths = new int[]{126, 0, 124, 0};
		gbl_byProfessorContainer.rowHeights = new int[]{0, 0, 0, 0};
		gbl_byProfessorContainer.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_byProfessorContainer.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		byProfessorContainer.setLayout(gbl_byProfessorContainer);
		
		GridBagConstraints gbc_lblProfessorsLastname = new GridBagConstraints();
		gbc_lblProfessorsLastname.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblProfessorsLastname.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfessorsLastname.gridx = 0;
		gbc_lblProfessorsLastname.gridy = 0;
		lblProfessorsLastname.setBorder(new EmptyBorder(5, 5, 0, 0));
		byProfessorContainer.add(lblProfessorsLastname, gbc_lblProfessorsLastname);
		textField_1.setColumns(10);
		
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 5, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 1;
		byProfessorContainer.add(textField_1, gbc_textField_1);
		
		GridBagConstraints gbc_btnFindCourses_1 = new GridBagConstraints();
		gbc_btnFindCourses_1.gridwidth = 2;
		gbc_btnFindCourses_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnFindCourses_1.anchor = GridBagConstraints.EAST;
		gbc_btnFindCourses_1.gridx = 1;
		gbc_btnFindCourses_1.gridy = 2;
		byProfessorContainer.add(btnFindCourses_1, gbc_btnFindCourses_1);
		
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.gridwidth = 2;
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 7;
		courseSelection.add(horizontalStrut, gbc_horizontalStrut);
		
		GridBagConstraints gbc_btnViewSchedule = new GridBagConstraints();
		gbc_btnViewSchedule.insets = new Insets(0, 0, 0, 5);
		gbc_btnViewSchedule.gridx = 0;
		gbc_btnViewSchedule.gridy = 9;
		courseSelection.add(btnViewSchedule, gbc_btnViewSchedule);
		
		GridBagConstraints gbc_btnLogout = new GridBagConstraints();
		gbc_btnLogout.gridx = 1;
		gbc_btnLogout.gridy = 9;
		btnLogout.addActionListener(new BtnLogoutActionListener());
		courseSelection.add(btnLogout, gbc_btnLogout);
		
		//TODO added in method that gets what should be in this list box.
		String [] sublist = {"cse", "mth", "sta"};
		
		Content.add(CoursePage, "coursePage");
		GridBagLayout gbl_CoursePage = new GridBagLayout();
		gbl_CoursePage.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30};
		gbl_CoursePage.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30};
		gbl_CoursePage.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_CoursePage.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0};
		CoursePage.setLayout(gbl_CoursePage);
		GridBagConstraints gbc_SelectProfTest = new GridBagConstraints();
		gbc_SelectProfTest.gridheight = 2;
		gbc_SelectProfTest.insets = new Insets(0, 0, 5, 5);
		gbc_SelectProfTest.gridx = 0;
		gbc_SelectProfTest.gridy = 0;
		SelectProfTest.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		CoursePage.add(SelectProfTest, gbc_SelectProfTest);
		
		GridBagConstraints gbc_lblSelectATime = new GridBagConstraints();
		gbc_lblSelectATime.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectATime.gridx = 6;
		gbc_lblSelectATime.gridy = 1;
		lblSelectATime.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		CoursePage.add(lblSelectATime, gbc_lblSelectATime);
		
		GridBagConstraints gbc_cProfessorList = new GridBagConstraints();
		gbc_cProfessorList.gridheight = 3;
		gbc_cProfessorList.insets = new Insets(0, 0, 5, 5);
		gbc_cProfessorList.fill = GridBagConstraints.BOTH;
		gbc_cProfessorList.gridx = 0;
		gbc_cProfessorList.gridy = 2;
		cProfessorList.addListSelectionListener(new ListSelectionListener() {
			//TODO: Needs to run query/or use method that does and change what the feedback says based on query and times
			public void valueChanged(ListSelectionEvent arg0) {
				
				//this would run method that gets the feedback for a course and professor and push that feedback into
				//button click event.
				viewFeedback.setText("The professor is awesome");
			}
		});
		cProfessorList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		cProfessorList.setValueIsAdjusting(true);
		cProfessorList.setFont(new Font("Serif", Font.PLAIN, 14));
		cProfessorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//TODO: add method that gets query for this professor based on selected course
	
		CoursePage.add(cProfessorList, gbc_cProfessorList);
		
	
		
		GridBagConstraints gbc_cTimeList = new GridBagConstraints();
		gbc_cTimeList.gridheight = 5;
		gbc_cTimeList.gridwidth = 5;
		gbc_cTimeList.insets = new Insets(0, 0, 5, 0);
		gbc_cTimeList.fill = GridBagConstraints.BOTH;
		gbc_cTimeList.gridx = 6;
		gbc_cTimeList.gridy = 2;
		cTimeList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		CoursePage.add(cTimeList, gbc_cTimeList);
		
		GridBagConstraints gbc_btnViewSyllabus = new GridBagConstraints();
		gbc_btnViewSyllabus.insets = new Insets(0, 0, 5, 5);
		gbc_btnViewSyllabus.gridx = 0;
		gbc_btnViewSyllabus.gridy = 6;
		CoursePage.add(btnViewSyllabus, gbc_btnViewSyllabus);
		
		GridBagConstraints gbc_lblFeedback = new GridBagConstraints();
		gbc_lblFeedback.insets = new Insets(0, 0, 5, 5);
		gbc_lblFeedback.gridx = 0;
		gbc_lblFeedback.gridy = 8;
		lblFeedback.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		CoursePage.add(lblFeedback, gbc_lblFeedback);
		
		GridBagConstraints gbc_btnAddToSchedule = new GridBagConstraints();
		gbc_btnAddToSchedule.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddToSchedule.gridx = 6;
		gbc_btnAddToSchedule.gridy = 8;
		//TODO: write code here to get and display schedule
		btnAddToSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//TODO: needs to get selected time and error handling if nothing is selected.
				//needs to run update that adds to user schedule for the schedule class
				
				cl_Content.show(Content, "name_7647640712816");
			}
		});
		CoursePage.add(btnAddToSchedule, gbc_btnAddToSchedule);
		
		GridBagConstraints gbc_viewFeedback = new GridBagConstraints();
		gbc_viewFeedback.gridheight = 3;
		gbc_viewFeedback.insets = new Insets(0, 0, 5, 5);
		gbc_viewFeedback.fill = GridBagConstraints.BOTH;
		gbc_viewFeedback.gridx = 0;
		gbc_viewFeedback.gridy = 9;
		viewFeedback.setEditable(false);
		CoursePage.add(viewFeedback, gbc_viewFeedback);
		
		GridBagConstraints gbc_btnLeaveFeedback = new GridBagConstraints();
		gbc_btnLeaveFeedback.insets = new Insets(0, 0, 0, 5);
		gbc_btnLeaveFeedback.gridx = 0;
		gbc_btnLeaveFeedback.gridy = 12;
		//TODO: Needs to include the code to add feedback for the course selected.
		btnLeaveFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_Content.show(Content, "feedbackEntry");
			}
		});
		
		GridBagConstraints gbc_btnBackToSelector = new GridBagConstraints();
		gbc_btnBackToSelector.insets = new Insets(0, 0, 5, 5);
		gbc_btnBackToSelector.gridx = 6;
		gbc_btnBackToSelector.gridy = 10;
		btnBackToSelector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_Content.show(Content, "findCourses");
			}
		});
		CoursePage.add(btnBackToSelector, gbc_btnBackToSelector);
		CoursePage.add(btnLeaveFeedback, gbc_btnLeaveFeedback);
		
		Content.add(FeedBack, "feedbackEntry");
		GridBagLayout gbl_FeedBack = new GridBagLayout();
		gbl_FeedBack.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_FeedBack.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_FeedBack.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_FeedBack.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		FeedBack.setLayout(gbl_FeedBack);
		
		GridBagConstraints gbc_lblPickProfessorYour = new GridBagConstraints();
		gbc_lblPickProfessorYour.insets = new Insets(0, 0, 5, 5);
		gbc_lblPickProfessorYour.gridx = 0;
		gbc_lblPickProfessorYour.gridy = 1;
		FeedBack.add(lblPickProfessorYour, gbc_lblPickProfessorYour);
		
		GridBagConstraints gbc_fPickProf = new GridBagConstraints();
		gbc_fPickProf.gridheight = 4;
		gbc_fPickProf.insets = new Insets(0, 0, 5, 5);
		gbc_fPickProf.fill = GridBagConstraints.BOTH;
		gbc_fPickProf.gridx = 0;
		gbc_fPickProf.gridy = 2;
		FeedBack.add(fPickProf, gbc_fPickProf);
		
		GridBagConstraints gbc_lblEnterARating = new GridBagConstraints();
		gbc_lblEnterARating.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterARating.gridx = 4;
		gbc_lblEnterARating.gridy = 2;
		FeedBack.add(lblEnterARating, gbc_lblEnterARating);
		
		GridBagConstraints gbc_rateSpinner = new GridBagConstraints();
		gbc_rateSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_rateSpinner.gridx = 4;
		gbc_rateSpinner.gridy = 3;
		rateSpinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		FeedBack.add(rateSpinner, gbc_rateSpinner);
		
		GridBagConstraints gbc_lblStars = new GridBagConstraints();
		gbc_lblStars.insets = new Insets(0, 0, 5, 5);
		gbc_lblStars.gridx = 5;
		gbc_lblStars.gridy = 3;
		FeedBack.add(lblStars, gbc_lblStars);
		
		GridBagConstraints gbc_lblWriteCommentsHere = new GridBagConstraints();
		gbc_lblWriteCommentsHere.insets = new Insets(0, 0, 5, 5);
		gbc_lblWriteCommentsHere.gridx = 0;
		gbc_lblWriteCommentsHere.gridy = 7;
		FeedBack.add(lblWriteCommentsHere, gbc_lblWriteCommentsHere);
		
		GridBagConstraints gbc_feedbacktxt = new GridBagConstraints();
		gbc_feedbacktxt.gridheight = 4;
		gbc_feedbacktxt.insets = new Insets(0, 0, 5, 5);
		gbc_feedbacktxt.fill = GridBagConstraints.BOTH;
		gbc_feedbacktxt.gridx = 0;
		gbc_feedbacktxt.gridy = 8;
		FeedBack.add(feedbacktxt, gbc_feedbacktxt);
		
		GridBagConstraints gbc_btnAddFeedback = new GridBagConstraints();
		gbc_btnAddFeedback.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddFeedback.gridx = 4;
		gbc_btnAddFeedback.gridy = 12;
		btnAddFeedback.addActionListener(new ActionListener() {
			//TODO: add in code to get info from feedback and send to class that holds the feedback
			public void actionPerformed(ActionEvent e) {
				//get selected professor
				
				String prof = (String) fPickProf.getSelectedValue();
				//get rating
				//int rating = (int) rateSpinner.getValue();
				//get feedback
				String usrFeedBackString = feedbacktxt.getText();
				
				//put into update that added this to the feedback table or method that already does this.
				cl_Content.show(Content, "coursePage");
			}
		});
		FeedBack.add(btnAddFeedback, gbc_btnAddFeedback);
		
		Content.add(Schedule, "name_7647640712816");
		GridBagLayout gbl_Schedule = new GridBagLayout();
		gbl_Schedule.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Schedule.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Schedule.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Schedule.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Schedule.setLayout(gbl_Schedule);
		
		GridBagConstraints gbc_schLbl = new GridBagConstraints();
		gbc_schLbl.insets = new Insets(0, 0, 5, 5);
		gbc_schLbl.gridx = 2;
		gbc_schLbl.gridy = 2;
		Schedule.add(schLbl, gbc_schLbl);
		
		GridBagConstraints gbc_scheduleDisplay = new GridBagConstraints();
		gbc_scheduleDisplay.gridheight = 8;
		gbc_scheduleDisplay.gridwidth = 10;
		gbc_scheduleDisplay.insets = new Insets(0, 0, 5, 5);
		gbc_scheduleDisplay.fill = GridBagConstraints.BOTH;
		gbc_scheduleDisplay.gridx = 2;
		gbc_scheduleDisplay.gridy = 3;
		Schedule.add(scheduleDisplay, gbc_scheduleDisplay);
		
		GridBagConstraints gbc_btnGoBackTo = new GridBagConstraints();
		gbc_btnGoBackTo.insets = new Insets(0, 0, 5, 5);
		gbc_btnGoBackTo.gridx = 12;
		gbc_btnGoBackTo.gridy = 11;
		btnGoBackTo.addActionListener(new ActionListener() {
			//TODO: Write code to add in what gets displayed from a students schedule
			public void actionPerformed(ActionEvent e) {
				cl_Content.show(Content, "findCourses");
			}
		});
		Schedule.add(btnGoBackTo, gbc_btnGoBackTo);
		
		Content.add(ProfessorPage, "name_5422214919347");
		GridBagLayout gbl_ProfessorPage = new GridBagLayout();
		gbl_ProfessorPage.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_ProfessorPage.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_ProfessorPage.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_ProfessorPage.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		ProfessorPage.setLayout(gbl_ProfessorPage);
		
		GridBagConstraints gbc_lblCoursesThey = new GridBagConstraints();
		gbc_lblCoursesThey.gridwidth = 6;
		gbc_lblCoursesThey.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoursesThey.gridx = 1;
		gbc_lblCoursesThey.gridy = 1;
		ProfessorPage.add(lblCoursesThey, gbc_lblCoursesThey);
		
		GridBagConstraints gbc_btnViewCourse = new GridBagConstraints();
		gbc_btnViewCourse.insets = new Insets(0, 0, 5, 0);
		gbc_btnViewCourse.gridx = 12;
		gbc_btnViewCourse.gridy = 4;
		btnViewCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_Content.show(Content, "coursePage");
				
				//TODO:needs to get the professor teaching this course
				String [] profList = {"Dr.Frikken", "Bo Brinkman", "Krumpe"};
				cProfessorList.setListData(profList);
				
				//TODO:needs to get the times this course is being offered and put them in the cTimeList Jlist.
				
				String [] times = {" MWF 1:00-2:15" , "TR 3:00 - 5:15" };
				cTimeList.setListData(times);
			}
		});
		
		GridBagConstraints gbc_pCourseList = new GridBagConstraints();
		gbc_pCourseList.gridheight = 5;
		gbc_pCourseList.gridwidth = 7;
		gbc_pCourseList.insets = new Insets(0, 0, 5, 5);
		gbc_pCourseList.fill = GridBagConstraints.BOTH;
		gbc_pCourseList.gridx = 1;
		gbc_pCourseList.gridy = 2;
		ProfessorPage.add(pCourseList, gbc_pCourseList);
		ProfessorPage.add(btnViewCourse, gbc_btnViewCourse);
		
		GridBagConstraints gbc_lblOtherUserFeedback = new GridBagConstraints();
		gbc_lblOtherUserFeedback.gridwidth = 5;
		gbc_lblOtherUserFeedback.insets = new Insets(0, 0, 5, 5);
		gbc_lblOtherUserFeedback.gridx = 1;
		gbc_lblOtherUserFeedback.gridy = 7;
		ProfessorPage.add(lblOtherUserFeedback, gbc_lblOtherUserFeedback);
		
		GridBagConstraints gbc_pViewFeedBack = new GridBagConstraints();
		gbc_pViewFeedBack.gridwidth = 7;
		gbc_pViewFeedBack.gridheight = 4;
		gbc_pViewFeedBack.insets = new Insets(0, 0, 5, 5);
		gbc_pViewFeedBack.fill = GridBagConstraints.BOTH;
		gbc_pViewFeedBack.gridx = 1;
		gbc_pViewFeedBack.gridy = 8;
		ProfessorPage.add(pViewFeedBack, gbc_pViewFeedBack);
		
		GridBagConstraints gbc_btnBackToSelector_1 = new GridBagConstraints();
		gbc_btnBackToSelector_1.gridx = 12;
		gbc_btnBackToSelector_1.gridy = 12;
		btnBackToSelector_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_Content.show(Content, "findCourses");
			}
		});
		ProfessorPage.add(btnBackToSelector_1, gbc_btnBackToSelector_1);
		
		Content.add(TimePage, "name_5448293729152");
		GridBagLayout gbl_TimePage = new GridBagLayout();
		gbl_TimePage.columnWidths = new int[]{0};
		gbl_TimePage.rowHeights = new int[]{0};
		gbl_TimePage.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_TimePage.rowWeights = new double[]{Double.MIN_VALUE};
		TimePage.setLayout(gbl_TimePage);
		
		Content.add(SearchResults, "name_61891547693904");
		GridBagLayout gbl_SearchResults = new GridBagLayout();
		gbl_SearchResults.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_SearchResults.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_SearchResults.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_SearchResults.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		SearchResults.setLayout(gbl_SearchResults);
		
		GridBagConstraints gbc_resultsLabel = new GridBagConstraints();
		gbc_resultsLabel.gridwidth = 6;
		gbc_resultsLabel.insets = new Insets(0, 0, 5, 5);
		gbc_resultsLabel.gridx = 2;
		gbc_resultsLabel.gridy = 0;
		resultsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		SearchResults.add(resultsLabel, gbc_resultsLabel);
		
		GridBagConstraints gbc_resultslist = new GridBagConstraints();
		gbc_resultslist.insets = new Insets(0, 0, 5, 5);
		gbc_resultslist.gridheight = 6;
		gbc_resultslist.gridwidth = 9;
		gbc_resultslist.fill = GridBagConstraints.BOTH;
		gbc_resultslist.gridx = 2;
		gbc_resultslist.gridy = 1;
		SearchResults.add(resultslist, gbc_resultslist);
		
		GridBagConstraints gbc_btnViewSelectedCo = new GridBagConstraints();
		gbc_btnViewSelectedCo.gridwidth = 2;
		gbc_btnViewSelectedCo.insets = new Insets(0, 0, 5, 0);
		gbc_btnViewSelectedCo.anchor = GridBagConstraints.BASELINE;
		gbc_btnViewSelectedCo.gridx = 12;
		gbc_btnViewSelectedCo.gridy = 7;
		btnViewSelectedCo.addActionListener(new ActionListener() {
			//TODO: gets selectCourse plugs into global variable selectedCourse and brings up the course page
			
			public void actionPerformed(ActionEvent e) {
				cl_Content.show(Content, "coursePage");
				
				//TODO:needs to get the professor teaching this course
				String [] profList = {"Dr.Frikken", "Bo Brinkman", "Krumpe"};
				cProfessorList.setListData(profList);
				
				//TODO:needs to get the times this course is being offered and put them in the cTimeList Jlist.
				
				String [] times = {" MWF 1:00-2:15" , "TR 3:00 - 5:15" };
				cTimeList.setListData(times);
				
			}
		});
		SearchResults.add(btnViewSelectedCo, gbc_btnViewSelectedCo);
	}

	private class BtnLoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String Password = "";
			User = UserNameTxt.getText();
			Password = PassTxt.getText();
			
			cl_Content.show(Content, "findCourses");
			frame.setSize(new Dimension(313,380));
		}
	}
	private class BtnRegisterActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String Password = "";
			User = UserNameTxt.getText();
			Password = PassTxt.getText();
			//TODO check for already in use and send error message
			
			cl_Content.show(Content, "findCourses");
			frame.setSize(new Dimension(313,380));
		}
	}
	private class BtnLogoutActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			cl_Content.show(Content, "login");
			frame.setSize(new Dimension(500,150));
		}
	}
	private class BtnFindCoursesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			cl_Content.show(Content, "coursePage");
			frame.setSize(new Dimension(500,445));
		}
	}
}
