import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String [] arr = {"Leet", "Code"};
        HashSet<String> arrSet = new HashSet<>(Arrays.asList(arr));
        System.out.println(arrSet);

    }
}