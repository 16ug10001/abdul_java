class abdulif{
    public static void main(String[] args) {

    	int number = 10;

    	if (number > 0) {
    		System.out.println("Number is positive.");
    	}
    	System.out.println("This statement is always executed.");
    }
}


class abdulifelse{
   public static void main(String[] args) {    	
      int number = 10;
	 
      if (number > 0) {
         System.out.println("Number is positive.");
      }
      else {
         System.out.println("Number is not positive.");
      }
 
      System.out.println("This statement is always executed.");
   }
}


class abdulswitch{
   public static void main(String[] args) {

      int week = 4;
      String day;
	        
      switch (week) {
         case 1:
           day = "Sunday";
           break;
         case 2:
           day = "Monday";
	   break;
         case 3:
           day = "Tuesday";
           break;
         case 4:
           day = "Wednesday";
           break;
         case 5:
           day = "Thursday";
           break;
         case 6:
           day = "Friday";
           break;
         case 7:
           day = "Saturday";
           break;
         default: 
           day = "Invalid day";
           break;
      }
      System.out.println(day);
   }
}


class abdulwhile{
    public static void main(String args[]){
         int i=10;
         while(i>1){
              System.out.println(i);
              i--;
         }
    }
}


class abduldowhile{
    public static void main(String args[]){
         int i=10;
         do{
              System.out.println(i);
              i--;
         }while(i>1);
    }
}


class ForLoopExample {
    public static void main(String args[]){
         for(int i=10; i>1; i--){
              System.out.println("The value of i is: "+i);
         }
    }
}
