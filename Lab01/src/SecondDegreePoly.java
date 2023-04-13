import javax.swing.JOptionPane;
import java.lang.Math;
public class SecondDegreePoly{
    public static void main(String args[]) {
        String sa,sb,sc;
        sa= JOptionPane.showInputDialog(null,"Input a:","ax^2+bx+c=0",1);
        sb= JOptionPane.showInputDialog(null,"Input b:","ax^2+bx+c=0",1);
        sc= JOptionPane.showInputDialog(null,"Input c:","ax^2+bx+c=0",1);
        Double a= Double.parseDouble(sa);
        Double b= Double.parseDouble(sb);
        Double c= Double.parseDouble(sc);
        Double del=b*b-4*a*c;
        if (a==0){
            if (b==0) {
                if (c==0) {
                    JOptionPane.showMessageDialog(null, "Infinite root", "Result", 1);
                } else{ 
                    JOptionPane.showMessageDialog(null, "No root", "Result", 1);
                }
            } else {
                double x=-c/b;
                JOptionPane.showMessageDialog(null, "x="+x, "Result", 1);
            }
        } else {
            if (del>=0) {
                double x1=(-b+Math.sqrt(del))/(2*a);
                double x2=(-b-Math.sqrt(del))/(2*a);
                JOptionPane.showMessageDialog(null, "x1= "+x1+"\n"+"x2= "+x2, "Result", 1);
            } else {
                JOptionPane.showMessageDialog(null, "No real root", "Result", 1);
            }    
        }
    }
}