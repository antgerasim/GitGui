package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;



public class BrotGui {
	public static void main(String[] args) {
		new DonFrame();
	}
}

class DonFrame extends JFrame {

	JButton zeitButton, logButton, passButton, bildButton, redButton,
			greenButton, blueButton, blackButton, customButton, defaultButton,
			fileButton, bildAendern;
	JToggleButton toglButton;

	JTextField logField;
	JPasswordField passField;
	JPanel checkPanel, radioPanel;
	JCheckBox fett, kursiv, untr;
	JRadioButton Cherry, Cake, Computer;
	ButtonGroup group;
	JLabel textLbl, bildLbl;
	JTextArea textAre;
	JComboBox<String> dropDownMenue;

	String[] namen = { "girl", "pair", "dog" };
	Color color;

	public DonFrame() {
		super("Don Programs");
		setSize(505, 505);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setAlwaysOnTop(false);
		setLayout(null);

		zeitButton = new JButton("Time");
		zeitButton.setBounds(25, 25, 150, 50);
		zeitButton.addActionListener(new ActionHandler());
		add(zeitButton);

		logButton = new JButton("Login");
		logButton.setBounds(25, 75, 75, 50);
		logButton.setEnabled(false);
		logButton.addActionListener(new ActionHandler());
		add(logButton);

		passButton = new JButton("Password");
		passButton.setBounds(100, 75, 75, 50);
		passButton.setEnabled(false);
		passButton.addActionListener(new ActionHandler());
		add(passButton);

		bildButton = new JButton(new ImageIcon(getClass().getResource(
				"bild1.jpg")));
		bildButton.setBounds(375, 25, 100, 100);
		bildButton.setRolloverIcon(new ImageIcon(getClass().getResource(
				"bild2.jpg")));
		add(bildButton);

		redButton = new JButton("Red Background");
		redButton.setBounds(375, 125, 100, 25);
		redButton.addActionListener(new ActionHandler());
		add(redButton);

		greenButton = new JButton("Green Background");
		greenButton.setBounds(375, 150, 100, 25);
		greenButton.addActionListener(new ActionHandler());
		add(greenButton);

		blueButton = new JButton("Blue Background");
		blueButton.setBounds(375, 175, 100, 25);
		blueButton.addActionListener(new ActionHandler());
		add(blueButton);

		blackButton = new JButton("Black Background");
		blackButton.setBounds(375, 200, 100, 25);
		blackButton.addActionListener(new ActionHandler());
		add(blackButton);

		customButton = new JButton("Custum Color");
		customButton.setBounds(375, 225, 100, 25);
		customButton.addActionListener(new ActionHandler());
		add(customButton);

		defaultButton = new JButton("Default Color");
		defaultButton.setBounds(375, 250, 100, 25);
		defaultButton.addActionListener(new ActionHandler());
		add(defaultButton);

		fileButton = new JButton("Open File");
		fileButton.setBounds(375, 275, 100, 25);

		add(fileButton);

		toglButton = new JToggleButton("StringAttributes");
		toglButton.setBounds(200, 25, 150, 50);
		toglButton.addItemListener(new ItemHandler());
		add(toglButton);

		logField = new JTextField();
		logField.setBounds(25, 125, 150, 25);
		logField.addCaretListener(new CaretHandler());
		add(logField);

		passField = new JPasswordField();
		passField.setBounds(25, 150, 150, 25);
		passField.addCaretListener(new CaretHandler());
		add(passField);

		checkPanel = new JPanel(null);
		checkPanel.setBounds(200, 75, 150, 100);
		add(checkPanel);

		fett = new JCheckBox("Bold");
		fett.setBounds(0, 0, 125, 25);
		fett.addItemListener(new ItemHandler());
		checkPanel.add(fett);

		kursiv = new JCheckBox("Italic");
		kursiv.setBounds(0, 25, 125, 25);
		kursiv.addItemListener(new ItemHandler());
		checkPanel.add(kursiv);

		untr = new JCheckBox("Underlined");
		untr.setBounds(0, 50, 125, 25);
		untr.addItemListener(new ItemHandler());
		checkPanel.add(untr);

		radioPanel = new JPanel(null);
		radioPanel.setBounds(200, 200, 150, 100);
		add(radioPanel);

		Cherry = new JRadioButton("Cherry");
		Cherry.setBounds(0, 0, 125, 25);
		Cherry.addItemListener(new ItemHandler());
		radioPanel.add(Cherry);

		Cake = new JRadioButton("Cake");
		Cake.setBounds(0, 25, 125, 25);
		Cake.addItemListener(new ItemHandler());
		radioPanel.add(Cake);

		Computer = new JRadioButton("Computer");
		Computer.setBounds(0, 50, 125, 25);
		Computer.addItemListener(new ItemHandler());
		radioPanel.add(Computer);

		group = new ButtonGroup();
		group.add(Cherry);
		group.add(Cake);
		group.add(Computer);

		textLbl = new JLabel("Test GUI");
		textLbl.setBounds(10, 150, 200, 200);
		textLbl.setFont(getFont().deriveFont(Font.PLAIN, 40));
		add(textLbl);

		bildLbl = new JLabel(new ImageIcon(getClass().getResource("bild3.jpg")));
		bildLbl.setBounds(375, 315, 100, 100);
		add(bildLbl);

		// add DropdownMenue
		dropDownMenue = new JComboBox<String>(namen);
		dropDownMenue.setBounds(400, 425, 50, 25);
		dropDownMenue.addItemListener(new ItemHandler());
		add(dropDownMenue);

		textAre = new JTextArea(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. In vel tortor est, sit amet consequat ante. Pellentesque luctus neque at sapien adipiscing consequat. Sed mattis venenatis elit ac pellentesque. Sed ornare cursus ante, eu ullamcorper dolor pulvinar a. Fusce non nisl nisi. Nam nisi augue, dapibus nec mollis sed, placerat eget nisi. Phasellus a libero ac sapien egestas sagittis ac non ipsum. ",
				0, 0);// int rows, int coloumns active only when layoutmanager
						// selected!
		textAre.setBounds(10, 300, 350, 150);
		textAre.setLineWrap(true);
		textAre.setWrapStyleWord(true);
		textAre.setOpaque(true);
		add(textAre);

		repaint();
	}

	private class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == zeitButton) {
				textLbl.setText("" + e.getWhen());
			} else if (e.getSource() == logButton) {
				textLbl.setText(logField.getText());
			} else if (e.getSource() == passButton) {
				textLbl.setText(String.valueOf(passField.getPassword()));
			} else if (e.getSource() == redButton) {
				getContentPane().setBackground(Color.RED);
			} else if (e.getSource() == greenButton) {
				getContentPane().setBackground(Color.GREEN);
			} else if (e.getSource() == blueButton) {
				getContentPane().setBackground(Color.BLUE);
			} else if (e.getSource() == blackButton) {
				getContentPane().setBackground(Color.BLACK);
			} else if (e.getSource() == customButton) {
				color = JColorChooser.showDialog(null, "Choose a color", color);
				getContentPane().setBackground(color);
			} else if (e.getSource() == defaultButton) {
				getContentPane().setBackground(getBackground());
			}

		}

	}

	private class ItemHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			Map<TextAttribute, Object> textAttributes = new HashMap<>();
			if (e.getSource() == toglButton && toglButton.isSelected()) {
				textAttributes.put(TextAttribute.STRIKETHROUGH,
						TextAttribute.STRIKETHROUGH_ON);
				textAttributes.put(TextAttribute.FOREGROUND, Color.BLUE);
				textLbl.setFont(textLbl.getFont().deriveFont(textAttributes));
			} else if (e.getSource() == fett && fett.isSelected()) {
				textLbl.setFont(textLbl.getFont().deriveFont(Font.BOLD, 40));
			} else if (e.getSource() == kursiv && kursiv.isSelected()) {
				textLbl.setFont(textLbl.getFont().deriveFont(Font.ITALIC, 40));
			} else if (e.getSource() == untr && untr.isSelected()) {
				textAttributes.put(TextAttribute.UNDERLINE,
						TextAttribute.UNDERLINE_ON);
				textLbl.setFont(textLbl.getFont().deriveFont(textAttributes));
			} else if (e.getSource() instanceof JRadioButton) {
				textLbl.setText(((JRadioButton) e.getSource()).getText());
			} else if (e.getStateChange() == ItemEvent.SELECTED) {
				if (dropDownMenue.getSelectedIndex() == 0) {
					bildLbl.setIcon(new ImageIcon(getClass().getResource(
							"girl.jpg")));
				} else if (dropDownMenue.getSelectedIndex() == 1) {
					bildLbl.setIcon(new ImageIcon(getClass().getResource(
							"pair.jpg")));
				} else if (dropDownMenue.getSelectedIndex() == 2) {
					bildLbl.setIcon(new ImageIcon(getClass().getResource(
							"dog.jpg")));
				}

			}

			else {
				textAttributes.clear();
				textLbl.setFont(getFont().deriveFont(Font.PLAIN, 40));
			}

		}

	}

	private class CaretHandler implements CaretListener {

		@Override
		public void caretUpdate(CaretEvent e) {
			if (e.getSource() == logField) {
				String s = logField.getText().trim();
				if (s.isEmpty()) {
					logButton.setEnabled(false);
				} else {
					logButton.setEnabled(true);
				}

			} else if (e.getSource() == passField) {
				String s = String.valueOf(passField.getPassword()).trim();
				if (s.isEmpty()) {
					passButton.setEnabled(false);
				} else {
					passButton.setEnabled(true);
				}
			}
		}
	}
}

