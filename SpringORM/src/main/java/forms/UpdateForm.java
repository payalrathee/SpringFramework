package forms;

import beans.Student;
import context.ContextProvider;
import dao.StudentDao;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateForm extends JFrame{
    private JTextField jtf1;
    private JTextField jtf2;
    private JButton update;
    private JPanel panel;
    private JLabel id;
    private JLabel name;

    public UpdateForm()
    {
        setVisible(true);
        setBounds(600,200,400,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panel);
        setTitle("UpdateForm");
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=Integer.parseInt(jtf1.getText());
                String name=jtf2.getText();

                ApplicationContext ctx= ContextProvider.provideContext();
                StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);

                studentDao.update(new Student(id,name));

            }
        });
    }
}
