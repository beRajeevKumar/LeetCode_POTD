import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RankTransform {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> indexArr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            indexArr.add(i);
        }
        Collections.sort(indexArr, new Comparator<Integer>(){
            public int compare(Integer x, Integer y){
                return arr[x] - arr[y];
            }
        });
        int rank = 0;
        int prev = Integer.MAX_VALUE;
        int[] res = new int[n];
        for(int index : indexArr){
            if(prev != arr[index]){
                prev = arr[index];
                rank++;
            }
            res[index] = rank;
        }
        return res;
    }
}
