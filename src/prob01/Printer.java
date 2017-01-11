package prob01;

public class Printer {
	
	private int num;
	private boolean bool;
	private double dou;
	private String name;
	
//	public void println(int num){
//		
//	}
//	
//	public void println(boolean bool){
//		
//	}
//	
//	public void println(double dou){
//		
//	}
//	
//	public void println(String name){
//		
//	}
	
	public int getNum() {
		return num;
	}
	public void println(int num) {
		this.num = num;
	}
	public boolean isBool() {
		return bool;
	}
	public void  println(boolean bool) {
		this.bool = bool;
	}
	public double getDou() {
		return dou;
	}
	public void  println(double dou) {
		this.dou = dou;
	}
	public String getName() {
		return name;
	}
	public void  println(String name) {
		this.name = name;
	}
	
	public void show(){
		System.out.println(num);
		System.out.println(bool);
		System.out.println(dou);
		System.out.println(name);
	}

}
