import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class BMI_Calculator extends javax.swing.JFrame {
 
    BMI_Calculator() {
        JFrame f = new JFrame();//creating instance of JFrame  
 
        JLabel lb1 = new JLabel("Height(Meters):");
        lb1.setBounds(20, 20, 160, 40);//x axis, y axis, width, height
        f.add(lb1); //adding component in JFrame
 
        JLabel lb2 = new JLabel("Weight(Kilograms):");
        lb2.setBounds(20, 60, 150, 40);//x axis, y axis, width, height
        f.add(lb2); //adding component in JFrame 
        
        JLabel lbResult = new JLabel("BMI Calculator");
        lbResult.setBounds(20, 90, 300, 40);//x axis, y axis, width, height
        f.add(lbResult); //adding component in JFrame 
        
        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(140, 20, 200, 40);//x axis, y axis, width, height
        f.add(txtHeight); //adding component in JFrame 
 
        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(140, 60, 200, 40);//x axis, y axis, width, height
        f.add(txtWeight); //adding component in JFrame 
 
        JButton btn = new JButton("Compute BMI");//creating instance of JButton  
        btn.setBounds(20, 130, 320, 40);//x axis, y axis, width, height
        
        //Event
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                double weight=Double.parseDouble(txtWeight.getText());
                double height=Double.parseDouble(txtHeight.getText());
                
                double bmi = weight / Math.pow(height, 2);
                double rounded = Math.round(bmi * 10) / 10.0;
                		
                 if (bmi < 20) {
                     lbResult.setText("You're Underweight - BMI is : "+rounded);
                 } else if (bmi >= 20 && bmi <=26) {
                     lbResult.setText("You're Healthy - BMI is : "+rounded);
                 } else {
                     lbResult.setText("You're Overweight - BMI is : "+rounded);
                 } 
            }
        });
 
        f.add(btn);//adding button in JFrame  
 
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
 
    }
 
    public static void main(String[] args) {
        new BMI_Calculator();
    }
}