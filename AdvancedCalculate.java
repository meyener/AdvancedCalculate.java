import java.util.Scanner;
import java.math.*;



public class AdvancedCalculate {
    public static void calculate(int j, int k) {
        Scanner scanner= new Scanner(System.in);
        double a,b=1,n,t,p;
        double total=0;
        System.out.println("Please select which operation will you choose : \nFor addition press 1,\nFor minus press 2,\nFor Divided By press 3,\nFor Multiply press 4,\nFor exponential calculation press 5,\nFor Factorial calculation press 6,\nFor modding press 7,\nFor exit press 0.");
        a=scanner.nextInt();
        //System.out.print("Please enter first number = ");
        //first=scanner.nextInt();
        //System.out.print("Please enter second number = ");
        if (a==0) {
            System.out.println(" Thanks for you used this program.");
            
        } else if(a==1){
            System.out.println(j+" + "+k+" = "+(j+k));    
        }else if(a==2){
            System.out.println(j+" - "+k+" = "+(j-k));
        }else if(a==3){
            System.out.println(j+" / "+k+" = "+(j/k));
        }else if(a==4){
            System.out.println(j+" x "+k+" = "+(j*k));
        }else if(a==5){
            for (int i = 0; i <k; i++) {
                b=b*j;
            }
            System.out.println("exponential calculation's result is = "+b);
            
        }else if(a==6){
            for (int i = 1; i <=j; i++) {
                b=b*i;
            }
            
        }else if(a==7){
            b=j%k;
            System.out.println("The mod is = "+b);
            
        }else{
            System.out.println("You entered wrong input please try again.");
            calculate(j, k);
        }
        
        
    }
    public static void main(String[] args) {
        
         calculate(5,3);
    }
}
