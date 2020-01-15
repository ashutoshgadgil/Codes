package MyProgrammes;

public class MultiDimArray {

	public static void main(String[] args) {
		int matrix1[][]=new int[3][3];               // Declaration
		
		int matrix2[][]= {{1,2,3},{4,5,6},{7,8,9}};  //  Declaration & initialization
		
		matrix1[0][0]=10;                            // Initialization
		matrix1[0][1]=20;
		matrix1[0][2]=30;
		
		matrix1[1][0]=40;
		matrix1[1][1]=50;
		matrix1[1][2]=60;
		
		matrix1[2][0]=70;
		matrix1[2][1]=80;
		matrix1[2][2]=90;
		
		for(int i=0;i<3;i++)
		{
			System.out.println();
			
			for(int j=0;j<3;j++)
			{
				System .out .printf("[%d][%d] =  ",i,j);
				
				System.out.print("  "+matrix1[i][j]+" ");
				System.out.print("|");
				System.out.print("    ");
			}
			
			System.out.println();
			System.out.print("---------------------------------------------------------");
		}
		
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
