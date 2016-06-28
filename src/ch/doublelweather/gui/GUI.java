package ch.doublelweather.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class GUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel txt_city;
    private JTextField tf_city;
    private JButton btn_search;
    // day1
    private JLabel tf_d1_min;
    private JLabel tf_d1_max;
    private JLabel tf_d1_wind;
    private JLabel tf_d1_desc;
    // day2
    private JLabel tf_d2_min;
    private JLabel tf_d2_max;
    private JLabel tf_d2_wind;
    private JLabel tf_d2_desc;
   // day 3
    private JLabel tf_d3_min;
    private JLabel tf_d3_max;
    private JLabel tf_d3_wind;
    private JLabel tf_d3_desc;
    // day 4
    private JLabel tf_d4_min;
    private JLabel tf_d4_max;
    private JLabel tf_d4_wind;
    private JLabel tf_d4_desc;
    
    public GUI()
    {
        super("DoubleLWeather");
    }

    public static void main(String[] args)
    {
        
    }
}

