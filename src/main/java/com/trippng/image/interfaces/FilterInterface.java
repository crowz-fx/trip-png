package com.trippng.image.interfaces;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * Interface for all filters to use and contain generic functions
 * and methods.
 * @author Lui Crowie
 * @author James Jarrard
 */
public abstract class FilterInterface {
	
	private double RED_MULTIPLIER = 0;
	private double GREEN_MULTIPLIER = 0;
	private double BLUE_MULTIPLIER = 0;
	
	public BufferedImage applyFilter(BufferedImage image) {
		int h = image.getHeight();
		int w = image.getWidth();
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				Color c = new Color(image.getRGB(j, i));
				int red, green, blue, total;
				red = (int) (c.getRed() * RED_MULTIPLIER);
				green = (int) (c.getGreen() * GREEN_MULTIPLIER);
				blue = (int) (c.getBlue() * BLUE_MULTIPLIER);
				total = red + blue + green;
				
				image.setRGB(j, i, new Color(total, total, total).getRGB());
			}
		}
		
		return image;
	}
	
	protected void setRed(double red) {
		this.RED_MULTIPLIER = red;
	}
	
	protected void setGreen(double green) {
		this.GREEN_MULTIPLIER = green;
	}
	
	protected void setBlue(double blue) {
		this.BLUE_MULTIPLIER = blue;
	}
	
}