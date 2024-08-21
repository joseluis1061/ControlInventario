package org.jlz.gui.contadorPulasaciones;

import javax.swing.*;
import java.awt.*;

public class ContadorPulsaciones {
  private Integer count = 0;
  private ClickPulsosEvent pulsosEvent;

  public ContadorPulsaciones(){
    JFrame frame = new JFrame("Contador Pulsos");
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(500,200);

    JLabel showTextCount = new JLabel("Numero de pulsos: ");
    // Boton con evento
    JButton btnPulse = new JButton("Pulse");
    pulsosEvent = new ClickPulsosEvent(showTextCount, count);
    btnPulse.addActionListener(pulsosEvent);

    frame.add(btnPulse);
    frame.add(showTextCount);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new ContadorPulsaciones();
  }
}
