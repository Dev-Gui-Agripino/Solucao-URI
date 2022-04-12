public class Uri1096 {

	public static void main(String[] args) {
		
		int j= 7;
		int i = 1;
		
		do {
			int r = j;
			for(int x =0; x<3; x++) {
			System.out.println("I="+i+" J="+r);
			r-=1;
			}
			i+=2;
		} while(i <= 9);
	}

}