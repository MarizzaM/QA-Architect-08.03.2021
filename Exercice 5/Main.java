package com.app;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Teacher[] teachers = new Teacher[2];
        teachers[0] = new MathTeacher("Peter Scholze", 1,100);
        teachers[1] = new HistoryTeacher("Charles Harding Firth", 2, "bla-bla-bla");

        for(int i = 0; i < teachers.length; i++) {
            printTeachers(teachers[i]);
        }
    }

    private static void printTeachers(Teacher teacher)
    {
        if (teacher instanceof MathTeacher) {
            MathTeacher mathTeacher = (MathTeacher) teacher;
            System.out.println(mathTeacher);
        }
        else if (teacher instanceof HistoryTeacher) {
            HistoryTeacher historyTeacher = (HistoryTeacher) teacher;
            System.out.println(historyTeacher);
        }
        else
        {
            throw new ClassCastException("Unknown class");
        }
    }
}