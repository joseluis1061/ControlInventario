package org.jlz.gui.cambioDeFondo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackgrundBlueEvent implements ActionListener {
  private JPanel panelBackGround;
  public ChangeBackgrundBlueEvent(JPanel panelBackGround){
    this.panelBackGround = panelBackGround;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    panelBackGround.setBackground(Color.BLUE);
  }
}
