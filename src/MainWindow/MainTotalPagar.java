/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainWindow;

import com.formdev.flatlaf.FlatIntelliJLaf;
import igu.TotalPagarGUI;

/**
 *
 * @author zDefcon
 */
public class MainTotalPagar {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    FlatIntelliJLaf.setup();
    TotalPagarGUI Window = new TotalPagarGUI();
    Window.setVisible(true);
     Window.setLocationRelativeTo(null);
    Window.setResizable(false);
    Window.setTitle("TotalPagar");
  }
  
}
