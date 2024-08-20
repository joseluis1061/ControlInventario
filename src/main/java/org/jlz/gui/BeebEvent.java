package org.jlz.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeebEvent implements ActionListener {


  @Override
  public void actionPerformed(ActionEvent e) {
    Toolkit.getDefaultToolkit().beep();
  }
}
