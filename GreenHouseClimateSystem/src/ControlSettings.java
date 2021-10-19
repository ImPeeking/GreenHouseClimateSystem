import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlSettings  {

    JFrame frame = new JFrame("Control System");
    JLabel controlsBanner = new JLabel("Control System");

    JButton tempSetterButton = new JButton("Set Temp:");

    JLabel setThresholdLabel = new JLabel("Threshold:");
    JTextField ThresholdInput = new JTextField("");
    JTextField setTempField = new JTextField();



    ControlSettings(){

        //controlsBanner.setBounds(250,0,350,35);
        //controlsBanner.setFont(new Font(null,Font.PLAIN,15));

        setThresholdLabel.setBounds(175,30,105,25);
        ThresholdInput.setBounds(150,60,105,25);



        setTempField.setBounds(25,60,105,25);
        tempSetterButton.setBounds(25,30,105,25);

        tempSetterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource ()==tempSetterButton){

                    int getValue = Integer.parseInt(setTempField.getText());





                }

            }
        });










        frame.add(ThresholdInput);
        frame.add(setThresholdLabel);
        frame.add(setTempField);
        frame.add(tempSetterButton);
        tempSetterButton.setFocusable(false);

        frame.add(controlsBanner);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);



    }

    }




