package loops;

public class forarray{
	public static void main(String[] args) {
xx:
	for (int i=1;i<=3;i++){
		yy:
			for(int j=1;j<=3;j++){
				if(i==2 && j==2){
					break yy;
				}
				System.out.println(i+ "  "+ j );
			}
	}
}}




