package org.jlz.gui;

import org.jlz.gui.view.ReadTextEvent;

import javax.swing.*;
import java.awt.*;

public class PanelGrafico {
  private JTextField origen;
  private JTextField copia;
  private JButton copiarTexto;

  ReadTextEvent readText;

  public PanelGrafico(){
    JFrame frame = new JFrame("Dibujar graficos");
    frame.add(new MiPanel());
    frame.setSize(600,200);

    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    origen = new JTextField(16);
    copia = new JTextField(16);
    copiarTexto = new JButton("Copiar");
    readText = new ReadTextEvent(origen, copia);

    copiarTexto.addActionListener(readText);

    frame.add(origen);
    frame.add(copiarTexto);
    frame.add(copia);

    // Importante que siempre sea la última linea
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    PanelGrafico miPanel = new PanelGrafico();
  }
}
