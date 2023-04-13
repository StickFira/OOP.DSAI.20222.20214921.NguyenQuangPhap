import javax.swing.JOptionPane;
public class DaysOfMonths {
    public static boolean LeapCheck(int year){
        if (year %100==0 && year%400!=0 || year % 4!=0){
            return false;
        } else{
            return true;
        }
    }
    public static void main(String args[]) {
        boolean valid=true;
        int intYear;
        String mm=JOptionPane.showInputDialog(null, "Input month:", "Input month", 1);
        String yy=JOptionPane.showInputDialog(null, "Input year:" , "Input year", 1);
        intYear=yy.length();
        System.out.print(intYear);
        if (intYear<4) {valid=false;}
        String[] m31={"1", "January", "Jan", "Jan.",
            "3", "March", "Mar", "Mar.",
            "5", "May",
            "7", "July", "Jul", "Jul.",
            "8", "August", "Aug", "Aug.",
            "10", "October", "Oct", "Oct.",
            "12", "December", "Dec", "Dec."};
        String[] m30={"4", "April", "Apr", "Apr.",
            "6", "June", "Jun", "Jun.",
            "9", "September", "Sep", "Sep.",
            "11", "November", "Nov", "Nov."};
        String[] m2={"2", "February", "Feb", "Feb."};
        int check =0;
        if (valid==true){            
            for (int i = 0; i < m2.length; i++){
                if (mm.equals(m2[i])){
                    if (LeapCheck(Integer.parseInt(yy))){
                            JOptionPane.showMessageDialog(null, "29 days", "Result", 1);
                        check+=1;
                    } else {
                        JOptionPane.showMessageDialog(null, "28 days", "Result", 1);
                        check+=1;
                    }
                } 
                }
            for (int i = 0; i < m30.length; i++){
                if (mm.equals(m30[i])){
                    JOptionPane.showMessageDialog(null, "30 days", "Result", 1);
                    check+=1;
                }
            }
            for (int i = 0; i < m31.length; i++){
                if (mm.equals(m31[i])){
                    JOptionPane.showMessageDialog(null, "31 days", "Result", 1);
                    check+=1;
                }
            }
            if(check==0) {JOptionPane.showMessageDialog(null, "Invalid input", "Invalid",0);}
        
        } else {JOptionPane.showMessageDialog(null, "Invalid input", "Invalid",0);}
    }
}