package org.jlz.gui.cambioDeFondo;

import javax.swing.*;
import java.awt.*;

public class BackgroundSelect {
  private JPanel panel;

  public BackgroundSelect() {
    JFrame frame = new JFrame();
    frame.setSize(400,150);
    frame.setTitle("Cambiar color al fondo");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    panel = new JPanel();
    panel.setBackground(Color.BLUE);

    JButton btnBlue = new JButton("Azul");
    ChangeBackgrundBlueEvent changeBackgrundBlueEvent = new ChangeBackgrundBlueEvent(panel);
    btnBlue.addActionListener(changeBackgrundBlueEvent);

    JButton btnRed = new JButton("Rojo");
    ChangeBackgrundRedEvent changeBackgrundRedEvent = new ChangeBackgrundRedEvent(panel);
    btnRed.addActionListener(changeBackgrundRedEvent);

    frame.add(panel);
    panel.add(btnBlue);
    panel.add(btnRed);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new BackgroundSelect();
  }
}
