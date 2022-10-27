
public class Question1 {

	public static void main(String[] args) {
		int n=10;
		
		//LETTER I
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==n/2)
					System.out.print("# ");
				else
					System.out.print("  ");
			}			 	
		System.out.print("   ");
		
		//LETTER N
		
				for(int j=0;j<n;j++) {
					if(j==0||j==n-1||i==j)
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				System.out.print("   ");
		
		
		//LETTER E
		
				for(int j=0;j<n;j++) {
					if(i==0||j==0||i==n-1||i==(n-1)/2)
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				System.out.print("   ");
		
		
		//LETTER U
		
				for(int j=0;j<n;j++) {
					if((j==0&&i!=n-1)||(j==n-1&&i!=n-1)||i==n-1)
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				System.out.print("   ");
		
		
	
		//LETTER R
				
			for(int j=0;j<n;j++) {
							if((j==0|| i-j==(n-1)/2)||
									i<=n/2&&j==n/2||i==0&&j<n/2||i==n/2&&j<n/2)
								System.out.print("# ");
							else
								System.out.print("  ");
						}
						
				
				System.out.print("   ");
		//LETTER o
		
				for(int j=0;j<n;j++) {
					if(i==0||j==0||i==n-1||j==(n-1))
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				System.out.print("   ");
		
		
		//LETTER N

				for(int j=0;j<n;j++) {
					if(j==0||j==(n-1)||i==j)
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				System.out.println();
		}
		
				
	}
}


