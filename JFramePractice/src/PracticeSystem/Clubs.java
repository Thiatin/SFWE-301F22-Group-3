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

public class Clubs {
    private JFrame clubPage;

    public Clubs(){
        initialize();
    }

    public void initialize(){
        clubPage = new JFrame("Clubs");
        this.clubPage.setTitle("Clubs");
        //this.home.setDefaultCloseOperation(home.DO_NOTHING_ON_CLOSE);
        this.clubPage.setSize(700, 700);
        this.clubPage.setVisible(true);
        this.clubPage.setLocationRelativeTo(null);
        this.clubPage.setResizable(false);
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

        //Label for Header
        JLabel head = new JLabel("Welcome to Software Engineering", JLabel.CENTER);
        head.setForeground(Color.WHITE);
        panelHeader.add(head);

        //Label for Footer
        JLabel foot = new JLabel("Breaking News! Prof. Sharon and DR. Saldana are giving everyone 100% on their final!", JLabel.CENTER);
        foot.setForeground(Color.WHITE);
        panelFooter.add(foot);

        //buttons for frame, keep in mind buttons is a custom class
        Buttons BackButton = new Buttons("Back");
        BackButton.setActionCommand("Back");
        BackButton.addActionListener(new ButtonClickListener());
        panel.add(BackButton);

        //everything must be added to the frame here 
        clubPage.add(panel, BorderLayout.CENTER);
        clubPage.add(panelHeader, BorderLayout.NORTH);
        clubPage.add(panelFooter, BorderLayout.SOUTH);        
        
    }

    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           String command = e.getActionCommand();  
           
            if(command.equals( "Back" ))  {
                System.out.println("This button works"); 
                HomePage home = new HomePage();                      
            } 
        }		
    }
}
