 class student{
	public void studentdetails(int roll, String name, String address, int mark){
		System.out.println(roll+" "+name+" "+address+" "+mark);
                
	}

	
	public int getTotalmark(int x, int y, int z){
		int total=x+y+z;
		return total;

	}
         public void table(int n){
         for (int i=1;i<=10;i++)
         System.out.println(n*i);
        }
        public void evenodd(int num){
         for (int i=0;i<num;i++)
         if(i%2==0){
           System.out.println(i+"number is even");
            }else
           System.out.println(i+"number is odd");
        }
        public void fibonacci(int num ){
         int a=0;
         int b=1;
	 int c=0;
	 System.out.println(a);
         System.out.println(b);
         for(int i=0;c<num;i++){
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	  }
        }
	public static void main(String [] args){
		student std=new student();
		int output=std.getTotalmark(50,60,70);
		//System.out.println(output);
		std.studentdetails(101,"nikhil","Bhainagar",output);
                  std.table(2);
                   std.table(3);
                   std.evenodd(50);
  		   std.fibonacci(5000);

	}
        
    
}