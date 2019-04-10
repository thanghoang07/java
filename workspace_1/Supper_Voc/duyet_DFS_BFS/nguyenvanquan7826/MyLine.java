package nguyenvanquan7826;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

/**
 * ----------------- @author nguyenvanquan7826 -----------------
 * ---------------nguyenvanquan7826.wordpress.com --------------
 */
public class MyLine {

	private int indexP1;
	private int indexP2;
	private Color color[] = { Color.white, Color.blue };
	private Line2D.Double line;
	private int type = 0;
	private int order = 0;

	public MyLine(Point p1, Point p2, int indexP1, int indexP2) {
		line = new Line2D.Double(p1, p2);
		this.indexP1 = indexP1;
		this.indexP2 = indexP2;
	}

	public void draw(Graphics2D g) {
		g.setColor(color[type]);
		g.draw(line);
		if (order > 0) {
			String str = "(" + order + ")";
			g.drawString(str, (int) (Math.abs(line.x1 + line.x2) / 2),
					(int) (line.y1 + line.y2) / 2);
		}
	}

	public int getIndexP1() {
		return indexP1;
	}

	public void setIndexP1(int indexP1) {
		this.indexP1 = indexP1;
	}

	public int getIndexP2() {
		return indexP2;
	}

	public void setIndexP2(int indexP2) {
		this.indexP2 = indexP2;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
