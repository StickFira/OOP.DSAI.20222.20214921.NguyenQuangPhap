import javax.swing.JOptionPane;
//a1x+a2y=a0;
//b1x+b2y=b0;
public class FirstDegreeSystem {
    public static void main(String[] args){
        String a1_str,a2_str,a0_str,b1_str,b2_str,b0_str;
        a1_str=JOptionPane.showInputDialog(null, "Input a1","a1x+a2y=a0 and b1x+b2y=b0", 1);
        a2_str=JOptionPane.showInputDialog(null, "Input a2","a1x+a2y=a0 and b1x+b2y=b0", 1);
        a0_str=JOptionPane.showInputDialog(null, "Input a0","a1x+a2y=a0 and b1x+b2y=b0", 1);
        
        b1_str=JOptionPane.showInputDialog(null, "Input b1","a1x+a2y=a0 and b1x+b2y=b0", 1);
        b2_str=JOptionPane.showInputDialog(null, "Input b2","a1x+a2y=a0 and b1x+b2y=b0", 1);
        b0_str=JOptionPane.showInputDialog(null, "Input b0","a1x+a2y=a0 and b1x+b2y=b0", 1);
        
        double a1=Double.parseDouble(a1_str);
        double a2=Double.parseDouble(a2_str);
        double a0=Double.parseDouble(a0_str);
        double b1=Double.parseDouble(b1_str);
        double b2=Double.parseDouble(b2_str);
        double b0=Double.parseDouble(b0_str);
// a1 a2 a0
// b1 b2 b0
        double D=(a1*b2-a2*b1);
        double D1=-(a2*b0-a0*b2);
        double D2=(a1*b0-a0*b1);
        if (D!=0){
            JOptionPane.showMessageDialog(null, "x="+D1/D +"\n" +"y="+D2/D,"Solution", 1);
        }
        else{
            double M=b1/a1;
            double N=b0/a0;
            if (M==N){
                JOptionPane.showMessageDialog(null, "Infinite solutions", "Result", 0);
            }
            if (M!=N){
                JOptionPane.showMessageDialog(null, "No solution", "Result", 0);
            }
        }


    }
    
    
}
