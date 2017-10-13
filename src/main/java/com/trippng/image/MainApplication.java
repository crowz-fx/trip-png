package com.trippng.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.trippng.image.filters.GrayscaleFilter;

/**
 * Main entry point into the image processing framework.
 * @author Lui Crowie
 * @author James Jarrard
 */
public class MainApplication {

	public static void main(String[] args) throws IOException {
		String inputFile = args[1];
		String outputFileName = args[3];
		String outputFile = inputFile.substring(0, inputFile.lastIndexOf(File.separatorChar) + 1) + outputFileName;
		
		System.out.println(" INPUT_FILE = [" + inputFile + "]");
		
		BufferedImage image = ImageIO.read(new File(inputFile));
		BufferedImage newImage = new GrayscaleFilter().applyFilter(image);
		
		File output = new File(outputFile);
		ImageIO.write(newImage, outputFileName.split("\\.")[1], output);
		System.out.println("OUTPUT_FILE = [" + outputFile + "]");
	}

}