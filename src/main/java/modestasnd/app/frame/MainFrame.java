package modestasnd.app.frame;

import modestasnd.app.sorters.Algorithms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {

    public void run() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("StudentRanking");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Student ranking");
        frame.getContentPane().add(label);


        frame.getContentPane().add(getSubmitButton(), BorderLayout.SOUTH);
        frame.getContentPane().add(getComboBox(), BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
    }

    private JPanel getSubmitButton() {
        JButton submit = new JButton("Submit Form");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                createIban((String) comboBox.getSelectedItem(), textField.getText());
            }
        });
        JPanel p = new JPanel();
        p.add(submit);
        return p;
    }

    private JScrollPane getComboBox(){
        final JComboBox box = new JComboBox(Algorithms.values());
        box.setSelectedIndex(0);

        return new JScrollPane(box);
    }
}
