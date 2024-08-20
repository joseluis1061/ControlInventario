package org.jlz.gui.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadTextEvent implements ActionListener {

  JTextField origen;
  JTextField destino;
  public ReadTextEvent(JTextField origen, JTextField destino){
    this.origen = origen;
    this.destino = destino;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String textFieldValue = origen.getText();
    destino.setText(textFieldValue);
    origen.setText(""); // Limpiar el primer textField
    destino.setEnabled(false); // Inhabilitar el segundo textfiel
    destino.setBackground(Color.BLACK); // Cambiar color de fondo
    destino.setForeground(Color.GREEN); // Cambiar color de texto
  }

}
