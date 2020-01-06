package BaseMechanics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class drawText {
	public static void drawUnbounded(Graphics2D g, String s, int x, int y, font f) {
		int xpos = x;
		int ypos = y;
		char[] wnk = s.toCharArray();
		for(char w: wnk) {
			if(w == ' ') {
				xpos += f.yes[0].img.getWidth();
			}
			for(textChar c: f.yes) {
				if(c.associate==w) {
					g.drawImage(c.img, xpos, ypos, xpos+c.img.getWidth(), ypos+c.img.getHeight(), 0, 0, c.img.getWidth(), c.img.getHeight(), null);
					xpos+=c.img.getWidth();
				}
			}
		}
		
	}
	
	public static void drawInBoundedBox(Graphics2D g, String s, int x1, int y1, int x2, int y2, font f) {
		int xpos = x1;
		int ypos = y1;
		char[] wnk = s.toCharArray();
		for(char w: wnk) {
			if(w == ' ') {
				xpos += f.yes[0].img.getWidth();
			}
			for(textChar c: f.yes) {
				if(c.associate==w&&xpos <= x2-c.img.getWidth()&&ypos <= y2-c.img.getHeight()) {
					g.drawImage(c.img, xpos, ypos, xpos+c.img.getWidth(), ypos+c.img.getHeight(), 0, 0, c.img.getWidth(), c.img.getHeight(), null);
					xpos+=c.img.getWidth();
				}else if(c.associate==w&&ypos <= y2-c.img.getHeight()){
					xpos = x1;
					ypos += c.img.getHeight();
					g.drawImage(c.img, xpos, ypos, xpos+c.img.getWidth(), ypos+c.img.getHeight(), 0, 0, c.img.getWidth(), c.img.getHeight(), null);
					xpos+=c.img.getWidth();
				}
			}
		}
	}
	public static abstract class font {
		public String name;
		public textChar[] yes;
	}
	public static class textChar {
		public textChar(BufferedImage i, char a){
			img = i;
			associate = a;
		}
		public BufferedImage img;
		public char associate;
	}
}
