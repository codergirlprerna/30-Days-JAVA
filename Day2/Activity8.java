//Combined Operations

package Day2;

public class Activity8 {
    public static void main(String[] args) {
        //task14:Combine arithmetic and relational operator:(a+b)>(c-d) and print the boolean result.
        int a=5,b=15,c=10,d=20;
        boolean result=(a+b)>(c-d);
        System.out.println(result);

        //task15:use((x*y)%2==0) && z to determine if a result is even and a boolean is true;print the result
        int x=2,y=5;
        boolean z=true;

        boolean results = ((x*y)%2==0) && z;
        System.out.println(results);


    }
}
