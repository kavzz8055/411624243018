public class countevenodd {
    public static void main(String[] args) {
        int x=2567359;
        int evenCount=0;
        int oddCount=0;
        while(x>0){
            int digit=x%10;
            if(digit%2==0){
                evenCount++;
            } else {
                oddCount++;
            }
            x=x/10;
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
