package examen.pkg1.kener.y.josefh;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BeneficiosTransporte extends JPanel{

    public BeneficiosTransporte () {
        
        Color Azul = new Color(1, 11, 64);
        Font Times = new Font("Times New Roman", Font.BOLD, 28); 
        setLayout(null);
        setSize(1000, 950);
        setBackground(Azul);
        setVisible(true);

        
        JLabel Texto = new JLabel("<html>Sostenibilidad ambiental:<br/>" +
        "El transporte público reduce la congestión y la contaminación al disminuir la cantidad de vehículos en las carreteras.<br/>" +
        "Contribuye a la preservación del medio ambiente al reducir las emisiones de gases de efecto invernadero y la huella de carbono.<br/><br/>" +
        "Economía personal:<br/>" +
        "Al optar por el transporte público, se reducen significativamente los gastos asociados con la propiedad y el mantenimiento de un vehículo privado.<br/>" +
        "Los usuarios ahorran en costos de combustible, estacionamiento, seguros y mantenimiento, lo que supone un ahorro económico considerable a largo plazo.<br/><br/>" +
        "Inclusión social:<br/>" +
        "El acceso a servicios de transporte público brinda la oportunidad de movilidad a personas de diferentes niveles socioeconómicos.<br/>" +
        "Promueve la inclusión social al permitir que personas de distintas condiciones puedan desplazarse de manera efectiva y asequible, fomentando la igualdad de oportunidades.<br/><br/>" +
        "Seguridad vial:<br/>" +
        "Al reducir el número de vehículos en circulación, el transporte público contribuye a mejorar la seguridad vial.<br/>" +
        "Fomenta formas más seguras de desplazamiento para todos los usuarios al disminuir la probabilidad de accidentes y colisiones en las carreteras.</html>");
        Texto.setFont(Times);
        Texto.setForeground(Color.WHITE); // Color del texto
        Texto.setBounds(20, 10, 960, 900); // Establecer posición y tamaño
        
        add(Texto);
        ImageIcon imageIconFondo = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\capa-inside-transporte-publico-draft1-13-mar-23.jpg");
        Image image3 = imageIconFondo.getImage(); // Obtiene la imagen del ImageIcon
        Image newImage3 = image3.getScaledInstance(1000, 950, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
        imageIconFondo.setImage(newImage3);
        JLabel Fondo = new JLabel(imageIconFondo);
        Fondo.setBounds(0, 50, 1000, 950);
        add(Fondo);                
}
}
