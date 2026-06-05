public class control {
    public static void main(String[] args) {
        int age=17,marks=95;
        if(age>=18 && marks<=90){
            System.out.println("Eligible for scholarship");
        }else if(age>=18 && age<90){
            System.out.println("Eligible for 50% of scholarship");

        }else if(age<18 && marks>90){
            System.out.println("Not eligible for scholarship");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
