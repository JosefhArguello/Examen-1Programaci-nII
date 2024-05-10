package examen.pkg1.kener.y.josefh;

    import java.awt.Color;
    import java.awt.Font;
    import java.awt.Image;
    
    import javax.swing.ImageIcon;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
  /**
 * Clase que muestra los beneficios de andar en bicicleta.
 */
    public class BeneficiosBicicleta extends JPanel{
     /**
     * Constructor de la clase BeneficiosBicicleta.
     * Muestra los beneficios de andar en bicicleta y una imagen relacionada.
     */
        public BeneficiosBicicleta () {
            // Código para configurar el diseño y mostrar los beneficios de andar en bicicleta
            Color Azul = new Color(1, 11, 64);
            Font Times = new Font("Times New Roman", Font.BOLD, 28); 
            setLayout(null);
            setSize(1000, 950);
            setBackground(Azul);
            setVisible(true);
    
            
            JLabel Texto = new JLabel("<html><div style='text-align: justify;'>"
            + "<b>Salud Física</b><br>"
            + "Montar en bicicleta mejora la salud cardiovascular, fortalece los músculos y ayuda en la pérdida de peso. "
            + "Promueve un estilo de vida activo, reduciendo el riesgo de enfermedades crónicas como la diabetes tipo 2 y la obesidad.<br><br>"
            + "<b>Salud Mental</b><br>"
            + "El ciclismo regular reduce el estrés, mejora el estado de ánimo y aumenta el bienestar general. "
            + "Ayuda a despejar la mente y desconectarse del estrés diario.<br><br>"
            + "<b>Amigable con el Medio Ambiente</b><br>"
            + "El ciclismo es una forma de transporte sostenible que no produce emisiones contaminantes ni contribuye al calentamiento global. "
            + "Ayuda a reducir la huella de carbono personal.<br><br>"
            + "<b>Ahorro de Tiempo</b><br>"
            + "En áreas urbanas congestionadas, la bicicleta puede ser más rápida en distancias cortas a moderadas, evitando atascos de tráfico y accediendo a rutas más directas y flexibles.<br><br>"
            + "<b>Reducción del Tráfico</b><br>"
            + "Más personas utilizando la bicicleta como medio de transporte ayuda a aliviar la congestión del tráfico, mejorando la fluidez del tráfico y reduciendo los tiempos de viaje para todos los usuarios de la carretera."
            + "</div></html>");
            Texto.setFont(Times);
            Texto.setForeground(Color.WHITE); // Color del texto
            Texto.setBounds(20, 10, 960, 900); // Establecer posición y tamaño
            
            add(Texto);
            ImageIcon imageIconFondo = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\bicicleta-consejos-1194x585-1.png");
            Image image3 = imageIconFondo.getImage(); // Obtiene la imagen del ImageIcon
            Image newImage3 = image3.getScaledInstance(1000, 950, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
            imageIconFondo.setImage(newImage3);
            JLabel Fondo = new JLabel(imageIconFondo);
            Fondo.setBounds(0, 50, 1000, 950);
            add(Fondo);                
    }
    }
