public class Q01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String word= scan.next();

        if (word.length()%2==1 && word.length()>=3) {
            System.out.println("The word has odd number od characters");
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
        }else {
            System.out.println("Is has not odd number character");
        }

    }

}
