package module2;

public class SecondFrequentchar {

	public static void main(String[] args) {
		
		
		String str = "success";
		for(int i=0;i< str.length();i++) {
			int j= i + 1;
			if(str.charAt(i)== str.charAt(j) ) {
			System.out.println("The second most frequent char in the striknd is :" + str.charAt(j));
			break;
			}
		}

	}

}
