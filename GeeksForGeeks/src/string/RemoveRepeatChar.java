package string;

public class RemoveRepeatChar {
	
	public String removeDublicate(String S,int n) {
		//String S = "agsaysja";
		char[] c = S.toCharArray();
		//int n = 8;
		String S1 = "";
		for (int i = 0; i < n; i++) {

			int j;

			for (j = 0; j < i; j++) {

				if (c[i] == c[j]) {
					break;
				}
			}

			if (i == j) {
				
				S1 += c[i];
			}
		}

		return S1;
		
	}

	public static void main(String[] args) {
		
		RemoveRepeatChar r=new RemoveRepeatChar();
		System.out.println(r.removeDublicate("bala",4));
	}
}
