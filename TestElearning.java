package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestElearning {

    @Test
    public void findcourse() {
        String Topic = "Selenium";
        int Expectedduration = 10;
        Elearning cs = new Elearning();
        int count = cs.getcourse(Topic);
        System.out.println(count);
        Assert.assertEquals(count, Expectedduration);
    }

    @Test
    public void findEmptyInput() {
        try {
            String Topic = "";
            Elearning cs = new Elearning();
            int count = cs.getcourse(Topic);
        } catch (NullPointerException e) {
            System.out.println("Topic name cannot be empty");
        }
    }
}


///////////////////////////////Elearning.java///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.app.TDD.demo;

import java.util.HashMap;
import java.util.Map;

public class Elearning {

    private Map<String, Integer> getcourse() {

        Map<String, Integer> getcourse = new HashMap<>();

        Map<String, Integer> course1 = new HashMap<>();
        course1.put("Selenium", 10);

        Map<String, Integer> course2 = new HashMap<>();
        course2.put("Junit", 25);

        Map<String, Integer> course3 = new HashMap<>();
        course3.put("Git", 2);

        getcourse.put("Selenium", 10);
        getcourse.put("Junit", 25);
        getcourse.put("Git", 2);

        return getcourse;
    }

    public int getcourse(String Topic) {

        Map<String, Integer> courseMap = null;
        int count = 0;

        if (Topic.isEmpty()) {
            throw new NullPointerException("Topic Name cannot be empty..");
        }

        courseMap = getcourse();

        if (!courseMap.containsKey(Topic)) {
            throw new NullPointerException("Topic Name does not exist");
        } else {
            count = courseMap.get(Topic);
        }

        return count;
    }
}
