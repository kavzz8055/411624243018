public class palindromenum {
    public static void main(String[] args){
        int x=234565432;
        int rev=0;
        int temp=x;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(temp==rev){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
