package method;

public class carExample {

	public static void main(String[] args) {
		
		car myCar = new car();
		
		myCar.Setgas(5); // Car의 setGas 메소드 호출
		
		boolean gasState= myCar.isLeftGs(); 
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGs()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입하세요.");
		}
		
	}
}
