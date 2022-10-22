package forms;

import listeners.MainFormListener;

import javax.swing.*;

public class MainForm extends JFrame {
    private JButton insert;
    private JButton retrieve;
    private JButton update;
    private JButton delete;
    private JPanel panel;

    public MainForm() {
        setVisible(true);
        setSize(500,500);
        setBounds(500,100,600,600);
        setTitle("StudentForm");
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainFormListener listener=new MainFormListener();
        insert.addActionListener(listener);
        update.addActionListener(listener);
        retrieve.addActionListener(listener);
        delete.addActionListener(listener);
    }
}
