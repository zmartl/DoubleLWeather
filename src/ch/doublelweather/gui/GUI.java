package ch.doublelweather.gui;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.GridLayout;

public class GUI extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private JPanel weatherPanel;
	private JPanel panel_day1;
	private JPanel panel_day2;
    private JPanel panel_day3;
    private JPanel panel_day4;
    private JPanel panel_day5;
    private JPanel panel_chooser;
    
    private JLabel lblToday;
    private JLabel lblTomorrow;
    private JLabel lblInDays;
    private JLabel lblInDays_1;
    private JLabel lblInDays_2;
    private JLabel lblYourLocation;
    private JButton btnSearch;
    private JTextField textField;
    private JLabel pic_day2;
    private JLabel pic_day3;
    private JLabel pic_day4;
    private JLabel pic_day5;
    private JLabel pic_day1;
    
    private JPanel day1_weather;
    private JPanel day2_weather;
    private JPanel day3_weather;
    private JPanel day4_weather;
    private JPanel day5_weather;
    
    private JLabel day1_min;
    private JLabel day1_max;
    private JLabel day1_wind;
    private JLabel day1_desc;
    private JLabel day2_min;
    private JLabel day2_max;
    private JLabel day2_wind;
    private JLabel day2_desc;
    private JLabel day3_min;
    private JLabel day3_max;
    private JLabel day3_wind;
    private JLabel day3_desc;
    private JLabel day4_min;
    private JLabel day4_max;
    private JLabel day4_wind;
    private JLabel day4_desc;
    private JLabel day5_min;
    private JLabel day5_max;
    private JLabel day5_wind;
    private JLabel day5_desc;
    private JPanel panel;
    private JPanel panel_1;
    
    public GUI()
    {
        super("DoubleLWeather");
        
        weatherPanel = new JPanel();
  		panel_day1 = new JPanel();
  		
    	setBackground(Color.lightGray);
    	setResizable(false);
    	this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	getContentPane().setLayout(new BorderLayout(20, 20));

	    getContentPane().add(weatherPanel, BorderLayout.CENTER);
	    weatherPanel.setLayout(null);
	    
	    panel_day1.setLayout(new BorderLayout(20, 20));
	    panel_day1.setBounds(0, 57, 114, 249);
	    
	    weatherPanel.add(panel_day1);
	    
	    lblToday = new JLabel("Today");
	    lblToday.setHorizontalAlignment(SwingConstants.CENTER);
	    panel_day1.add(lblToday, BorderLayout.NORTH);
	    
	    pic_day1 = new JLabel("Pic_day1");
	    pic_day1.setHorizontalAlignment(SwingConstants.CENTER);
	    pic_day1.setIcon(null);
	    panel_day1.add(pic_day1, BorderLayout.CENTER);
	    
	    day1_weather = new JPanel();
	    panel_day1.add(day1_weather, BorderLayout.SOUTH);
	    day1_weather.setLayout(new GridLayout(0, 1, 0, 0));
	    day1_weather.add(day1_min = new JLabel("day1_min"));
	    day1_min.setHorizontalAlignment(SwingConstants.CENTER);
	    day1_weather.add(day1_max = new JLabel("day1_max"));
	    day1_max.setHorizontalAlignment(SwingConstants.CENTER);
	    day1_weather.add(day1_wind = new JLabel("day1_wind"));
	    day1_wind.setHorizontalAlignment(SwingConstants.CENTER);
	    day1_weather.add(day1_desc = new JLabel("day1_desc"));
	    day1_desc.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    panel_day2 = new JPanel();
	    panel_day2.setBounds(115, 57, 114, 249);
	    weatherPanel.add(panel_day2);
	    panel_day2.setLayout(new BorderLayout(20, 20));
	    
	    lblTomorrow = new JLabel("Tomorrow");
	    lblTomorrow.setHorizontalAlignment(SwingConstants.CENTER);
	    panel_day2.add(lblTomorrow, BorderLayout.NORTH);
	    
	    pic_day2 = new JLabel("Pic_day2");
	    panel_day2.add(pic_day2, BorderLayout.CENTER);
	    panel_day2.add(pic_day2, BorderLayout.CENTER);
	    pic_day2.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    day2_weather = new JPanel();
	    panel_day2.add(day2_weather, BorderLayout.SOUTH);
	    day2_weather.setLayout(new GridLayout(0, 1, 0, 0));
	    day2_weather.add(day2_min = new JLabel("day2_min"));
	    day2_min.setHorizontalAlignment(SwingConstants.CENTER);
	    day2_weather.add(day2_max = new JLabel("day2_max"));
	    day2_max.setHorizontalAlignment(SwingConstants.CENTER);
	    day2_weather.add(day2_wind = new JLabel("day2_wind"));
	    day2_wind.setHorizontalAlignment(SwingConstants.CENTER);
	    day2_weather.add(day2_desc = new JLabel("day2_desc"));
	    day2_desc.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    panel_day3 = new JPanel();
	    panel_day3.setBounds(230, 57, 114, 249);
	    weatherPanel.add(panel_day3);
	    panel_day3.setLayout(new BorderLayout(20, 20));
	    
	    lblInDays = new JLabel("In 2 Days");
	    lblInDays.setHorizontalAlignment(SwingConstants.CENTER);
	    panel_day3.add(lblInDays, BorderLayout.NORTH);
	    
	    pic_day3 = new JLabel("pic_day3");
	    panel_day3.add(pic_day3, BorderLayout.CENTER);
	    panel_day3.add(pic_day3, BorderLayout.CENTER);
	    panel_day3.add(pic_day3, BorderLayout.CENTER);
	    pic_day3.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    day3_weather = new JPanel();
	    panel_day3.add(day3_weather, BorderLayout.SOUTH);
	    day3_weather.setLayout(new GridLayout(0, 1, 0, 0));
	    day3_weather.add(day3_min = new JLabel("day3_min"));
	    day3_min.setHorizontalAlignment(SwingConstants.CENTER);
	    day3_weather.add(day3_max = new JLabel("day3_max"));
	    day3_max.setHorizontalAlignment(SwingConstants.CENTER);
	    day3_weather.add(day3_wind = new JLabel("day3_wind"));
	    day3_wind.setHorizontalAlignment(SwingConstants.CENTER);
	    day3_weather.add(day3_desc = new JLabel("day3_desc"));
	    day3_desc.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    panel_day4 = new JPanel();
	    panel_day4.setBounds(343, 57, 114, 249);
	    weatherPanel.add(panel_day4);
	    panel_day4.setLayout(new BorderLayout(20, 20));
	    
	    lblInDays_1 = new JLabel("In 3 Days");
	    lblInDays_1.setHorizontalAlignment(SwingConstants.CENTER);
	    panel_day4.add(lblInDays_1, BorderLayout.NORTH);
	    
	    panel_day5 = new JPanel();
	    panel_day5.setBounds(454, 57, 114, 249);
	    weatherPanel.add(panel_day5);
	    panel_day5.setLayout(new BorderLayout(20, 20));
	    
	    pic_day4 = new JLabel("pic_day4");
	    panel_day4.add(pic_day4, BorderLayout.CENTER);
	    panel_day4.add(pic_day4, BorderLayout.CENTER);
	    panel_day4.add(pic_day4, BorderLayout.CENTER);
	    pic_day4.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    day4_weather = new JPanel();
	    panel_day4.add(day4_weather, BorderLayout.SOUTH);
	    day4_weather.setLayout(new GridLayout(0, 1, 0, 0));
	    day4_weather.add(day4_min = new JLabel("day4_min"));
	    day4_min.setHorizontalAlignment(SwingConstants.CENTER);
	    day4_weather.add(day4_max = new JLabel("day4_max"));
	    day4_max.setHorizontalAlignment(SwingConstants.CENTER);
	    day4_weather.add(day4_wind = new JLabel("day4_wind"));
	    day4_wind.setHorizontalAlignment(SwingConstants.CENTER);
	    day4_weather.add(day4_desc = new JLabel("day4_desc"));
	    day4_desc.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    lblInDays_2 = new JLabel("In 4 Days");
	    lblInDays_2.setHorizontalAlignment(SwingConstants.CENTER);
	    panel_day5.add(lblInDays_2, BorderLayout.NORTH);
	    
	    pic_day5 = new JLabel("pic_day5");
	    panel_day5.add(pic_day5, BorderLayout.CENTER);
	    panel_day5.add(pic_day5, BorderLayout.CENTER);
	    panel_day5.add(pic_day5, BorderLayout.CENTER);
	    pic_day5.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    day5_weather = new JPanel();
	    panel_day5.add(day5_weather, BorderLayout.SOUTH);
	    day5_weather.setLayout(new GridLayout(0, 1, 0, 0));
	    day5_weather.add(day5_min = new JLabel("day5_min"));
	    day5_min.setHorizontalAlignment(SwingConstants.CENTER);
	    day5_weather.add(day5_max = new JLabel("day5_max"));
	    day5_max.setHorizontalAlignment(SwingConstants.CENTER);
	    day5_weather.add(day5_wind = new JLabel("day5_wind"));
	    day5_wind.setHorizontalAlignment(SwingConstants.CENTER);
	    day5_weather.add(day5_desc = new JLabel("day5_desc"));
	    day5_desc.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    panel_chooser = new JPanel();
	    panel_chooser.setBounds(0, 0, 568, 57);
	    weatherPanel.add(panel_chooser);
	    
	    lblYourLocation = new JLabel("Your Location");
	    panel_chooser.add(lblYourLocation, BorderLayout.WEST);
	    
	    textField = new JTextField();
	    panel_chooser.add(textField);
	    textField.setColumns(10);
	    
	    btnSearch = new JButton("Search");
	    panel_chooser.add(btnSearch, BorderLayout.EAST);
    }
}

