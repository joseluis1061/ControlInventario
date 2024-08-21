package org.jlz.gui.cambioDeFondo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackgrundRedEvent implements ActionListener {
  private JPanel panelBackGround;
  public ChangeBackgrundRedEvent(JPanel panelBackGround){
    this.panelBackGround = panelBackGround;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    panelBackGround.setBackground(Color.RED);
  }
}
