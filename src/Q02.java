import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args){
        /*
        1)Kullanıcıdan array'in uzunluğunu girmesini isteyin.
        2)sort method kullanarak array'i konsola artan ve azalan sırada yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Array'in uzunluğunu giriniz");
        int uzunluk=scan.nextInt();
        int arr[]= new int[uzunluk];

        System.out.println("Array'in elemanlarını giriniz");
        for(int i=0 ; i<uzunluk ; i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0 ; i<uzunluk ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);

        //artan sıralama
        for(int i=0 ; i<uzunluk ; i++){
            System.out.println(arr[i] + " ");
        }

        //azalan sıralama
        for(int i= 0; i<uzunluk ; i++){
            System.out.println(arr[uzunluk-1-i] + " ");
        }
    }
}
