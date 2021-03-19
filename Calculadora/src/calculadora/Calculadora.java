
package calculadora;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;

class Formulario extends JFrame implements ActionListener{
    JPanel calculo;


    JButton sumar;
    JButton restar;
    JButton multiplicar;
    JButton dividir;
    JButton salir;
    JTextField anade1;
    JTextField anade2;
    JTextField result;
    
    public Formulario(){
        this.setTitle("Calculadora");
        this.setSize(470,300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        calculo = new JPanel();
        calculo.setLayout(null);
        
        Font miFuente = new Font("Times New Roman", Font.PLAIN, 24);
        
        anade1 = new JTextField();
        anade1.setBounds(10, 80, 210, 50);
        anade1.setHorizontalAlignment(CENTER);
        anade1.setFont(miFuente);
        calculo.add(anade1);
        
        anade2 = new JTextField();
        anade2.setBounds(230, 80, 210, 50);
        anade2.setHorizontalAlignment(CENTER);
        anade2.setFont(miFuente);
        calculo.add(anade2);
        
        result = new JTextField();
        result.setBounds(10, 20, 430, 50);
        result.setHorizontalAlignment(CENTER);
        result.setText("Resultado");
        result.setFont(miFuente);
        result.setEditable(false);
        calculo.add(result);
        

        
        sumar = new JButton("Sumar");
        sumar.setBounds(10, 150, 100, 30);
        calculo.add(sumar);
        
        restar = new JButton("Restar");
        restar.setBounds(120, 150, 100, 30);
        calculo.add(restar);
        
        multiplicar = new JButton("Multiplicar");
        multiplicar.setBounds(230, 150, 100, 30);
        calculo.add(multiplicar);
        
        dividir = new JButton("Dividir");
        dividir.setBounds(340, 150, 100, 30);
        calculo.add(dividir);
        
        salir = new JButton("Salir");
        salir.setBounds(175, 200, 100, 30);
        calculo.add(salir);
        
        sumar.addActionListener(this);
        restar.addActionListener(this);
        multiplicar.addActionListener(this);
        dividir.addActionListener(this);
        salir.addActionListener(this);
        
        
        
          
        
        
        
        
        
        
        this.add(calculo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            double num1, num2, calculo;
            num1 = Double.parseDouble(anade1.getText());
            num2 = Double.parseDouble(anade2.getText());
            
        if (e.getSource() == restar){

            calculo = num1 - num2;
            String sCalculo = String.valueOf(calculo);
            result.setText(sCalculo);     
        }

        if (e.getSource() == sumar){

            calculo = num1 + num2;
            String sCalculo = String.valueOf(calculo);
            result.setText(sCalculo);     
        }
        
        if (e.getSource() == multiplicar){

            calculo = num1 * num2;
            String sCalculo = String.valueOf(calculo);
            result.setText(sCalculo);
        }
        
        if (e.getSource() == dividir){

            calculo = num1 / num2;
            String sCalculo = String.valueOf(calculo);
            result.setText(sCalculo);
        }

        if (e.getSource() == salir){
            System.exit(0);
        }
    }
    
    
}

public class Calculadora {

    public static void main(String[] args) {
        Formulario calculadora = new Formulario();
        calculadora.setVisible(true);

    }
    
}
