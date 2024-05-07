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
    
    
    //Botones
    JButton Menu;
    JButton Beneficiostransporte;
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
        
        Consejosseguridad = new JButton("Consejos de seguridad vial");
Consejosseguridad.setFont(Times); 
Consejosseguridad.setBackground(Azul); 
Consejosseguridad.setForeground(Color.WHITE);
Consejosseguridad.setOpaque(false);
Consejosseguridad.setBounds(20, 50, 300, 40);
Consejosseguridad.addActionListener((ActionEvent e) -> { 
});
 
        Beneficiostransporte = new JButton("Beneficios del transporte publico");
        Beneficiostransporte.setFont(Times);
        Beneficiostransporte.setBackground(Azul);
        Beneficiostransporte.setForeground(Color.WHITE);
        Beneficiostransporte.setBounds(20, 450, 400, 40);
        Beneficiostransporte.addActionListener((ActionEvent e) -> { 
  
        });
        
        Menu = new JButton("MENU");
        Menu.setFont(Times);
        Menu.setBackground(Azul);
        Menu.setForeground(Color.WHITE);
        Menu.setBounds(400, 0, 150, 30);
        Menu.addActionListener((ActionEvent e) -> { 
        
        });
       
        panelInicial.add(Consejosseguridad);
        panelInicial.add(Beneficiostransporte);
        menu.add(Menu);
        
        ImageIcon imageIcon1 = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\Recomendaciones-seguridadvial-para-ninios.png");
        Image image1 = imageIcon1.getImage(); // Obtiene la imagen del ImageIcon
        Image newImage1 = image1.getScaledInstance(300, 300, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
        imageIcon1.setImage(newImage1);
        JLabel imagenConsejos = new JLabel(imageIcon1);
        imagenConsejos.setBounds(20,100,300,300);
        panelInicial.add(imagenConsejos);
 
        ImageIcon imageIcon2 = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\6287.jpg");
        Image image2 = imageIcon2.getImage(); // Obtiene la imagen del ImageIcon
        Image newImage2 = image2.getScaledInstance(400, 300, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
        imageIcon2.setImage(newImage2);
        JLabel Consejosseguridad = new JLabel(imageIcon2);
        Consejosseguridad.setBounds(20,500,400,300);
        panelInicial.add(Consejosseguridad);

        ImageIcon imageIconFondo = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\trucks-highway-mountain-sunset.jpg");
        Image image3 = imageIconFondo.getImage(); // Obtiene la imagen del ImageIcon
        Image newImage3 = image3.getScaledInstance(1000, 950, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
        imageIconFondo.setImage(newImage3);
        JLabel Fondo = new JLabel(imageIconFondo);
        Fondo.setBounds(0, 30, 1000, 950);
        panelInicial.add(Fondo);
        
        panelInicial.repaint();
        panelInicial.revalidate();

    }
     
    public static void main(String[] args) {
        Examen1KenerYJosefh a = new Examen1KenerYJosefh();
       
    }
}