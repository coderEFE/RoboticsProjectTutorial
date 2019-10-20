/* this is  a simplified code of the EquilateralTriangle 
 * for details go to that one
 * */

public class triangle {
	
	public static final double a = .05; //the smaller this number goes, the more persize the triangle can be, but don't set it too small, the complier will hate you  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (double y = Math.sqrt(3); y > 0; y -= a) {
			//left line
			space(0,y/Math.sqrt(3));
			System.out.print("o");
			//right line
			space(0,-2*(y-Math.sqrt(3))/Math.sqrt(3));
			System.out.println("o");
		}
		//bottom line
		for (double i = 0 ; i <= 2+2*a; i += a) {
			System.out.print(" o");
		}	
	}
	public static void space(double x, double y){
		for (double i = x; i <= y; i += a) {
			System.out.print("  ");
		}
	}
}
