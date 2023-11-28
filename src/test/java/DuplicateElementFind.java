import java.util.jar.Attributes.Name;

public class DuplicateElementFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[]= {1,2,3,4,2,3};
		
		for (int j=0; j<i.length;j++) {
			//System.out.println(i[j]);
			for(int k=j+1; k<i.length;k++) {
				//System.out.println(k);
				if(i[j]==i[k]) {
					System.out.println(i[k]);
				}
					
			}
		}

	}

}
