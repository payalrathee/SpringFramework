package forms;

import beans.Student;
import context.ContextProvider;
import dao.StudentDao;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteForm extends JFrame{
    private JTextField jtf1;
    private JButton delete;
    private JPanel panel;
    private JLabel id;

    public DeleteForm()
    {
        setVisible(true);
        setBounds(600,200,400,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panel);
        setTitle("DeleteForm");
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=Integer.parseInt(jtf1.getText());

                ApplicationContext ctx= ContextProvider.provideContext();
                StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);

                Student s=new Student();
                s.setId(id);
                studentDao.delete(s);
            }
        });
    }
}
