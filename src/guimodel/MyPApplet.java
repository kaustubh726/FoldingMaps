package guimodel;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {
	PImage pimage;
	
	public void setup() {
		size(400, 400);
		background(255);
		stroke(0);
		pimage = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
		pimage.resize(0, height);
		image(pimage, 0, 0);		
	}
	
	public void draw() {
		int[] color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/4, height/5);
	}
	
	public int[] sunColorSec(float seconds) {
		int[] rgb = new int[3];
		float diffFrom30 = Math.abs(30 - seconds);
		float ratio = diffFrom30 / 30;		
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[0] = 0;
		
		return rgb;
	}
	
	public static void main(String[] args) {
		MyPApplet myPApplet = new MyPApplet();
	}

}