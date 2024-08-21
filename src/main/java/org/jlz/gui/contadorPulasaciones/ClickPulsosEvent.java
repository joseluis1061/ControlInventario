package org.jlz.gui.contadorPulasaciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickPulsosEvent implements ActionListener {
  private JLabel showTextCount;
  private Integer countn;
  public ClickPulsosEvent(JLabel showTextCount, Integer countn){
    this.showTextCount = showTextCount;
    this.countn = countn;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    countn += 1;
    showTextCount.setText(String.valueOf("Número de pulsos: "+ countn));
  }
}
