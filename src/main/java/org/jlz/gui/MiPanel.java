package org.jlz.gui;

import javax.swing.*;
import java.awt.*;

public class MiPanel extends JPanel {



  //Overwrite del metodo para dibujar
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    // Carguemos una imagen
    Image miImage = new ImageIcon("/pixlr-image.png").getImage();
    //Image miImage = new ImageIcon(getClass().getResource("./pixlr-image.png")).getImage();
    g.drawImage(miImage, 15,15, null);
  }
}
