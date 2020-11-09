
package library;

public class LibraryTester {
    
    static String title(){
    
      String dot = "**************************************************";
        String line = "--------------------------------------------------";
        String tit = dot + "\n" + "              Online Library System\n"
                + line + "\n" + "1. Show Catalogue Flyer.\n"
                + "2. Show Catalogue Bar Chart.\n"
                + "3. Generate Catalogue Text File.\n"
                + "0. Quit.\n" + dot + "\n" + "Enter your choice:";
        return tit;
    }
}

