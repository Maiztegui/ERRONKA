
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        batuketa();
    }
    public static void batuketa() {
        Scanner num=new Scanner(System.in);

        Double zenbakia1, zenbakia2,emaitza;

        System.out.println("===================================");
        System.out.println("====         BATUKETA           ====");
        System.out.println("===================================");
        System.out.println("Sartu lehenengo zenbakia");
        zenbakia1=num.nextDouble();
        System.out.println("Sartu bigarren zenbakia");
        zenbakia2=num.nextDouble();

        emaitza=zenbakia1+zenbakia2;
        System.out.println("Sartutako zenbakien batuketa "+emaitza+" da!");
    }

}