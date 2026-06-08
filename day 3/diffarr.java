public class diffarr {
    public static void main(String[] args) {
        int arr1[]={6,7,8,9,10};
        int arr2[]={1,2,3,4,5};
        int diff=0;
        for(int i=0;i<arr1.length;i++){
            diff+=arr1[i]-arr2[i];
        }
        System.out.println("difference of array elements:"+diff);
    }
}
