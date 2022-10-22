package forms;

import beans.Student;
import context.ContextProvider;
import dao.StudentDao;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RetrieveForm extends JFrame {
    private JTextField jtf1;
    private JButton viewAll;
    private JButton view;
    private JLabel id;
    private JPanel panel;
    private JTable table;
    private JScrollPane spane;
    private DefaultTableModel model;

    public RetrieveForm() {
        setVisible(true);
        setBounds(600, 200, 400, 400);
        setTitle("RetrieveForm");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panel);
        spane.setSize(200,300);
        table.setSize(200,200);

        model=new DefaultTableModel();
        table.setModel(model);
        model.setColumnIdentifiers(new String[]{"ID","NAME"});

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=Integer.parseInt(jtf1.getText());

                ApplicationContext ctx= ContextProvider.provideContext();
                StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);
                Student s=studentDao.getStudent(id);

                model.setRowCount(0);
                model.addRow(new String[]{s.getId()+"",s.getName()});
            }
        });
        viewAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ApplicationContext ctx= ContextProvider.provideContext();
                StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);
                List<Student> students=studentDao.getAllStudents();

                model.setRowCount(0);
                for(Student s:students)
                {
                    model.addRow(new String[]{s.getId()+"",s.getName()});
                }
            }
        });
    }
}
