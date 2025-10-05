public class D2_ifelse {
    public static void main(String[] args) {
        //IF
        int x = 5;
        if(x == 5) {
            System.out.println("Value of x is : " +x);
        }
        
        //IF-ELSE
        int age  = 20;
        if(age > 18) {
            System.out.println("Your are eligible for Voting");
        }
        else {
            System.out.println("Your are not eligible for Voting");
        }

        //NESTED
        int a = 10;
        int b = 15;
        int c = 23;
        if(a>b) {
            if(a>c) {
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else {
            if(c>b) {
                System.out.println(c);
            }
            else{
                System.out.println(b);
            }
        }
    }
}
