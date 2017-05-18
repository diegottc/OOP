package shapes;

public class ImRectangle {
	ImPoint origin;
	int width, height;
	
	public ImRectangle(int x, int y, int w, int h){
		this.origin = new ImPoint(x,y);
		this.width = w;
		this.height = h;
	}
	
	public ImRectangle(ImPoint p, int w, int h){
		this.origin = p;
		this.width = w;
		this.height = h;
	}
	
	public int area(){
		return this.width * this.height;
	}

	public void moveBy(int dx, int dy){
		this.origin = this.origin.moveBy(dx, dy);
	}
	
	public String toString(){
		return "["+this.origin.toString()+"/"+this.width+"*"+this.height+"]";
	}
}
