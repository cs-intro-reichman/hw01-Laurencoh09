/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
 
public class GenThree {
   	public static void main (String[] args) {

   		int minNum=Integer.parseInt(args[0]);
   		int maxNum=Integer.parseInt(args[1]);


    int a=(int)((Math.random()*(maxNum-minNum))+minNum);
    System.out.println(a);

    int b=(int)((Math.random()*(maxNum-minNum))+minNum);
    System.out.println(b);

    int c=(int)((Math.random()*(maxNum-minNum))+minNum);
    System.out.println(c);

    int d= Math.min(a , b);
    d=Math.min(d , c);
    System.out.println( " The minimal generated number was " + d);

   }
}

