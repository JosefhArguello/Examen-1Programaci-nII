package examen.pkg1.kener.y.josefh;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EducacionSenales extends JPanel{

    public EducacionSenales(){

        Color Azul = new Color(1, 11, 64);
        Font Times = new Font("Times New Roman", Font.BOLD, 28);

        setLayout(null);
        setSize(1000, 950);
        setBackground(Azul);
        setVisible(true);

        JLabel Texto = new JLabel("<html><div style='text-align: justify;'>"
        + "<b>Educación sobre señales de tránsito</b><br>"
        + "Categorías de señales de tránsito:<br><br>"
        + "Señales de Regulación: Estas señales indican a los conductores las acciones que deben realizar, como detenerse, ceder el paso o seguir en una dirección específica.<br><br>"
        + " Señales de Advertencia: Diseñadas para alertar a los conductores sobre peligros potenciales en la carretera, como curvas pronunciadas, cruces de animales, o zonas escolares.<br><br>"
        + " Señales Informativas: Proporcionan información útil sobre la ubicación de servicios, direcciones, distancias y otros datos relevantes para los conductores.<br><br>"
        + "Señales de Obligación: Indican acciones obligatorias para los conductores, como la velocidad máxima, el uso del cinturón de seguridad, o restricciones de giro.");

        Texto.setFont(Times);
        Texto.setForeground(Color.WHITE); // Color del texto
        Texto.setBounds(20, 10, 960, 900); // Establecer posición y tamaño

        add(Texto);
        ImageIcon imageIconFondo = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\traffic-cones-line-up-along-sunlit-asphalt-road.jpg");
        Image image3 = imageIconFondo.getImage(); // Obtiene la imagen del ImageIcon
        Image newImage3 = image3.getScaledInstance(1000, 950, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
        imageIconFondo.setImage(newImage3);
        JLabel Fondo = new JLabel(imageIconFondo);
        Fondo.setBounds(0, 50, 1000, 950);
        add(Fondo);

    }
    
}
