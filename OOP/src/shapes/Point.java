package shapes;

public class Point {
	private int x, y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/*
	public void moveBy(Point p){
		this.x += p.x;
		this.y += p.y;
	}
	*/
	
	public void moveBy(int dx, int dy){
		this.x += dx;
		this.y += dy;
	}
	
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
	
	public String show(){
		return "*";
	}
}
