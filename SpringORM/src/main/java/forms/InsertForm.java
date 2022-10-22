package forms;

import beans.Student;
import context.ContextProvider;
import dao.StudentDao;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertForm extends JFrame{
    private JTextField jtf1;
    private JTextField jtf2;
    private JButton insert;
    private JLabel id;
    private JLabel name;
    private JPanel panel;

    public InsertForm()
    {
        setVisible(true);
        setBounds(600,200,400,400);
        setContentPane(panel);
        setTitle("InsertForm");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=Integer.parseInt(jtf1.getText());
                String name=jtf2.getText();

                ApplicationContext ctx= ContextProvider.provideContext();
                StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);

                int r=studentDao.insert(new Student(id,name));
                jtf1.setText(r+"");
                jtf2.setText("");
            }
        });
    }

}
