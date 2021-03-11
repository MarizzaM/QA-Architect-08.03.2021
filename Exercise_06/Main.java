package com.app;

public class Main {

    public static void main(String[] args) {

        Teacher teacher_1 = new MathTeacher("Peter Scholze", 1,100);
        Teacher teacher_2 = new HistoryTeacher("Charles Harding Firth", 2, "bla-bla-bla");

        //No, because there is no "math_skills" member in the class Teacher

        Teacher [] teachers = new Teacher[] {teacher_1,teacher_2};

        for (int i = 0; i < teachers.length; i++){
            IdentifyTeacher(teachers[i]);
        }
    }

    private static void IdentifyTeacher (Teacher teacher)
    {
        if (teacher instanceof MathTeacher) {
            MathTeacher teacher_as_mathTeacher = (MathTeacher) teacher;
            System.out.println(teacher_as_mathTeacher.m_skills_math);
        }
        else if (teacher instanceof HistoryTeacher) {
            HistoryTeacher teacher_as_historyTeacher = (HistoryTeacher) teacher;
            System.out.println(teacher_as_historyTeacher.m_field_of_profession);
        }
        else
        {
            throw new ClassCastException("Unknown class");
        }
    }
}