package exe21;

public class gcdArray {
	   
	   class gcd(int x, int y)
	   {
	      //gcd�� ����������� ����
	   }
	   
	   static int array(int a[], int start, int no)
	   {
		  int x = 0;
	      //�迭 a�� ��� ����� �ִ������� ����
	      if (no = 1)
	      {
	         //a[start] ��ȯ
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
	      System.out.print("���� �� ���� �ִ� ������� ���ұ�?: ");
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
	      
	      System.out.println("�ִ�����: " + array(x,0,num));
	   }
