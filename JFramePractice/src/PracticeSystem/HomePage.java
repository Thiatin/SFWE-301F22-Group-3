package PracticeSystem;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.event.*;

public class HomePage {
    private JFrame home;

    public HomePage() {
        initialize();
    }

    public void initialize(){
        //This section initializes the frame
        home = new JFrame("Home");
        this.home.setTitle("Home");
        //this.home.setDefaultCloseOperation(home.DO_NOTHING_ON_CLOSE);
        this.home.setSize(700, 700);
        this.home.setVisible(true);
        this.home.setLocationRelativeTo(null);
        this.home.setResizable(false);
        //this.home.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        
        //header portion of frame
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        panel.setBackground(Color.WHITE);
        
        //center portion of frame
        JPanel panelHeader = new JPanel();
        panelHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        panelHeader.setBackground(Color.decode("#AB0520"));

        //footer portion of frame
        JPanel panelFooter = new JPanel();
        panelFooter.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        panelFooter.setBackground(Color.decode("#0C234B"));
        
        //buttons for frame, keep in mind buttons is a custom class
        Buttons ClubsButton = new Buttons("Clubs");
        ClubsButton.setActionCommand("Clubs");
        ClubsButton.addActionListener(new ButtonClickListener());
        panel.add(ClubsButton);
        Buttons ActivityButton = new Buttons("Activity");
        panel.add(ActivityButton);
        Buttons AboutButton = new Buttons("About");
        panel.add(AboutButton);
        Buttons StaffButton = new Buttons("Staff");
        panel.add(StaffButton);
        Buttons ResourceButton = new Buttons("Resources");
        panel.add(ResourceButton); //this adds button to the specific panel

        //Label for Header
        JLabel head = new JLabel("Welcome to Software Engineering", JLabel.CENTER);
        head.setForeground(Color.WHITE);
        panelHeader.add(head);

        //Label for Footer
        JLabel foot = new JLabel("Breaking News! Prof. Sharon and DR. Saldana are giving everyone 100% on their final!", JLabel.CENTER);
        foot.setForeground(Color.WHITE);
        panelFooter.add(foot);

        //everything must be added to the frame here 
        home.add(panel, BorderLayout.CENTER);
        home.add(panelHeader, BorderLayout.NORTH);
        home.add(panelFooter, BorderLayout.SOUTH);
    }

    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           String command = e.getActionCommand();  
           
           if( command.equals( "Clubs" ))  {
              System.out.println("This button works"); 
              Clubs clubPage = new Clubs();                      
           } 
        }		
     }
}
