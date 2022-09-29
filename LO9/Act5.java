package LO9;
import java.util.*;
public class Act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][][] image = new int [100][100][3];
	Random random = new Random();
	for (int i = 0; i<image.length; i++) {
		for (int j =0; j<image[0].length;j++) {
			image [i][j][0]=random.nextInt(256);
					image [i][j][1]=random.nextInt(256);
							image [i][j][2]=random.nextInt(256);
			
		}
	}
	ImageBuilder imageBuilder = new ImageBuilder(image,10);
	imageBuilder.show();
	}

}
