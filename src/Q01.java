public class Q01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Kelimenizi giriniz");
        String kelime= scan.next();

        if (kelime.length()%2==1 && kelime.length()>=3) {
            System.out.println("Kelimenizdeki karakter sayısı tek.");
            System.out.println(kelime.substring(kelime.length()/2,kelime.length()/2+1));
        }else {
            System.out.println("Kelimenizdeki karakter sayısı çift.");
        }

    }

}
