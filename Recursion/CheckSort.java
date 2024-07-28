public class CheckSort {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,4,6};
        boolean ans= verify(arr,0);
        System.out.println(ans);
    }
public static boolean verify(int[] arr, int index){
    if(index==arr.length-1){
        return true;
    }
    if(arr[index]>arr[index+1]){
        return false;
    }else{
        return verify(arr, ++index);
    }

}
}
