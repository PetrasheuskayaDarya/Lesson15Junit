package by.htp.fortune.teller;

public class Realisation implements Predictor {

	@Override
	public String predict(String type) {
	
		String result = null;

	switch (type) {
	case "love":
		result ="yes";
		break;
	case "money":
		result ="yes";
		break;
	case "home":
		result ="yes";
		break;
//	default:
//		throw new WrongPrediction();
	}
	return result;
	
	
	
	
	
	
}
}
