package org.jlz.gui.cambioFondoV2;

import javax.swing.*;
import java.awt.*;

public class CambioFondoPanel {

  public CambioFondoPanel(){
    JFrame frame = new JFrame();
    frame.setSize(400,150);
    frame.setTitle("Cambiar color al fondo");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setBackground(Color.PINK);

    //CambioBgEvent cambioBgEvent = new CambioBgEvent(panel);


    JButton btnBlue = new JButton("Azul");
    JButton btnRed = new JButton("Rojo");
    CambioBgSourceEvent cambioBgEvent = new CambioBgSourceEvent(panel, btnBlue, btnRed);
    btnBlue.addActionListener(cambioBgEvent);
    btnRed.addActionListener(cambioBgEvent);


    frame.add(panel);
    panel.add(btnBlue);
    panel.add(btnRed);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new CambioFondoPanel();
  }
}
