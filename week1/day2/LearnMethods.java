package week1.day2;

public class LearnMethods {
    int a=10;
	int b=20;

	public void add() {
		int c;
		c=a+b;
		System.out.println("Addtion of two values:" +c);
	}
	
	void addM(int v1, int v2, float f1) {
	 System.out.println(v1+v2+f1); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethods lm=new LearnMethods();
		lm.add();
		System.out.println(lm.a);
		lm.addM(10, 20, 10.8f);

	}
}
