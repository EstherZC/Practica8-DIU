package com.mycompany.practica8diu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;


public class Lienzo extends JPanel{
    
    private BufferedImage imagen = null;

    public Lienzo() {
        this.setPreferredSize(new Dimension(1024, 768));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
    }
    
    public void setImagen(BufferedImage imagen){
        this.imagen = imagen;
        this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
        repaint();
    }
    
}
