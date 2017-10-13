package com.trippng.image.filters;

import com.trippng.image.interfaces.FilterInterface;

/**
 * Grayscale filter to apply to the image.
 * @author Lui Crowie
 * @author James Jarrad
 */
public class GrayscaleFilter extends FilterInterface {
	
	public GrayscaleFilter() {
		setRed(0.299);
		setGreen(0.587);
		setBlue(0.114);
	}

}