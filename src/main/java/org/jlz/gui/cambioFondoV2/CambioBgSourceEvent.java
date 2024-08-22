package org.jlz.gui.cambioFondoV2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CambioBgSourceEvent implements ActionListener {
  private JPanel panelBackGround;
  private JButton btnBlue;
  private JButton btnRed;

  public CambioBgSourceEvent(JPanel panelBackGround, JButton btnBlue, JButton btnRed){
    this.panelBackGround = panelBackGround;
    this.btnBlue = btnBlue;
    this.btnRed = btnRed;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == btnBlue){
      panelBackGround.setBackground(Color.BLUE);
    }
    else if (source == btnRed) {
      panelBackGround.setBackground(Color.RED);
    }
    else {
      panelBackGround.setBackground(Color.PINK);
    }
  }
}
