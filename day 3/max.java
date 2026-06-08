public class max {
    public static void main(String[] args) {
        int arr[]={200,105,365,195,40};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element in the array:"+max);
    }
}
