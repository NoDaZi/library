/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import book.Bookrecord;

public class BookCatalogueChart extends JComponent{
    
     public void paintComponent(Graphics g1) {
    	 Bookrecord temp = new Bookrecord();
         try {
                 
             temp.bookread();
         } catch (FileNotFoundException ex) {
             Logger.getLogger(BookCatalogueChart.class.getName()).log(Level.SEVERE, null, ex);
         }
        Graphics2D g2d = (Graphics2D) g1;
        

        
        g2d.drawLine(0, 20,600 , 20);//draw line start point(0,20) end point(600,200)
        g2d.setFont(new Font("궁서",Font.BOLD,30));//set write type, set font size
        g2d.drawString("Books Catalogue Chart", 100, 60);
        g2d.drawLine(0, 80,600 , 80);
        g2d.drawString("Acion", 15, 165);
        g2d.setFont(new Font("궁서",Font.BOLD,20));//change font size
        
        Rectangle rect_h = new Rectangle(100, 90, 50 ,20);//make horror rectangle
    
        Rectangle rect_a = new Rectangle(100, 150, 50 ,20);//make action rectangle
        Rectangle rect_f = new Rectangle(100, 210, 50 ,20);//make action rectangle
        g2d.drawString("Horrer", 15, 105);
        g2d.drawString("Funny", 15, 225);
        for(int i = 0; i<temp.getLength(); i++){//how many have horror
        	if(temp.getType(i).equals("Horror"))
        	{
            g2d.setColor(Color.yellow);//change color black - > yellow
            g2d.fill(rect_h);
            g2d.draw(rect_h);//draw action rectangle
            rect_h.translate(50, 0);//Draw a graph of how many horror books library have.
        }
        	else if(temp.getType(i).equals("Action"))
        	{
        		g2d.setColor(Color.green); //yellow ->green
                g2d.fill(rect_a);
                g2d.draw(rect_a);//draw action rectangle
                rect_a.translate(50, 0);//Draw a graph of how many action books library have.
                }	
        	
        else 
        {
        	g2d.setColor(Color.blue); //black ->green
            g2d.fill(rect_f);
            g2d.draw(rect_f);//draw action rectangle
            rect_f.translate(50, 0);//Draw a graph of how many action books library have.	
        }
        	}
        
        g2d.setColor(Color.black);//change color yellow ->black
        
        g2d.drawLine(0, 250,600 , 250);
    }



}
