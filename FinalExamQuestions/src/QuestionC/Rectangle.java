package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) throws IllegalRectangle {
		super(newx,newy);
		if(newx < 0 | newy < 0){
			int x = newx;
			int y = newy;
			throw new IllegalRectangle(x,y);
		}

	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}
