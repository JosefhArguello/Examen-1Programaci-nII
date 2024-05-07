package examen.pkg1.kener.y.josefh;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class  Examen1KenerYJosefh  extends JPanel{
    
    JPanel menu;
    JPanel panelInicial;
    JPanel panelIngresar;
    
    JLabel imagenConsejos;
    //Botones
    JButton Menu;
    JButton mostrarEmpleados;
    JButton Consejosseguridad;
    //
    public void cambiarPanel(JPanel nuevoPanel){
        nuevoPanel.setSize(700, 1000);
        nuevoPanel.setLocation(0, 0); 
        panelInicial.removeAll();
        panelInicial.add(nuevoPanel, BorderLayout.CENTER);
        panelInicial.repaint();
        panelInicial.revalidate();
    }
  
    public Examen1KenerYJosefh(){
        JFrame frame = new JFrame("Manual de transito");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        
        Color Azul = new Color(1, 11, 64);
        Color Gris = new Color(216, 217, 215); 
        
        
        menu = new JPanel(); 
        menu.setLayout(null); 
        menu.setBounds(0, 0, 1000, 50);
        menu.setBackground(Gris);
        frame.add(menu);
        menu.setVisible(true);
        
        
        panelInicial = new JPanel(); 
        panelInicial.setLayout(null); 
        panelInicial.setBounds(0, 30, 1000, 950);
        panelInicial.setBackground(Azul);
        frame.add(panelInicial);
        panelInicial.setVisible(true);
        
        panelIngresar = new JPanel();
       
        frame.add(panelIngresar);

        Font Times = new Font("Times New Roman", Font.BOLD, 22); 
        
        Consejosseguridad= new JButton("Consejos de seguridad vial");
        Consejosseguridad.setFont(Times); 
        Consejosseguridad.setBackground(Azul); 
        Consejosseguridad.setForeground(Color.WHITE);
        Consejosseguridad.setBounds(20, 50, 300, 40);
        Consejosseguridad.addActionListener((ActionEvent e) -> { 
        });
        
      
        mostrarEmpleados = new JButton("Mostrar empleados");
        mostrarEmpleados.setFont(Times);
        mostrarEmpleados.setBackground(Azul);
        mostrarEmpleados.setForeground(Color.WHITE);
        mostrarEmpleados.setBounds(35, 500, 230, 40);
        mostrarEmpleados.addActionListener((ActionEvent e) -> { 
             
            
        });
        
        Menu = new JButton("MENU");
        Menu.setFont(Times);
        Menu.setBackground(Azul);
        Menu.setForeground(Color.WHITE);
        Menu.setBounds(400, 0, 150, 30);
        Menu.addActionListener((ActionEvent e) -> { 
             
            
        });
       
        panelInicial.add(Consejosseguridad);
        panelInicial.add(mostrarEmpleados);
        menu.add(Menu);
        
        ImageIcon imageIcon = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\Recomendaciones-seguridadvial-para-ninios.png");

        Image image = imageIcon.getImage(); // Obtiene la imagen del ImageIcon
        Image newImage = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
        imageIcon.setImage(newImage);
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(20,100,300,300);
        panelInicial.add(imageLabel);
        panelInicial.repaint();
        panelInicial.revalidate();
    }
     
    public static void main(String[] args) {
        Examen1KenerYJosefh a = new Examen1KenerYJosefh();
       
    }
}