//method calling another method

package Day5;

public class Activity4 {
    public static void main(String[] args) {
        //Task 8: Write a method printGreeting(String name) that calls getGreeting(name) and prints the returned message.
        printGreeting("Prince");
        printGreeting("Aman");
        printMax(3,5,1);
        printMax(4,2,0);
    } 
    public static void printGreeting(String name){
        String message = getGreeting(name);
        System.out.println(message);
        }
    public static String getGreeting(String name){
        return "Hello " + name;
    }
    //task 9: Write a method printMax(int a, int b, int c) that calls maxOfThree() and prints the result.
    public static void printMax(int a,int b,int c){
        int max=maxOfThree(a,b,c);
        System.out.println(max);
    }
    public static int maxOfThree(int a,int b,int c){
        int max;
        if(a>b){
            if(a>c){
                max=a;
            }else{
                max=c;
            }
        }else if(b>c){
            max=b;
        }else{
            max=c;
        }
        return max;

    } 
}
