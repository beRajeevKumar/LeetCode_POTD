import java.util.TreeMap;

public class MyCalendar {
    public static void main(String[] args) {
        System.out.println();
    }
    TreeMap<Integer, Integer> map;
    public MyCalendar() {
        map = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prevVal = map.lowerKey(end);
        if(prevVal != null && start <= map.get(prevVal)-1){
            return false;
        }
        map.put(start, end);
        return true;
    }
}
