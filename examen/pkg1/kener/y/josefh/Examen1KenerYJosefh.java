package examen.pkg1.kener.y.josefh;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase principal que maneja la interfaz de usuario del programa.
 */
public class  Examen1KenerYJosefh  extends JPanel{
    // Atributos y métodos de la clase Examen1KenerYJosefh
    //Array list donde se guardan las cosas
    public static ArrayList<Aplicante> Array = new ArrayList<>();
    private JPanel menu;
    private JPanel panelIngresar;
    
    JButton Menu;
    JButton Examen;
    
    //
    //Metodo para cambiar paneles
    public void cambiarPanel(JPanel nuevoPanel){
        nuevoPanel.setSize(1000, 950);
        nuevoPanel.setLocation(0, 50); 
        panelIngresar.removeAll();
        panelIngresar.add(nuevoPanel, BorderLayout.CENTER);
        panelIngresar.repaint();
        panelIngresar.revalidate();
    }
    /**
    * Constructor de la clase Examen1KenerYJosefh.
    * Configura la interfaz de usuario y permite cambiar entre diferentes paneles.
    */
    public Examen1KenerYJosefh(){
        // Código para configurar la interfaz de usuario y manejar los paneles
        Font Times = new Font("Times New Roman", Font.BOLD, 22);
        
        JFrame frame = new JFrame("Manual de transito");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Color Azul = new Color(1, 11, 64);
        
        panelIngresar = new JPanel(); 
        panelIngresar.setLayout(null); 
        panelIngresar.setBounds(0, 50, 1000, 950);
        panelIngresar.setBackground(Azul);
        panelIngresar.setVisible(true);
   
        menu = new JPanel(); 
        menu.setLayout(null); 
        menu.setBounds(0, 0, 1000, 50);
        menu.setBackground(Azul);
        menu.setVisible(true);

        Menu = new JButton("MENU");
        Menu.setFont(Times);
        Menu.setBackground(Azul);
        Menu.setForeground(Color.WHITE);
        Menu.setBounds(300, 20, 150, 30);
        Menu.addActionListener((ActionEvent e) -> { 
            cambiarPanel(new PanelInicial());
});    

        Examen = new JButton("Examen");
        Examen.setFont(Times);
        Examen.setBackground(Azul);
        Examen.setForeground(Color.WHITE);
        Examen.setBounds(500, 20, 150, 30);
        Examen.addActionListener((ActionEvent e) -> { 
            cambiarPanel(new Examen());
}); 

        menu.add(Menu);
        menu.add(Examen);
        frame.add(menu);
        frame.add(panelIngresar);
        ImageIcon imageIconFondo = new ImageIcon("Examen-1Programaci-nII\\examen\\pkg1\\kener\\y\\josefh\\images\\ImportanciaVial.png");
        Image image3 = imageIconFondo.getImage(); // Obtiene la imagen del ImageIcon
        Image newImage3 = image3.getScaledInstance(1000, 900, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
        imageIconFondo.setImage(newImage3);
        JLabel Fondo = new JLabel(imageIconFondo);
        Fondo.setBounds(0, 70, 1000, 900);
        panelIngresar.add(Fondo); 
        panelIngresar.repaint();
        panelIngresar.revalidate();
  
    }
     /**
     * Método principal que inicia la aplicación.
     * Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        new Examen1KenerYJosefh();
       
    }
}