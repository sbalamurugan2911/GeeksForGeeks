package string;

import java.util.ArrayList;

public class ReverseWordString {

	public static void main(String[] args) {
		String s="hi.welcome.all.everyone";
		s+=".";
		String s1="";
		int index=0,k=0;
		
		ArrayList al=new ArrayList();
		
		
		
		for(int j=0;j<s.length();j++) {
			
			
			if(s.charAt(j)=='.') {
				 String sub=s.substring(index, j);
				 
				 
				al.add(sub);
				 k++;
				 index=j+1;
			}
		}
		for(int x=al.size()-1;x>=0;x--) {
			
			if(x==0) {
				s1+=(al.get(x));
			}else {
				s1+=(al.get(x)+".");
			}
		}
			System.out.println(s1);
		}

	}


