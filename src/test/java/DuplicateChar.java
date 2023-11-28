
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
               String  sc= "prabhakar";
              char[] str=sc.toCharArray();
		
		for (int j=0; j<sc.length();j++) {
			//System.out.println(i[j]);
			for(int k=j+1; k<sc.length();k++) {
				//System.out.println(k);
				if(str[j] == str[k]) {
					System.out.println(str[j]);
				}
					
			}
		}

	}

}
