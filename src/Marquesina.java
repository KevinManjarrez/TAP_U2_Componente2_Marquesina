
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Manjarrez
 */
public class Marquesina extends javax.swing.JPanel implements Serializable {
    private int efecto = 1;
    private int alpha = 250;
    private Timer timer1;
    private Timer timer2;
    private Timer timer3;
    /**
     * Creates new form Marquesina
     */
    public Marquesina() {
        this.timer1 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e){
                /*
                new Color() varias maneras de funcionar:
                1. COlor.RED
                2. new Color(R,B,G) donde 0...255  #RRGGBB 0..9 y A..F SI EN R 200,0,80
                3. new COlor(R,G,B,A) 4 canal, A = ALPHA = TRANSPARENCIA, DONDE 0
                ES ABSOLUTAMENTE TRANSPARENTE y 255 es OPACO.
                
                */
                Color colorin = jLabel1.getForeground();
                alpha -=10;
                jLabel1.setForeground(new Color(colorin.getRed(), colorin.getGreen(), colorin.getBlue(), alpha));
                if(alpha==0){
                    timer1.stop();
                    alpha=250;
                }
            }
        });
        initComponents();
    }
    //METODOS PARA PROGRAMACIÓN, QUE NO SON PROPIEDADES
    public void mostar(){
        efecto();
    }
    
    public void mostar(String mensaje){
        jLabel1.setText(mensaje);
        efecto();
    }
    
    private void efecto(){
        switch(efecto){
            case 1:
                timer1.start();
                break;
            case 2:
                //timer2.start();
                break;
            default:
                
                break;
        }
    }
    
    
    
    
    //METODOS QUE NO SON PROPIEDADES.
    public void setEfecto(int e){
        efecto = e;
    }
    
    public int getEfecto(){
        return efecto;
    }
    
    @Override
    public void setForeground(Color c){
        try{
            jLabel1.setForeground(c);
        }catch(Exception e){
            
        }
    }
    
    @Override
    public Color getForeground(){
        try{
            return jLabel1.getForeground();
        }catch(Exception e){
           return new Color(0,0,0); 
        }
    }
    
    
    @Override
    public void setFont (Font f){
        try{
            jLabel1.setFont(f);
        }catch(Exception e){
            
        }
    }
    
    @Override
    public Font getFont(){
        try{
           return jLabel1.getFont();
        }catch(Exception e){
            return new Font("Arial Narrow",18, Font.PLAIN);
        }
    }
    
    
    public void setText (String t){
        try{
            jLabel1.setText(t);
        }catch(Exception e){
            
        }
    }
    
    public String getText (){
        try{
           return jLabel1.getText();
        }catch(Exception e){
            return "jLabel1";
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
