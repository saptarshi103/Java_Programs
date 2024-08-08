class palindrome{

  public static void main(String args[])
  { 
      for(int i=0; i<args.length;i++)
        {
           int num=Integer.parseInt(args[i]);
           int originalnum=num;
           int reversedNumber=0;
           while (num > 0) {
        int digit = num% 10;
        reversedNumber = reversedNumber * 10 + digit;
        num/= 10;
         }
        System.out.println(reversedNumber );
    
         if(originalnum == reversedNumber ){
             System.out.println("Its palindrome");
          }
         else{
             System.out.println("Its not");
          }

 }
           
   }  
 } 








