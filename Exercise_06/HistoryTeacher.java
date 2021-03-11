package com.app;

public class HistoryTeacher extends Teacher{

    protected String m_field_of_profession;

    public HistoryTeacher(String m_name, int m_id_number, String m_field_of_profession) {
        super(m_name, m_id_number);
        this.m_field_of_profession = m_field_of_profession;
    }

    @Override
    public String toString() {
        return "HistoryTeacher{" +
                "m_field_of_profession='" + m_field_of_profession + '\'' +
                "} " + super.toString();
    }
}