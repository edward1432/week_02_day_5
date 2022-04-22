import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void livesInLondon(){
        // given - a student who lives in London
        Student student = new Student("test student", 25, "London", "Glasgow");
        // when - we call the livesInLondon method
        boolean result = student.livesInLondon();
        // then - it should return true
        assertTrue(result);
    }

    @Test
    void livesInLondon_false(){
        // Given - student who doesn't live in London
        Student student = new Student("test2", 21, "Cardiff", "Queen's");
        // When - we call the livesInLondon method
        boolean result = student.livesInLondon();
        // Then - it should return false
        assertFalse(result);
    }

}