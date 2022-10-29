package exe21;

public class gcdArray {
	   
	   class gcd(int x, int y)
	   {
	      //gcd를 비재귀적으로 구함
	   }
	   
	   static int array(int a[], int start, int no)
	   {
		  int x = 0;
	      //배열 a의 모든 요소의 최대공약수를 구함
	      if (no = 1)
	      {
	         //a[start] 반환
	      }
	      else if (no = 2)
	      {
	         //
	      }
	      else
	    	  gcd(gcd(a[x], a[x+1]),a[x+2]);
	      	  x+=1;
	      
	   }
	   
	   public static void main(String[] args)
	   {
	      Scanner stdIn = new Scanner(System.in);
	      System.out.print("정수 몇 개의 최대 공약수를 구할까?: ");
	      int num;
	      do
	      {
	         num = stdIn.nextInt();
	      }while (num <=1);
	      
	      int [] x = new int[num];
	      for (int i = 0; i< num; i++)
	      {
	         System.out.print("x[" + i + "]:" );
	         x[i] = stdIn.nextInt();
	      }
	      
	      System.out.println("최대공약수: " + array(x,0,num));
	   }
