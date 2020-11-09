
package library;

import book.Bookrecord;

import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;

import view.BookCatalogueChart;
import view.BookCatalogueTest;



public class Library {

    public static void main(String[] args)throws FileNotFoundException  {
        Scanner in = new Scanner(System.in);
        
        Bookrecord temp = new Bookrecord();
        temp.bookread();
 
        
       int i = 0;
        do {
            System.out.print(LibraryTester.title());
            int choice = in.nextInt();
            if (choice == 1) {
               // System.out.println("choice1");
            } else if (choice == 2) {
               BookCatalogueChart chart =new BookCatalogueChart();
       JFrame f1 = new JFrame();       
        f1.setSize(600, 800);
   f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
               f1.add(chart);
               // System.out.println("choice2");
            } else if (choice == 3) {
                BookCatalogueTest test =new BookCatalogueTest();
                test.booktest();
                //System.out.println("choice3");
            } else if (choice == 0) {
               //System.out.println("choice0");
                i =1;
            } else {System.out.println("Wrong Number!!");}
        } while (i == 0);

    
    }
    }


/*package library;

import book.Bookrecord;

import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;

import view.BookCatalogueChart;
import view.BookCatalogueTest;



public class Library extends JFrame {

    public static void main(String[] args)throws FileNotFoundException  {
        Scanner in = new Scanner(System.in);
        
        Bookrecord temp = new Bookrecord();
        temp.bookread();
        JFrame f1 = new JFrame();       
        f1.setSize(600, 800);
        f1.setVisible(true);
        
       int i = 0;
        do {
            System.out.print(LibraryTester.title());
            int choice = in.nextInt();
            if (choice == 1) {
               // System.out.println("choice1");
            } else if (choice == 2) {
            	BookCatalogueChart chart =new BookCatalogueChart();
            	f1.add(chart);
               // System.out.println("choice2");
            } else if (choice == 3) {
                BookCatalogueTest test =new BookCatalogueTest();
                test.booktest();
                //System.out.println("choice3");
            } else if (choice == 0) {
               //System.out.println("choice0");
                i =1;
            } else {System.out.println("Wrong Number!!");}
        } while (i == 0);

    
    }
    }

*/
