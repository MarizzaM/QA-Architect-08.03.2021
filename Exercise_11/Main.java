package com.app;

public class Main {

    public static void main(String[] args) {

        ElectricDevice electricDevice_1 = new TV(220, 36);
        ElectricDevice electricDevice_2 = new Cellphone(5,"Samsung");

        ElectricDevice [] electricDevices = new ElectricDevice[] {electricDevice_1,electricDevice_2};

        for (int i = 0; i < electricDevices.length; i++){
            RepairElecticDevice(electricDevices[i]);
        }
    }

    static void RepairElecticDevice(ElectricDevice ed){
        if(ed.m_works_on_batteries == true){
            ed.insertNewBatteries();
        }
        if (ed.m_is_faulty == false){
            return;
        }
        ed.fixDevice();
        if (ed instanceof TV) {
            TV ed_as_TV = (TV) ed;
            System.out.println(ed_as_TV.m_size_screen);
        }
        else if (ed instanceof Cellphone) {
            Cellphone ed_as_Cellphone = (Cellphone) ed;
            System.out.println(ed_as_Cellphone.brand);
        }
        else
        {
            throw new ClassCastException("Unknown class");
        }
        System.out.println("Fixing is done");
    }
}