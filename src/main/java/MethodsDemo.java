public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo d = new MethodsDemo();
        d.getData();
        getValue();
    }

    public String getData(){
        System.out.println("Hello World");
        return "Mobashwer A Chowdhury";
    }
    public static void getValue(){
        System.out.println( "Static Method called");
    }
}
