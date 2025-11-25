import javax.swing.*;
public class Lap205 {

    static void main() {


        int total_minutes = Integer.parseInt(JOptionPane.showInputDialog(null,"Input minutes:"));

        int hour = total_minutes / 60;
        int minutes = total_minutes %60;

        JOptionPane.showMessageDialog(null,total_minutes + " minutes is " + hour + " hour " + minutes + " minute ");
    }
}

