import javax.swing.JOptionPane;
public class FirstDegreePoly{
    public static void main(String args[]) {
        String sa,sb;
        sa= JOptionPane.showInputDialog(null,"Input a:","ax+b=0",1);
        sb= JOptionPane.showInputDialog(null,"Input b:","ax+b=0",1);
        Double a= Double.parseDouble(sa);
        Double b= Double.parseDouble(sb);
        if (a==0) {
            if (b==0) {
                JOptionPane.showMessageDialog(null, "Infinite root", "Result", 1);
            } else{ 
                JOptionPane.showMessageDialog(null, "No root", "Result", 1);
            }
        } else {
            double x=-b/a;
            JOptionPane.showMessageDialog(null, "x="+x, "Result", 1);
        }
    }
}