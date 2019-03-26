import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostEstimationTest {

	@Test
	void test() {
		CostEstimation test = new CostEstimation();
		int output = test.estimate("high standard",800);
		assertEquals(1440000,output);
	}

}
