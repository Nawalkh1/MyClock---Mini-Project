package DigitalClock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyWindow extends JFrame
{
  private JLabel heading;
  private JLabel clockLabel;
  private Font font = new Font("" , Font.BOLD , 35);
    MyWindow()
    {
        super.setTitle("My Clock");
        super.setSize( 400 , 400);
        super.setLocation(300 , 50);

        this.createGUI();
        this.startclock();

        super.setVisible(true);
    }



public void createGUI()
{//gui
    heading = new JLabel("MyClock");

    clockLabel = new JLabel("clock");

    heading.setFont(font);
    clockLabel.setFont(font);

    this .setLayout(new GridLayout(2,1));
    this.add(heading);
    this.add(clockLabel);



}

public void startclock()
{
    Timer timer = new Timer(1000, new ActionListener() { // if you donot want to make a separate interace of Action listener you can implement it here
        @Override
        public void actionPerformed(ActionEvent e) {

            String dateTime = new Date().toLocaleString();

            clockLabel.setText(dateTime);


        }
    });

    timer.start();

}


}
