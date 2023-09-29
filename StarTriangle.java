package practice2;

public class StarTriangle {
	int starNum;
	public StarTriangle(){
		
	}
	public StarTriangle(int n) {
		this();
		starNum = n;
	}
	public String toString() {
		String star = "";
		
		for(int i = 0; i < starNum; i++) {
			for(int j = 0; j < starNum; j++) {
				if(i >= j) {
					star += "[*]";
				}
			}
			star +="\n";
		}
		
		return star;
			
	}
}
//package practice2;
//
//public class StarTriangle {
//	int starNum;
//	public StarTriangle(){
//		
//	}
//	public StarTriangle(int n) {
//		this();
//		starNum = n;
//	}
//	public String toString() {
//		String star = "[*]";
//		String[][] arr = new String[starNum][starNum];
//		for(int i = 0; i < starNum; i++) {
//			for(int j = 0; j < starNum; j++) {
//				if(i >= j) {
//					arr[i][j] = star;
//					System.out.print(star);
//				}
//			}
//			System.out.println("");
//		}
//		
//		return " ";
//			
//	}
//}
