package examen.pkg1.kener.y.josefh;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConsejosSeguridad extends JPanel{

    public ConsejosSeguridad () {
        
            Color Azul = new Color(1, 11, 64);
            
            setLayout(null);
            setSize(1000, 950);
            setBackground(Azul);
            setVisible(true);

            ImageIcon imageIconFondo = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\traffic-cones-line-up-along-sunlit-asphalt-road.jpg");
            Image image3 = imageIconFondo.getImage(); // Obtiene la imagen del ImageIcon
            Image newImage3 = image3.getScaledInstance(1000, 950, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
            imageIconFondo.setImage(newImage3);
            JLabel Fondo = new JLabel(imageIconFondo);
            Fondo.setBounds(0, 50, 1000, 950);
            add(Fondo);
            
    }
}
