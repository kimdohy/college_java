package day_9_9; 

public class GoodCalc extends Calculator{
	@Override		// 상속받은 것임을 나타낸다. 쓰면 좋다 에러검출이 용이하다.
	public int add(int a, int b) { //추상 메소드 구현
		return a+b;
	}
	@Override
	public int subtract(int a, int b) {  //추상 메소드 구현
		return a-b;
	}
	@Override
	public double average(int[] a) {  //추상 메소드 구현
		double sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {2, 3, 4}));
	}

}
abstract class Calculator{					//추상 클래스 생성
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int [] a);
}
