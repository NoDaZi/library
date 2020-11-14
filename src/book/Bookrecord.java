
package book;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookrecord {
    String name,type;
    public int id;
    ArrayList names =new ArrayList();
    ArrayList types =new ArrayList();
    ArrayList ids =new ArrayList();
          
 public  void  bookread() throws FileNotFoundException{
    File inputFile=new File("books.txt");
    Scanner in = new Scanner(inputFile);
        while (in.hasNext()) {
            name = in.next();
            names.add(name); 
            type = in.next();
            types.add(type);
            id = in.nextInt();
            ids.add(id);
        }
        /*for(int i=0;i<names.size();i++) //
        {
        System.out.println(names.get(i));
         System.out.println(types.get(i));
         System.out.println(ids.get(i));
        }*/
        in.close();
    }
 
 
public String getName(int i){return (String) names.get(i);}
public int getLength(){return types.size();}
public String getType(int i){return (String) types.get(i);}
public int getId(int i){return (Integer) ids.get(i);}
 
}
