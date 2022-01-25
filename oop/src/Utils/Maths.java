package Utils;

public class Maths {
	public static int generateRandom(int a, int b) {
		int result=1;
		if(a<b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		result=(int)(Math.floor(Math.random()*(b-a+1))+a);
		return result;
	}
}
