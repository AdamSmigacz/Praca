package t_16;

import java.util.Arrays;

public class MultiDimensionalObjectArrays {

// przykad tablicy nier�wnej w kt�rej kazdy wiersz moze miec inny rozmiars
	public static void main(String[] args) {
	BerylliumSphere[][] spheres = {
			{new BerylliumSphere(),new BerylliumSphere()},
			{new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()},
			{new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()}
	};
	
	System.out.println(Arrays.deepToString(spheres));
	}

}
