import java.util.Random;


/*
 *���� ����!!������� ������� ��� ������ ���� ����� ������ �����
 *��� ���� ��� ���� ����� ������ �� ������ �����
 *����� ��� ����� 17.12 ����� 
 * 
 */


public class Point {
	private int x;
	private int y;
	
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public Point(char c){// creates random point
		if(c == 'r'){//r means random
			Random rand = new Random();
			x = rand.nextInt(100);
			y = rand.nextInt(100);
		}
	}
	public Point(Point p){
		x = p.x;
		y = p.y;
	}
	
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y; 
	}
	
	public double distance(Point p){
		double power = Math.pow(x - p.x, 2) + Math.pow(y - p.y,2);
		double d = Math.sqrt(power);
		return d;
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	

}
