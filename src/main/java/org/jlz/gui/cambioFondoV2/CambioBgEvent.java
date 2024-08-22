package org.jlz.gui.cambioFondoV2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CambioBgEvent implements ActionListener {
  private JPanel panelBackGround;
  public CambioBgEvent(JPanel panelBackGround){
    this.panelBackGround = panelBackGround;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand(); // Leer el texto del boton
    if (Objects.equals(command, "Azul")){
      panelBackGround.setBackground(Color.BLUE);
    }
    else if ("Rojo".equals(command)) {
      panelBackGround.setBackground(Color.RED);
    }
    else {
      panelBackGround.setBackground(Color.PINK);
    }
  }
}
