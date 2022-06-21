package padrao;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.lang.Math;
/**
 *
 * @author Mariane
 */
public class Pitagoras extends JFrame
{
   JLabel titulo, formula, label1, label2, exibir;
   JTextField c1, c2;
   JButton calcular, limpar;
   
   public DecimalFormat df = new DecimalFormat ("0.00");
   
   public Pitagoras()
   {
       super("Teorema de Pitágoras");
       Container tela = getContentPane();
       setLayout(null);
       titulo = new JLabel ("Teorema de Pitágoras");
       formula = new JLabel ("c² = a² + b²");
       label1 = new JLabel ("Valor do 1º cateto:");
       label2 = new JLabel ("Valor do 2º cateto:");
       exibir = new JLabel ("");
       c1 = new JTextField(5);
       c2 = new JTextField(5);
       calcular = new JButton ("Calcular");
       limpar = new JButton ("Limpar");       
       
       titulo.setBounds (80, 20, 300, 20);
       formula.setBounds (130, 45, 300, 40);
        
       label1.setBounds (60, 90, 150, 20);
       c1.setBounds (190, 90, 100, 20);
        
       label2.setBounds (60, 130, 150, 20);
       c2.setBounds (190, 130, 100, 20);
       
       calcular.setBounds (50, 180, 100, 25);
       limpar.setBounds (200, 180, 100, 25);
        
       exibir.setBounds (50, 220, 300, 20);
   
       titulo.setFont(new Font("Arial", Font.BOLD, 18));
       formula.setFont(new Font("Arial", Font.BOLD, 16));
       label1.setFont(new Font("Arial", Font.BOLD, 14));
       label2.setFont(new Font("Arial", Font.BOLD, 14));
       calcular.setFont(new Font("Arial", Font.BOLD, 16));
       limpar.setFont(new Font("Arial", Font.BOLD, 16));
       exibir.setFont(new Font("Arial", Font.BOLD, 16));
       
       calcular.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double hipotenusa, cateto1, cateto2, somacat;
                    hipotenusa = 0.00;
                    cateto1 = Double.parseDouble(c1.getText());
                    cateto2 = Double.parseDouble(c2.getText());
                    somacat = (Math.pow(cateto1, 2))+ (Math.pow(cateto2, 2));
                    hipotenusa = Math.sqrt(somacat);
                    exibir.setVisible(true);
                    exibir.setText("Hipotenusa: " +df.format(hipotenusa));
                } 
            }
        );
       
        limpar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    c1.setText(null);
                    c2.setText(null);
                    exibir.setText(null);
                    c1.requestFocus();  
                } 
            }
        );
              
        exibir.setVisible(false);
        
        tela.add(titulo);
        tela.add(formula);
        
        tela.add(label1);
        tela.add(c1);
        
        tela.add(label2);
        tela.add(c2);
   
        tela.add(calcular);
        tela.add(limpar);
        tela.add(exibir);
       
        tela.setBackground(Color.pink);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(360, 300);
        setVisible(true);
   }
}
