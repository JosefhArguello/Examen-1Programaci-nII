package examen.pkg1.kener.y.josefh;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Examen extends JPanel{

    JLabel pregunta1;
    JLabel pregunta2;
    JLabel pregunta3;
    JLabel pregunta4;

    String respuesta1;
    String respuesta2;
    String respuesta3;
    String respuesta4;

    ButtonGroup opciones;
    JRadioButton verdadero;
    JRadioButton falso;

    JButton guardar;
    JButton siguiente;

    public Examen(){

        setLayout(null);
        setSize(1000, 950);
        setBackground(Color.RED);
        setVisible(true);

        Font Times = new Font("Times New Roman", Font.BOLD, 22);

        pregunta1 = new JLabel("Seleccione el cargo del empleado:"); 
        pregunta1.setBounds(20, 10, 960, 900); 
        pregunta1.setFont(Times); 
        pregunta1.setForeground(Color.WHITE); 
        add(pregunta1);
        pregunta1.setVisible(true);
        
        pregunta2 = new JLabel("Seleccione el cargo del empleado:"); 
        pregunta2.setBounds(20, 10, 960, 900); 
        pregunta2.setFont(Times); 
        pregunta2.setForeground(Color.WHITE); 
        add(pregunta2); 
        pregunta2.setVisible(false);

        pregunta3 = new JLabel("Seleccione el cargo del empleado:"); 
        pregunta3.setBounds(30, 100, 400, 30); 
        pregunta3.setFont(Times); 
        pregunta3.setForeground(Color.WHITE); 
        add(pregunta3); 
        pregunta3.setVisible(false);

        pregunta4 = new JLabel("Seleccione el cargo del empleado:"); 
        pregunta4.setBounds(30, 100, 400, 30); 
        pregunta4.setFont(Times); 
        pregunta4.setForeground(Color.WHITE); 
        add(pregunta4);
        pregunta4.setVisible(false);

        verdadero = new JRadioButton("Verdadero");
        falso = new JRadioButton("Falso");

        opciones = new ButtonGroup();
        opciones.add(verdadero);
        opciones.add(falso);

        JButton guardar = new JButton("Verificar selección");
        guardar.addActionListener(e -> {

            if (verdadero.isSelected()) {
                respuesta1 = "Verdadero";
            } else if (falso.isSelected()) {
                respuesta1 = "falso";   
            } 

        });


        
        JButton siguiente = new JButton("Siguiente pregunta");
        siguiente.setFont(Times); 
        siguiente.setBackground(Color.WHITE); 
        siguiente.setBounds(50, 300, 200, 40);
        siguiente.addActionListener((ActionEvent e) -> {    
            
        });

}

}
