
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        char ch, ignore, answer= 'G';

        do {
            System.out.println("pomyslalem litere z przedziaøu od A do Z");
            System.out.println("sprobuj ją odgadnać ");
            ch = (char) System.in.read();

            do{
                ignore = (char) System.in.read();
              }while(ignore != '\n');

            if(ch == answer) System.out.println(" ** DOBRZE **");
            else{
                System.out.println("nie trafiłeś ");
                if(ch < answer) System.out.println(" Trafiles za nisko ");
                else System.out.println(" za wysoko ");
                 System.out.println(" Sprobuj jeszcze raz \n ");
                }
        }while (answer != ch);

    }
}
