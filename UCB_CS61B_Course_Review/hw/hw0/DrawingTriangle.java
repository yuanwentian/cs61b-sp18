public class DrawingTriangle {
	public static void drawTriangle (int N){
		int row = 1;
		int col = 1;
		while (row <= N ) {
			while (col <= row) {
				System.out.print("*");
				col = col + 1;
			}
			System.out.println();
			row = row + 1;
			col = 1;
		}
	}
	public static void main (String[] args) {
		drawTriangle(10);
	}

}