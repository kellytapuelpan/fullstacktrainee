package hashmatique;
import java.util.*;

public class Hashmatique {
	public void hashmatiqueList() {
		HashMap<String, String> trackList = new HashMap<String, String>(); 

		trackList.put("Track 01", "Never Let me Down Again");
		trackList.put("Track 02", "Behind the Wheel");
		trackList.put("Track 03", "Strangelove");
		trackList.put("Track 04", "Nothing");
		trackList.put("Track 05", "Sacred");
		trackList.put("Track 06", "The Things You Said"); 
        
        String output = trackList.get("Track 03");
        System.out.println("Song: "+ output);

        Iterator trackIterator = trackList.entrySet().iterator(); 

	    while (trackIterator.hasNext()) { 
	        Map.Entry mapElement = (Map.Entry)trackIterator.next(); 
	        String tracks = ((String)mapElement.getValue());
	        System.out.println(mapElement.getKey() + " : " + tracks);
	    }
	    
	    SortedSet<String> valSet = new TreeSet<>(trackList.values());
	    System.out.println(valSet);
	}
}