public class largestnum {
    public static void main(String[] args){
    int num=834530;
    int max=num%10;
    num=num/10;
       while(num>0){
        int digit=num%10;
        if(digit>max){
            max=digit;
        }
        num=num/10;

       }
    System.out.println(max);
    }
}
