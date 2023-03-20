public class CoreJavaBrushup3 {
    public static void main(String[] args) {
        String s = "Mobasher A Chowdhury";

        String s2 = new String("Welcome");

        String[] splitString = s.split("Chow");

        for (String val:splitString
             ) {
            System.out.println(val);
        }

        for (int i = 0; i <s.length() ; i++) {
            System.out.print(s.charAt(s.length()-i-1));
        }
        System.out.println();
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }

    }
}
