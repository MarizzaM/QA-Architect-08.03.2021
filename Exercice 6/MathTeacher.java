package com.app;

public class MathTeacher extends Teacher{

    protected int m_skills_math;

    public MathTeacher(String m_name, int m_id_number, int m_skills_math) {
        super(m_name, m_id_number);
        this.m_skills_math = m_skills_math;
    }

    @Override
    public String toString() {
        return "MathTeacher{" +
                "m_skills_math=" + m_skills_math +
                "} " + super.toString();
    }
}
