package org.jlz.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Autor extends JFrame {

  private JPanel contentPane;
  private JTextField bookNameField;
  private JTextField authorNameField;
  private JComboBox genreComboBox;
  private JCheckBox checkBox1;
  private JCheckBox isTakenCheckBox;
  private JButton cancelButton;
  private JButton saveButton;

  public Autor(){
    setContentPane(contentPane);
    setTitle("GUI control de inventarios");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(300, 200);
    setLocationRelativeTo(null);
    setVisible(true);

    saveButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String author = authorNameField.getText();
        JOptionPane.showMessageDialog(Autor.this, "Hello World "+ author);
      }
    });
  }

  public static void main(String[] args) {
    new Autor();
  }
}
