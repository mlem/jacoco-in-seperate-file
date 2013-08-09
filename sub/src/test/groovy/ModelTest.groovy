import org.junit.Test

class ModelTest {

	@Test
	void addOneAndOne() {
		assert new Model().add(1,1) == 2
	}

}