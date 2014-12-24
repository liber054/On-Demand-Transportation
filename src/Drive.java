import java.util.ArrayList;


public class Drive {
	// class represents requests that a driver should take
	public static final int VECHILE_SIZE = 5;
	ArrayList<TransportRequest> requests;
	
	public Drive(){
		requests = randomTransportRequests(VECHILE_SIZE);
	}
	
	public DistancesMatrix originDistanceMatrix(){
		DistancesMatrix dm = new DistancesMatrix(requests.size());
		for (int i = 0; i < requests.size(); i++) {
			for (int j = i+1; j < requests.size(); j++) {
				double distance = requests.get(i).distanceOrigin(requests.get(j));
				dm.setDistance(i, j, distance);
			}
		}
		return dm;
	}
	public static ArrayList<TransportRequest> randomTransportRequests(int num){
		ArrayList<TransportRequest> arr = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			arr.add(new TransportRequest('r'));
		}
		return arr;
	}
}
