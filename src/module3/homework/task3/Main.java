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
        CollegeStudent object8 = new CollegeStudent("FirstN", "LastN", 4, "MAUP", 90, 3333333);
        SpecialStudent object9 = new SpecialStudent("First" , "Last", 2);
        SpecialStudent object10 = new SpecialStudent("FirstN", "LastN", 3, "KPI", 99, 1223);
        SpecialStudent object11 = new SpecialStudent("First", "Last", 6, 666);
        Student object12 = new Student("First", "Last", 5);
        Student object13 = new Student("Last", array);



    }
}
