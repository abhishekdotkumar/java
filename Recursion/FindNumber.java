import java.util.ArrayList;

public class FindNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,5};

        ArrayList<Integer> list= search(arr,0, 5);

        System.out.println(list);

    }
    public static ArrayList<Integer> search(int[] arr,int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length)
        return list;

        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls= search(arr, ++index, target);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
