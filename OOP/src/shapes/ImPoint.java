package shapes;

public class ImPoint {
	final int x, y;
	
	public ImPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public ImPoint moveBy(int dx, int dy){
		return new ImPoint(this.x + dx, this.y + dy);
	}
	
	public String toString(){
		return "("+this.x+","+this.y+")";
	}

}
