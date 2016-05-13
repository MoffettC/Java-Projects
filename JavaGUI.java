package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class JavaGUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BUTTONS, RADIOS, SLIDER, TEXT AREA, SECTION
		JFrame frame = new JFrame();
		JButton button = new JButton("Test Button");
		JLabel label = new JLabel("Press Button");
		JButton button2 = new JButton("Test Button 2");
		JLabel label2 = new JLabel("Press Button 2");
		JButton button3 = new JButton("Test Button 3");
		JLabel label3 = new JLabel("Press Button 3");
		
		JRadioButton firstRadio = new JRadioButton("First");
		JRadioButton secondRadio = new JRadioButton("Second");
		JRadioButton thirdRadio = new JRadioButton("Third");
		ButtonGroup group = new ButtonGroup();
		group.add(firstRadio);
		group.add(secondRadio);
		group.add(thirdRadio);
		
		JSlider slider = new JSlider();
		JSlider slider2 = new JSlider();
		
		JTextArea sliderText = new JTextArea(1, 20);
		sliderText.setEditable(false);
		
		JTextArea sliderText2 = new JTextArea(1, 20);
		sliderText2.setEditable(false);
		
		JTextArea textArea = new JTextArea(40, 100);
		textArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		//scrollPane.setPreferredSize(new Dimension(40, 100));	//Separate scroll pane code
		
		//PANEL SECTION
		JPanel outerMainPanel = new JPanel();
		JPanel mainPanel = new JPanel();
		FlowLayout flowPanel = new FlowLayout();
		
		JPanel westPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel northPanel = new JPanel();
		JPanel eastPanel = new JPanel();
		JPanel southPanel = new JPanel();
		
		flowPanel.setAlignment(FlowLayout.LEFT);
		
		outerMainPanel.setLayout(flowPanel);
		outerMainPanel.setBorder(new EtchedBorder());
		outerMainPanel.add(mainPanel);
		
		mainPanel.setLayout(flowPanel);		
		//mainPanel.setLayout(new BorderLayout()); 				//With traditional borderLayout method
		mainPanel.add(westPanel, BorderLayout.WEST);
		mainPanel.add(centerPanel, BorderLayout.CENTER); 	
		mainPanel.add(northPanel, BorderLayout.NORTH); 			//Blank
		mainPanel.add(eastPanel, BorderLayout.EAST);			//Blank
		mainPanel.add(southPanel, BorderLayout.SOUTH);			//Blank
		mainPanel.setBorder(new TitledBorder(new EtchedBorder(), "WolfSorter"));
		
		westPanel.setLayout(new GridLayout(20, 2));		
		westPanel.add(button);
		westPanel.add(label);
		westPanel.add(button2);
		westPanel.add(label2);
		westPanel.add(button3);
		westPanel.add(label3);
		westPanel.add(firstRadio);
		westPanel.add(secondRadio);
		westPanel.add(thirdRadio);
		westPanel.add(slider);
		westPanel.add(sliderText);
		westPanel.add(slider2);
		westPanel.add(sliderText2);
		
		//centerPanel.add(textArea);							//For use without scroll panes
		centerPanel.add(scrollPane);
		textArea.setText("Only some buttons and sliders have minor functionality\n"
				+ "These lines are set to repeat on use of slider to demonstrate\n"
				+ "use of scroll bars for white pane\n");

		
		class ButtonListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(button)){
					label.setText("Button Pushed!");
				} else if(e.getSource().equals(button2)){
					label2.setText("Button Pushed!");
				} else {
					label3.setText("Button Pushed!");
				}
				
			}			
		}
		
		ActionListener listener = new ButtonListener();
		ActionListener listener2 = new ButtonListener();
		ActionListener listener3 = new ButtonListener();
		button.addActionListener(listener);
		button2.addActionListener(listener2);
		button3.addActionListener(listener3);

		class SliderListener implements ChangeListener{

			@Override
			public void stateChanged(ChangeEvent e) {
				setSliderText();		
			}	
			
			public void setSliderText(){
				int num = slider.getValue();
				int num2 = slider2.getValue();
				sliderText.setText("Slider 1: " + num);
				sliderText2.setText("Slider 2: " + num2);
				textArea.append("Slider 1 Value: " + num + "\nSlider 2 Value: " + num2);
				textArea.append("\nOnly some buttons and sliders have minor functionality\n"
						+ "These lines are set to repeat on use of slider to demonstrate\n"
						+ "use of scroll bars for white pane\n");
			}
		}
		
		ChangeListener sliderListener = new SliderListener();
		slider.addChangeListener(sliderListener);
		slider2.addChangeListener(sliderListener);

				
		//MENU BAR SECTION
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		JMenu fileMenuX = new JMenu("Something");
		JMenuItem fileMenuItemX = new JMenuItem("Choice 1");
		JMenuItem fileMenuItemY = new JMenuItem("Choice 2");
		fileMenuX.add(fileMenuItemX);
		fileMenuX.add(fileMenuItemY);
		
		JMenu fileMenuY = new JMenu("Something else");
		
		JMenuItem fileMenuItemZ = new JMenuItem("Exit");
		
		fileMenu.add(fileMenuX);
		fileMenu.add(fileMenuY);
		fileMenu.add(fileMenuItemZ);
		
		JMenu optionsMenu = new JMenu("Options");
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(fileMenu);
		menuBar.add(optionsMenu);
		menuBar.add(helpMenu);

		frame.setJMenuBar(menuBar);
		frame.add(outerMainPanel);
		frame.setSize(1600, 900);
		frame.setTitle("WolfSorter Java GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}


}
