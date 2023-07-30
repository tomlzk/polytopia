package src;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JFrame
{
    JLabel title;
    public void LaunchGame()
    {
        //界面初始设置
        this.getGraphicsConfiguration().getDevice().setFullScreenWindow(this);
//        setTitle("POLYTOPIA");
//        setSize(800, 600);
//        setLocationRelativeTo(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(3);
        this.setResizable(true);
        //this.setVisible(true);
        int width = getWidth();
        int height = getHeight();


        title = new JLabel("POLYTOPIA", SwingConstants.CENTER);
        title.setFont(new Font("仿宋", Font.BOLD, 52));
        title.setForeground(Color.BLACK);
        title.setBounds(3 * width / 8, 17 * height / 72, width / 4, height / 12);
        this.add(title);

        setVisible(true);
    }


    public static void main(String[] args) {
        new GamePanel().LaunchGame();
    }
}
