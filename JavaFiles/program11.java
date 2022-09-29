package JavaFiles;
public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Area and Peri of circle
		// Area of circle = pi.r.r
		double radius = 7.5;
		double periMtr = 2* Math.PI* radius;
		System.out.println("Perimeter : " + periMtr);
		double area = Math.PI* Math.pow(radius, 2);
		System.out.println("Area of a circle: "+ area);

	}

}
