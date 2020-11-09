package view;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import book.Bookrecord;

public class BookCatalogueTest {

    public void booktest() throws FileNotFoundException {
        Bookrecord temp = new Bookrecord();
        temp.bookread();

        PrintWriter horror = new PrintWriter("Horror.txt");
        PrintWriter funny = new PrintWriter("Funny.txt");
        PrintWriter action = new PrintWriter("Action.txt");
        for (int i = 0; i < temp.getLength(); i++) {
            if (temp.getType(i).equals("Horror")) 
            {horror.print(temp.getName(i)+" ");
                horror.println(temp.getId(i));
            }  
            else if(temp.getType(i).equals("Funny")){
            funny.print(temp.getName(i)+" ");
            
                funny.println(temp.getId(i));
            }
            else
            {
            action.print(temp.getName(i)+" ");
            action.println(temp.getId(i));
            }

        }

        horror.close();
        funny.close();
        action.close();
    }
}
