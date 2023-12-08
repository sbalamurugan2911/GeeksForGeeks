package array;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		CheckAnagram c=new CheckAnagram();
		System.out.println(c.checkAnagram("geeksforgeeks","forgeeksgeeks"));
	}
		public boolean checkAnagram(String a,String b) {
		//String a="geeksforgeeks",b="forgeeksgeeks";
		char c1[]=a.toCharArray();
        char c2[]=b.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(c1.length==c2.length) {
        	for(int i=0;i<c1.length;i++) {
        		if(c1[i]!=c2[i]) {
        			return false;
        		}
        	}
        	return true;
        }
        return false;

	}

}
