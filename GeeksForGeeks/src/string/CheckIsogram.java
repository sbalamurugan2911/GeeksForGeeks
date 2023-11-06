package string;

public class CheckIsogram {

	public static void main(String[] args) {
		
		String s="welcom";
		boolean ans=true;
		
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					ans=false;
					break;
				}
			}
		}
		
		System.out.println(ans);
	}

}
