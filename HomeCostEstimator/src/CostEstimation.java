
public class CostEstimation {
	public int estimate(String materialtype,int area) {
		if (materialtype == "standard") {
			return 1200 * area;
		}
		if(materialtype == "above standard") {
			return 1500 * area;
		}
		if(materialtype == "high standard") {
			return 1800 * area;
		}
		if(materialtype == "high standard and fully automated") {
			return 2500 * area;
		}
		return 0;
	}

}
