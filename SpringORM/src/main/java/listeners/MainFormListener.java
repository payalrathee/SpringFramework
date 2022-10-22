package listeners;

import forms.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFormListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String label=e.getActionCommand();
        switch(label)
        {
            case "Insert":
                new InsertForm();
                break;
            case "Update":
                new UpdateForm();
                break;
            case "Delete":
                new DeleteForm();
                break;
            case "Retrieve":
                new RetrieveForm();
                break;
        }
    }
}
