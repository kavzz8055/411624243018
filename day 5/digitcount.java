public class digitcount {
    public static void main(String[] args) {
        int x=256789;
        int count=0;
        while(x>0){
            count++;
            x=x/10;
            
        }
        System.out.println("The number of digits in the number is: " + count);
    }
}
