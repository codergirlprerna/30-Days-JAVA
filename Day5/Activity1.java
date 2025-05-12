//Basic Method Creation
package Day5;
public class Activity1{
    public static void main(String[] args) {
        //task1:Create a method addTwoNumber (int a,int b) that returns sum of integer.
        int a=5;
        int b=6;
        int c=2;
        int result = addTwoNumber(a,b);
        System.out.println("Addition of two number: " + result);
        int maximum = maxOfThree(a,b,c);
        System.out.println("Maximum of three numbers are: " + maximum);
        String name="Prerna";
        System.out.println(getGreeting(name));
    }

    public static int addTwoNumber(int a,int b){
        return a + b;
    }
    //task2:Create a method maxOfThree (int a,int b,int c) that return largest of three integers.
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

    //task3:Create a method getGreeting(String name) that returns a greeting message like "Hello, John!".
    public static String getGreeting(String name){
        return "Hello " + name;
    }


}