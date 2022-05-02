import java.util.Scanner;

public class Second_task {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Введіть тризначне число:");
        int n=in.nextInt();
        int h,t,o;
        h=n/100;
        t=(n-(h*100))/10;
        o=(n-(h*100)-(t*10));
        if(h>t && h>o) {
            System.out.println("Найбільша цифра="+h);
        }
        if(t>o && t>h) {
            System.out.println("Найбільша цифра="+t);
        }
        if(o>t && o>h) {
            System.out.println("Найбільша цифра="+o);
        }
        if (h==t && t==o && h==o) {
            System.out.println("Всі цифри рівні");

        }
        if (h==t && h>o ) {
            System.out.println("Найбільша цифра="+h);

        }
        if (h==o && h>t ) {
            System.out.println("Найбільша цифра="+h);

        }


    }
}
