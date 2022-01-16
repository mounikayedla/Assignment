package assignmentjava1;
abstract class Shape{
	abstract void draw();
}
class Line extends Shape{
	void draw() {
		System.out.println("Drawing Line");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
}
public class ShapesLineRectCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s1=new Line();
s1.draw();
Shape s2=new Rectangle();
s2.draw();
Shape s3=new Circle();
s3.draw();
	}

}
