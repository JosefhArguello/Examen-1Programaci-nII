package examen.pkg1.kener.y.josefh;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConsejosSeguridad extends JPanel{

    public ConsejosSeguridad () {
        
            Color Azul = new Color(1, 11, 64);
            Font Times = new Font("Times New Roman", Font.BOLD, 28);
            
            setLayout(null);
            setSize(1000, 950);
            setBackground(Azul);
            setVisible(true);

            JLabel Texto = new JLabel("<html><div style='text-align: justify;'>"
            + "<b>Consejos sobre seguridad vial</b><br>"
            + "Cumplir con los límites de velocidad establecidos en las carreteras y calles para garantizar la seguridad de todos los usuarios de la vía<br><br>"
            + "Respeto a los agentes de tránsito, la protección al peatón, la prevención de accidentes y el uso adecuado del vehículo<br><br>"
            + "Nunca conducir en estado de ebriedad; designar siempre un conductor sobrio<br><br>"
            + "Mantener siempre una distancia segura con el vehículo de adelante para evitar colisiones en caso de frenado repentino<br><br>"
            + "Enciender las luces del vehículo según las condiciones de visibilidad y usar las luces intermitentes al cambiar de carril o al hacer una parada de emergencia"
            + "Mantener el vehículo en buen estado y darle mantenimento regular para asegurarse de que esté en condiciones óptimas de funcionamiento<br><br>"
            + "Mantén la atención en la carretera y evita distracciones como el uso del teléfono móvil mientras conduces<br><br>"
            + "Reducir la velocidad y prestar especial atención a las señales y cruces peatonales en zonas escolares, donde hay un mayor tránsito de niños<br><br>");

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