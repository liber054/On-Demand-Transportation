

public class TransportRequest {
	
	private Point origin;
	private Point dest;
	public TransportRequest(Point origin, Point dest) {
		this.origin = origin;
		this.dest = dest;
	}
	public TransportRequest(char c) { //creates random request
		if(c=='r'){ //r means random
			origin = new Point('r');
			dest = new Point('r');
		}
	}
	public double distanceOrigin(TransportRequest other){
		//distace from origin to another origin
		return origin.distance(other.origin);
	}
	
	public double distanceDest(TransportRequest other){
		//distace from destination to another destination
		return dest.distance(other.dest);
	}

}
