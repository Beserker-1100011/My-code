package Com;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=82;
		int mm=2;
		
		if(marks>60) {
			System.out.println("First Division");
			mm=1;
		}
		else {
			if(marks>=45  && marks<60) {
				System.out.println("Second Division");
				mm=2;
			}
			else {
				if(marks>=33  && marks<45) {
					System.out.println("Third Division");
					mm=3;
				}
				else {
					System.out.println("Fail");
					mm=4;
				}
			}
		}
	}

}
