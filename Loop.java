package UAS;
import static java.lang.System.out;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        int i,n;
        out.print("Masukkan Jumlah Suku= ");n=masuk.nextInt();
        for(i=1;i<n;i=i+2){
            out.println(i+" adalah bilangan Ganjil");
            out.println((i+1)+" adalah bilangan Genap");
        }
    }
}
