package whileloop;

import javax.swing.JOptionPane;

public class WhileLoop {

    public static void main(String[] args) {
        String tem;
        tem = JOptionPane.showInputDialog(null, "Temperature High ? (Y/N)");
        while(tem.equals("Y")){
            System.out.println("Compresser on");
            tem = JOptionPane.showInputDialog(null, "Temperature High ? (Y/N)");
        }
    }
    
}
