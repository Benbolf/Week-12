import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy

import com.promineotech package;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest ;

class TestDemoJUnitTest {

	private TestDemo testDemo;
	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	void assertThatTwoPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);

		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
		
		int a = 0;
		int b = 0;
		int expected = 0;
		boolean expectException = false;
		
		
		if(!expectException) {

			  assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
              testDemo.addPositive(a, b);
              assertThatThrownBy(() ->

              testDemo.addPositive(a, b))

                  .isInstanceOf(IllegalArgumentException.class);
              
              
              assertThatThrownBy(() ->

              testDemo.addPositive(a, b))

                  .isInstanceOf(IllegalArgumentException.class);}
		}
              static method argumentsForAddPositive;
	
	}

	
	@PsrameterizedTest 
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	doReturn(5).when(mockDemo).getRandomInt();
	
	
	int fiveSquared = mockDemo.randomNumberSquared();
	assertThat(fiveSquared).isEqualTo(25);{
		
		return;
		  
	
	
	
}
