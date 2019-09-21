package test;

class A{
	private int v=0;
	A(int q){
		v=q;
	}
	public int getv() {return v;}
}

class B extends A{
     private float w=1f;
     B(int r,float d){
    	 super(r);
    	 w=d;
     }
     
}
public class z {

	public static void main(String[] args) {
		  B newObject=new B(4,3f);
		  
		  System.out.println(newObject.getv());
	}
}
