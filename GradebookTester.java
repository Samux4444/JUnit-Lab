import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradebookTester {

	private GradeBook g1;
    private GradeBook g2;
	
    /**
     * Sets up the environment for each test case.
     * Two GradeBook instances are created with a capacity of 5, 
     * and a few scores are added to them.
     */
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g1.addScore(90);

		g2 = new GradeBook(5);
		g2.addScore(80);
		g2.addScore(60);
	}

	/**
	 * Tears down the environment for each test case.
	 * The two GradeBook instances are set to null.
	 */
	
	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	/**
	 * Tests the addScore method of the GradeBook class.
	 * Checks whether the added scores correctly appear in the score array
	 * and whether the scoreSize is updated properly.
	 */
	
	 @Test
	    public void AddScore() {
	        assertEquals("50.0 75.0 90.0", g1.toString());
	        assertEquals(3, g1.getScoreSize());

	        assertEquals("80.0 60.0", g2.toString());
	        assertEquals(2, g2.getScoreSize());
	    }

	 /**
	  * Tests the sum method of the GradeBook class.
	  * Compares the returned sum of scores with the expected sum.
	  */
	 
	    @Test
	    public void Sum() {
	        assertEquals(215.0, g1.sum());
	        assertEquals(140.0, g2.sum());
	    }

	    /**
	     * Tests the minimum method of the GradeBook class.
	     * Compares the returned minimum score with the expected minimum score.
	     */
	    
	    @Test
	    public void Minimum() {
	        assertEquals(50.0, g1.minimum());
	        assertEquals(60.0, g2.minimum());
	    }

	    /**
	     * Tests the finalScore method of the GradeBook class.
	     * Compares the returned final score with the expected final score,
	     * which is the sum of all scores minus the lowest one.
	     */
	    
	    @Test
	    public void FinalScore() {
	        assertEquals(215.0 - 50.0, g1.finalScore());
	        assertEquals(140.0 - 60.0, g2.finalScore());
	    }

}
