public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
        int myNumnber = 5;
        String website = "https://www.mamtech.net";
        char letter = 'c';
        double dec = 9.55;
        boolean myCard = false;
        System.out.println(myNumnber);
        System.out.println(website);
        System.out.println(letter);
        System.out.println(myCard);

        int[] arr = new int[5];
        arr[0]=4;
        System.out.println(arr[4]);

        int[] arr2 = {3,2,5,2,5,6};
        System.out.println(arr2[3]);

        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }

        String[] name = {"noyon","rahul","shaheen"};
        for (String s: name) {
            System.out.println(s);
        }

    }
}
