
package com.app;

public class Teacher {

    protected String m_name;
    protected int m_id_number;

    public Teacher(String m_name, int m_id_number) {
        this.m_name = m_name;
        this.m_id_number = m_id_number;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "m_name='" + m_name + '\'' +
                ", m_id_number=" + m_id_number +
                '}';
    }
}