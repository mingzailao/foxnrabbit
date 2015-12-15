package cell;

import java.awt.Graphics;
//interface 是一种特殊的class
public interface Cell {
	void draw(Graphics g, int x, int y, int size);
}
