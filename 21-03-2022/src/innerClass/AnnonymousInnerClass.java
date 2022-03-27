package innerClass;

interface MyInt{
	 void add();
	 void sub();
	}

	public class AnnonymousInnerClass {

	 public static void main(String[] args) {
	  //local inner anonymous class
	  MyInt ob=new MyInt() {

	   @Override
	   public void add() {
	    System.out.println("Add");
	    
	   }

	   @Override
	   public void sub() {
	    System.out.println("Sub");
	    
	   }
	   
	  };
	  ob.add();
	  ob.sub();
	  

	 }

	}



