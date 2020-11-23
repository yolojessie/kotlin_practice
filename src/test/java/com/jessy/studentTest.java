package com.jessy;

import com.jessy.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class studentTest {
    @Test
    public void highestScoreTest() {
        Student student = new Student("Jessy", 60, 80);
        Assertions.assertEquals(80, student.highest());
    }

    @Test
    public void averageTest() {
        Student student = new Student("Jessy", 60, 80);
        Assertions.assertEquals((60+80)/2, student.getAverage());
    }
}
