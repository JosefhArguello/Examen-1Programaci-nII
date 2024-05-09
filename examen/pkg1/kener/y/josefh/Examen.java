package examen.pkg1.kener.y.josefh;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Examen extends JPanel{

    JLabel pregunta1;
    JLabel pregunta2;
    JLabel pregunta3;
    JLabel pregunta4;
    JLabel nombre;
    String opciones[] = {"","Verdadero", "Falso"};
    
    JComboBox respuesta1;
    JComboBox respuesta2;
    JComboBox respuesta3;
    JComboBox respuesta4;
    JTextArea Nombre;
    JTextArea areaDatos;
    
    JButton guardar;

    public Examen(){
        
        setLayout(null);
        setSize(1000,950);
        setBackground(Color.GRAY);
        setVisible(true);
        ArrayList<Aplicante> array = new ArrayList<>();
        Aplicante datos = new Aplicante();

        Font Times = new Font("Times New Roman", Font.BOLD, 20);

        areaDatos = new JTextArea("");
        areaDatos.setFont(Times);
        areaDatos.setEditable(false);
        JScrollPane Area = new JScrollPane(areaDatos);
        Area.setBounds(300, 550, 300, 300);
        add(Area);

        Nombre = new JTextArea("");
        Nombre.setFont(Times);
        Nombre.setBounds(360, 50, 400, 30);
        add(Nombre);
        
        nombre = new JLabel("Nombre completo:");
        nombre.setFont(Times);
        nombre.setForeground(Color.WHITE);
        nombre.setBounds(200, 50, 200, 30);
        add(nombre);

        pregunta1 = new JLabel("<html><div style='text-align: justify;'>"
        + "1. Al circular por zonas escolares, se debe prestar especial atención a las señales y cruces debido a la mayor presencia de peatones niños"); 
        pregunta1.setBounds(20, -300, 960, 900); 
        pregunta1.setFont(Times); 
        pregunta1.setForeground(Color.WHITE); 
        add(pregunta1);

        respuesta1 = new JComboBox <> (opciones);
        respuesta1.setBounds(20, 180,100, 30);
        respuesta1.setFont(Times);
        add(respuesta1);
        
        pregunta2 = new JLabel("<html><div style='text-align: justify;'>"
        + "2. Entre más personas utilicen la bicicleta como medio de transporte, habrá más congestión de tráfico por exceso de bicicletas en la calle"); 
        pregunta2.setBounds(20, -200, 960, 900);  
        pregunta2.setFont(Times); 
        pregunta2.setForeground(Color.WHITE); 
        add(pregunta2); 

        respuesta2 = new JComboBox <> (opciones);
        respuesta2.setBounds(20, 280,100, 30);
        respuesta2.setFont(Times);
        add(respuesta2);

        pregunta3 = new JLabel("<html><div style='text-align: justify;'>"
        + "3. Las señales de regulación proporcionan información útil sobre la ubicación de servicios, direccione, distancias y otros datos relevantes para los conductores "); 
        pregunta3.setBounds(20, -80, 960, 900); 
        pregunta3.setFont(Times); 
        pregunta3.setForeground(Color.WHITE); 
        add(pregunta3); 

        respuesta3 = new JComboBox <> (opciones);
        respuesta3.setBounds(20, 400,100, 30);
        respuesta3.setFont(Times);
        add(respuesta3);
        

        pregunta4 = new JLabel("<html><div style='text-align: justify;'>"
        + "4. El transporte público reduce la contaminación y la congestión del tráfico al disminuir la cantidad de vehículos en carretera"); 
        pregunta4.setBounds(20, 40, 960, 900); 
        pregunta4.setFont(Times); 
        pregunta4.setForeground(Color.WHITE); 
        add(pregunta4);

        respuesta4 = new JComboBox <> (opciones);
        respuesta4.setBounds(20, 520,100, 30);
        respuesta4.setFont(Times);
        add(respuesta4);
        
        guardar = new JButton("Obtener nota"); 
        guardar.setBounds(20, 800, 200, 40); 
        guardar.setFont(Times); 
        add(guardar); 
        guardar.setBackground(Color.WHITE); 
        guardar.addActionListener((ActionEvent e) -> { 
                int nota = 0;
                String A = (String) respuesta1.getSelectedItem();
                String B = (String) respuesta2.getSelectedItem();
                String C = (String) respuesta3.getSelectedItem();
                String D = (String) respuesta4.getSelectedItem();

                if(A == "Verdadero"){
                      nota++; 
                }else if(A == "Falso"){
                      nota = nota;
                }else if(A == "Seleccione falso o verdadero"){
                        nota = nota;
                }

                if(B == "Verdadero"){
                        nota = nota; 
                  }else if(B == "Falso"){
                        nota++;
                  }else if(A == "Seleccione falso o verdadero"){
                          nota = nota;
                  }

                  if(C == "Verdadero"){
                        nota = nota; 
                  }else if(C == "Falso"){
                        nota++;
                  }else if(C == "Seleccione falso o verdadero"){
                          nota = nota;
                  }

                  if(D == "Verdadero"){
                        nota++; 
                  }else if(D == "Falso"){
                        nota = nota;
                  }else if(D == "Seleccione falso o verdadero"){
                          nota = nota;
                  }
                  String N = Nombre.getText();
    
               datos.datosAplicante(N, nota); 
               array.add(datos); 

               StringBuilder sb = new StringBuilder();
              for (Aplicante aplicante : array) {
              sb.append(aplicante.datos()).append("\n");
               }          
               areaDatos.setText(sb.toString());

        });
        ImageIcon imageIconFondo = new ImageIcon("examen\\pkg1\\kener\\y\\josefh\\images\\moon-2762111_1920.jpg");
            Image image3 = imageIconFondo.getImage(); // Obtiene la imagen del ImageIcon
            Image newImage3 = image3.getScaledInstance(1000, 950, Image.SCALE_SMOOTH); // Escala la imagen al tamaño deseado
            imageIconFondo.setImage(newImage3);
            JLabel Fondo = new JLabel(imageIconFondo);
            Fondo.setBounds(0, 0, 1000, 950);
            add(Fondo);
            
       
        repaint();
        revalidate();
    }
}