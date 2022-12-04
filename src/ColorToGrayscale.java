package assignment_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ColorToGrayscale {
	public static void main(String[] args) throws IOException {
		// Open the photo.
		FileInputStream inputPhoto = new FileInputStream("colorImage.ppm");
		Scanner scanner = new Scanner(inputPhoto);
		
		// Open the new output photo image.
		FileOutputStream outputPhoto = new FileOutputStream("grayscaleImage.ppm");
		
		// Open the writer to write to the output photo.
		PrintWriter writer = new PrintWriter(outputPhoto);
		
		// Read the head of the input Photo.
		scanner.next(); // P3
		int pixelColumns = scanner.nextInt();
		int pixelRows = scanner.nextInt();
		scanner.nextInt(); // 255
		int totalPixels = pixelColumns * pixelRows * 3;
		
		// Write to the output photo.
		writer.printf("%s\n%d %d\n%d\n", "P3", pixelColumns, pixelRows, 255);
		 
		// Convert the input photo's colors to the output photo in gray scale.
		for (int i = 0; i < totalPixels && scanner.hasNextInt(); i++) {
			//System.out.println(i);
			int redX = scanner.nextInt();
			int greenY = scanner.nextInt();
			int blueZ = scanner.nextInt();
			
			// Converts the original RGB to gray scale.
			double grayScale = redX = greenY = blueZ =  (int) ((0.3 * redX) + (0.59 * greenY) + (0.11 * blueZ));
			int grayX = (int) grayScale;
			int grayY = (int) grayScale;
			int grayZ = (int) grayScale;
			
			
			
			// Writer color values to output photo.
			writer.println(grayX);
			writer.println(grayY);
			writer.println(grayZ);
			
				
		}
			//System.out.println(Arrays.toString(colors));
		// Close photos and scanners
		writer.close();
		outputPhoto.close();
		scanner.close();
		inputPhoto.close();
	}
}



