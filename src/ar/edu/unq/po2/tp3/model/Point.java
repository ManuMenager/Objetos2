package ar.edu.unq.po2.tp3.model;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public void moverPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point sumarPoints(Point punto2) {
		int newX = getX() + punto2.getX();
		int newY = getY() + punto2.getY();
		Point newPoint = new Point(newX, newY);
		return newPoint;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

}