import java.util.*;
class switch3
 {
    public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
          System.out.println("\t\t\tCalculator");
          System.out.println("\t\t\t=======================");
          System.out.println("\t\t\t+:ADD");
          System.out.println("\t\t\t-:SUB");
          System.out.println("\t\t\t*:Mult");
          System.out.println("\t\t\t/:DIV");
          System.out.println("\t\t\tenter your choice=");
                         char ch=sc.next().charAt(0);
          
  
         switch(ch)
        {
           case '+' :
          {
           System.out.println("\t\t\tEnter first no =");
                        int a=sc.nextInt();
           System.out.println("\t\t\tEnter second no =");
                        int b=sc.nextInt();
           int c=a+b;
           System.out.println("\t\t\tAddition of two no is = " + c);
           break;
          }
           
           case '-' :
          {
            System.out.println("\t\t\tEnter first no =");
                        int d=sc.nextInt();
            System.out.println("\t\t\tEnter second no =");
                        int e=sc.nextInt();
            int f=d-e;
            System.out.println("\t\t\tSubstraction of two no is = " + f);
            break;
          }
      
            case '*' :
          {
            System.out.println("\t\t\tEnter first no =");
                        int g=sc.nextInt();
            System.out.println("\t\t\tEnter second no =");
                        int h=sc.nextInt();
            int i=g*h; 
            System.out.println("\t\t\tMultiplication of two no is = " + i);
            break;
          }
            
            
            case '/' :
          {
            System.out.println("\t\t\tEnter first no =");
                        int p=sc.nextInt();
            System.out.println("\t\t\tEnter second no =");
                        int q=sc.nextInt();
            int r=p/q; 
            System.out.println("\t\t\tDivision of two no is = " + r);
            break;
          }

        }
  }
 }
       