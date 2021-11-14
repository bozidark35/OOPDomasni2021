package com.company;

class PC{

    public int memorija;
    public String tipNaMemorija;
    public int hardDisk;
    public String golemina;
    public String disk;


    PC() {
        this.memorija = 2;
        this.tipNaMemorija = "DDR4";
        this.hardDisk = 160;
        this.disk = "HDD";
    }

    void nadogradi(int zgolemiMemorija, String novSSDDisk) {
        int predhodnoMemorija = this.memorija;
        this.memorija += zgolemiMemorija;
        String predhodenDisk = this.disk;
        this.disk = novSSDDisk;
        System.out.println("Memorijata bese " + predhodnoMemorija + "GB, sega iznesuva " + this.memorija + "GB.\n" +
                "Tipot na memorijata e " + this.tipNaMemorija + ".\n" +
                "Noviot disk e SSD m.2 ima golemina od " + this.disk + ". Prethodno imave HDD i iznesuvase " + this.hardDisk + "GB");
    }
}


public class Main {
    public static void main(String[] args) {

        PC kompjuter = new PC();

        kompjuter.nadogradi(2, "256GB");

    }
}