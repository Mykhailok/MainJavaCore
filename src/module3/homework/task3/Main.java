package module3.homework.task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Course object1 = new Course(date,"Name1");
        Course object2 = new Course(date,"Name2");
        Course object3 = new Course(date,"Name3");
        Course object4 = new Course(date,"Name4");
        Course object5 = new Course(date,"Name5");
        Course[] array = {object1,object2,object3,object4,object5};
        CollegeStudent object6 = new CollegeStudent("First", "Last", 1);
        CollegeStudent object7 = new CollegeStudent("Last", array);



    }
}
