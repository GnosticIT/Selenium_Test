
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {
    public static void main(String[] args) {
        int[] arr2 = {3,2,5,2,5,6};
        for (int i = 0; i <arr2.length ; i++) {
            if(arr2[i] % 2 == 0){
                System.out.println(arr2[i]);
            }
        }
        ArrayList<String> a = new ArrayList<String>();
        a.add("Mohsena");
        a.add("Arif");
        a.add("Very Good");
        a.add("Thank You");

        System.out.println(a.get(3));
        for (String val:a) {
            System.out.println(val);
        }
        /* item is present in ArrayList */
        System.out.println(a.contains("Arif"));
        String[] name = {"noyon","rahul","shaheen"};

        List<String> nameArrayList1 = Arrays.asList(name);

        System.out.println(nameArrayList1.contains("shaheen1"));
        System.out.println(nameArrayList1.size());

    }
}
