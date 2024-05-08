package examen.pkg1.kener.y.josefh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicial extends JPanel {
    private JButton Beneficiosbicicleta;
    private JButton Beneficiostransporte;
    private JButton Consejosseguridad;
    private JButton Educacionseñales;

    public void cambiarPanel(JPanel nuevoPanel){
        nuevoPanel.setSize(1000, 950);
        nuevoPanel.setLocation(0, 50); 
        removeAll();
        add(nuevoPanel, BorderLayout.CENTER);
        repaint();
        revalidate();
    }
        public PanelInicial(){
            Color Azul = new Color(1, 11, 64);

            Font Times = new Font("Times New Roman", Font.BOLD, 22); 
            
            setLayout(null); 
            setBounds(0, 50, 1000, 950);
            setBackground(Azul);
            setVisible(true);

            Consejosseguridad = new JButton("Consejos de seguridad vial");
            Consejosseguridad.setFont(Times); 
            Consejosseguridad.setBackground(Azul); 
            Consejosseguridad.setForeground(Color.WHITE);
            Consejosseguridad.setBounds(20, 50, 300, 40);
            Consejosseguridad.addActionListener((ActionEvent e) -> { 
                cambiarPanel(new ConsejosSeguridad());
                
    });
            Beneficiostransporte = new JButton("Beneficios del transporte publico");
            Beneficiostransporte.setFont(Times);
            Beneficiostransporte.setBackground(Azul);
            Beneficiostransporte.setForeground(Color.WHITE);
            Beneficiostransporte.setBounds(20, 450, 400, 40);
            Beneficiostransporte.addActionListener((ActionEvent e) -> { 
                cambiarPanel(new BeneficiosTransporte());
            });
           
            Educacionseñales = new JButton("Educación sobre señales de tránsito");
            Educacionseñales.setFont(Times); 
            Educacionseñales.setBackground(Azul); 
            Educacionseñales.setForeground(Color.WHITE);
            Educacionseñales.setBounds(550, 50, 400, 40);
            Educacionseñales.addActionListener((ActionEvent e) -> { 
    });
            Beneficiosbicicleta = new JButton("Beneficios de usar la bicicleta");
            Beneficiosbicicleta.setFont(Times); 
            Beneficiosbicicleta.setBackground(Azul); 
            Beneficiosbicicleta.setForeground(Color.WHITE);
            Beneficiosbicicleta.setBounds(550, 450, 400, 40);
            Beneficiosbicicleta.addActionListener((ActionEvent e) -> { 
                cambiarPanel(new BeneficiosBicicleta());
    });
    
            
            add(Educacionseñales);
            add(Beneficiosbicicleta);
            add(Consejosseguridad);
            add(Beneficiostransporte);
            
            
            ImageIcon imageIcon1 = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\Recomendaciones-seguridadvial-para-ninios.png");
            Image image1 = imageIcon1.getImage(); // Obtiene la imagen del ImageIcon
            Image newImage1 = image1.getScaledInstance(300, 250, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
            imageIcon1.setImage(newImage1);
            JLabel imagenConsejos = new JLabel(imageIcon1);
            imagenConsejos.setBounds(20,100,300,300);
            add(imagenConsejos);
     
            ImageIcon imageIcon2 = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\6287.jpg");
            Image image2 = imageIcon2.getImage(); // Obtiene la imagen del ImageIcon
            Image newImage2 = image2.getScaledInstance(300, 200, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
            imageIcon2.setImage(newImage2);
            JLabel Consejosseguridad = new JLabel(imageIcon2);
            Consejosseguridad.setBounds(20,500,400,300);
            add(Consejosseguridad);
            
            ImageIcon imageIcon5 = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\43026.jpg");
            Image image5 = imageIcon5.getImage(); // Obtiene la imagen del ImageIcon
            Image newImage5 = image5.getScaledInstance(300, 200, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
            imageIcon5.setImage(newImage5);
            JLabel Educacion = new JLabel(imageIcon5);
            Educacion.setBounds(550,100,400,300);
            add(Educacion);
    
            ImageIcon imageIcon4 = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\6241331.jpg");
            Image image4 = imageIcon4.getImage(); // Obtiene la imagen del ImageIcon
            Image newImage4 = image4.getScaledInstance(300, 200, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
            imageIcon4.setImage(newImage4);
            JLabel Beneficiosbicicleta = new JLabel(imageIcon4);
            Beneficiosbicicleta.setBounds(550,500,400,300);
            add(Beneficiosbicicleta);
    
            ImageIcon imageIconFondo = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\trucks-highway-mountain-sunset.jpg");
            Image image3 = imageIconFondo.getImage(); // Obtiene la imagen del ImageIcon
            Image newImage3 = image3.getScaledInstance(1000, 950, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
            imageIconFondo.setImage(newImage3);
            JLabel Fondo = new JLabel(imageIconFondo);
            Fondo.setBounds(0, 30, 1000, 950);
            add(Fondo);        
            repaint();
            revalidate();

        }
     
}