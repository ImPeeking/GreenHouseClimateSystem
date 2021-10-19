import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class RegisterPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton RegisterButton = new JButton("Register");
    JLabel firstNameLabel = new JLabel("First Name:");
    JLabel lastNameLabel = new JLabel("Last Name:");
    JLabel userID1Label = new JLabel("Set User ID:");
    JLabel userID2Label = new JLabel("Copy User ID:");
    JLabel userPasswordLabel1 = new JLabel("Set Password:");
    JLabel userPasswordLabel2 = new JLabel("Copy Password:");

    JTextField firstNameField = new JTextField();
    JTextField lastNameField = new JTextField();
    JTextField userID1Field = new JTextField();
    JTextField userID2Field = new JTextField();
    JTextField userPasswordField1 = new JTextField();
    JTextField userPasswordField2 = new JTextField();


    RegisterPage(){

        //registerinfo = registerInfoOriginal;//trying to create hashmap for register info to bring back to login info hash

        RegisterButton.setBounds(150,520,100,25);
        RegisterButton.setFocusable(false);
        RegisterButton.addActionListener(this);

        firstNameLabel.setBounds(50,50,75,25);
        lastNameLabel.setBounds(50,75,75,25);
        userID1Label.setBounds(50,125,75,25);
        userID2Label.setBounds(41,150,75,25);
        userPasswordLabel1.setBounds(35,200,100,25);
        userPasswordLabel2.setBounds(27,225,100,25);

        firstNameField.setBounds(125,50,200,25);
        lastNameField.setBounds(125,75,200,25);
        userID1Field.setBounds(125,125,200,25);
        userID2Field.setBounds(125,150,200,25);
        userPasswordField1.setBounds(125,200,200,25);
        userPasswordField2.setBounds(125,225,200,25);



        frame.add(firstNameLabel);
        frame.add(lastNameLabel);
        frame.add(userID1Label);
        frame.add(userID2Label);
        frame.add(userPasswordLabel1);
        frame.add(userPasswordLabel2);

        frame.add(firstNameField);
        frame.add(lastNameField);
        frame.add(userID1Field);
        frame.add(userID2Field);
        frame.add(userPasswordField1);
        frame.add(userPasswordField2);




        frame.add(RegisterButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }














    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
