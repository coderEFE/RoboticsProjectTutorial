
/* 
 * this code will make equilateral triangles
 * these triangles are made from two 30 60 90 degrees triangles
 * which the ratio between the three sides are 1 : sqareroot3 : 2
 * so if we want to individually graph the three sides of 30 60 90 triangles on a x-y coordinate plane, the equations would be:
 * y = sqrt3 * x (the left line)
 * y = -sqrt3 * x + sqrt3 (the right line)
 * and a bottom line
 * 
 * so y is like how many lines we should produce and 
 * the x is like how many spaces should we print before we print the "o"
 * what we have to do is to set for loops that let Java know
 * when each y value is given, how much spaces should there be
 * and it can be done algebraically which is solve for x in the previous equations, so 
 *  x = y / sqrt3 (left line), and
 *  x = -1*(y- sqrt3)/sqrt3
 *  and with every thing put in order, triangles are done
 *  
 *  */

public class EquilateralTriangle1 {
public static final double a = .05; //the smaller this number goes, the more persize the triangle can be, but don't set it too small, the complier will hate you  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y;
		for ( y = Math.sqrt(3); y > 0; y -= a) {
			//left line
			for (double x = y/Math.sqrt(3); x > 0; x -= a) {
				space();
			}
			System.out.print("o");
			//right line notice in the for loop second condition, the spaces needs to be doubled since that there are just empty spaces after the first line
			for (double x = 0 ; x < -2*(y-Math.sqrt(3))/Math.sqrt(3); x += a) {
				space();
			}

			System.out.println("o");
		}
		//bottom line
		for (double i = 0 ; i <= 2+2*a; i += a) {
			System.out.print(" o");
		}	
	}
	public static void space(){
			System.out.print("  ");
			/*the spaces are doubled because the height difference between each line is more like a two spaces
			 * so this way our scale can be correct and not horizontally dilated by 2*/
		
	}
}
