package com.Array;

public class StudentMarksheet {
	
   public static void main(String[] args) {
	   String name[] = new String[5];
	    name[0] = "kalai." ;
	    name[1] = "vani." ;
	    name[2] = "sasi." ;
	    name[3] = "prathi." ;
	    name[4] = "nalini." ;
	  char ini[] = new char[5];
	       ini[0] = 'N';
	       ini[1] = 'K';
	       ini[2] = 'M' ;
	       ini[3] = 'S' ; 
	       ini[4] = 'T' ;
	 
	       String subject[] = new String[5];
	          subject[0] = "Tamil";
	          subject[1] = "english";
	          subject[2] = "Maths"	;
	          subject[3] = "biology";
	          subject[4] = "computer science";
	   int marks[] = new int[5];
	       marks[0] = 78 ;
	       marks[1] = 80 ;
	       marks[2] = 90 ;
	       marks[3] = 75 ;
	       marks[4] = 95 ;
	   double percent[] = new double[5];
	          percent[0] = 0.039;
	          percent[1] = 0.045;
	          percent[2] = 0.053;
	          percent[3] = 0.095;
	          percent[4] = 0.085;
	    for (int i = 0;  i < percent.length; i++) {
	    	System.out.println(name[i]);
	    	System.out.println("initial:" +ini[i]);
	    	System.out.println(subject[i]);
	    	System.out.println(marks[i]);
	    	System.out.println(percent[i]);
		
	}
	         
			   
	       
	  
	    		
}
}
