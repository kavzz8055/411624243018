public class freqofnum {
    public static void main(String[] args) {
        int arr[]={10,25,96,25,39,42,25,81,25};
        int freq[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            freq[i]=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    freq[i]++;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.println(arr[i]+"\t"+freq[i]);
            }
        }
    }
}
