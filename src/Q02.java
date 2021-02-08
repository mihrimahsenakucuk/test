import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		1)Kullanıcıdan tamsayı dizisi girmesini isteyin
		2)sort method kullanarak diziyi artan azalan olarak yazdırın.
		 */


        Scanner scan=new Scanner(System.in);
        System.out.println("Dizinin uzunluğunu giriniz");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];

        System.out.println("Dizinin elemanlarını giriniz");
        for(int i=0;i<uzunluk;i++) {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<uzunluk;i++) {
            System.out.println(arr[i]+" ");
        }

        System.out.println();
        Arrays.sort(arr);

        //artan sıra
        for(int i=0; i<uzunluk;i++) {
            System.out.print(arr[i] + "  ");
        }

        //azalan sıra
        for(int i=0; i<uzunluk;i++) {
            System.out.print(arr[uzunluk-1-i] + "  ");
        }


    }
}

