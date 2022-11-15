package PracticeSystem;
import javax.swing.SwingUtilities;

public class Main{   
        public static void main(String[] args) throws Exception {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run(){
                    HomePage home = new HomePage();
                    //Clubs clubPage = new Clubs();
                }
            });
        }
}
