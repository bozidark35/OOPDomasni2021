package com.company;
import java.util.Scanner;

class Brojach {
    private int brojach;

    Brojach() {
        this.brojach = 0;
    }

    void resetirajBrojach() {
        this.brojach = 0;
    }

    void zgolemiBrojach() {
        this.brojach += 1;
    }

    void zgolemiBrojach(int pati) {
        this.brojach += pati;
    }

    int vrednost() {
        return brojach;
    }
}

public class Main {
    public static void main(String[] args) {
        Brojach glava = new Brojach();
        Brojach pismo = new Brojach();

        Scanner keyboard = new Scanner(System.in);

        while(true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Pismo - " + pismo.vrednost());
            System.out.println("Glava - " + glava.vrednost());
            System.out.println("");
            System.out.println("1 - Frlaj paricka");
            System.out.println("2 - Resetiraj brojac na pismo");
            System.out.println("3 - Resetiraj brojac na glava");
            System.out.println("4 - Zgolemi brojac na pismo");
            System.out.println("5 - Zgolemi brojac na glava");
            System.out.println("0 - Izlezi");

            int izbor = keyboard.nextInt();

            if(izbor == 1) {
                while(true) {
                    System.out.println("Glava - " + glava.vrednost());
                    System.out.println("Pismo - " + pismo.vrednost());
                    System.out.println("Vnesi 1 za da frlis, 0 za da prestanis so frlanje");
                    int frli = keyboard.nextInt();
                    if(frli != 0) {
                        if(Math.random() < 0.5) {
                            glava.zgolemiBrojach();
                        }
                        else {
                            pismo.zgolemiBrojach();
                        }
                    }
                    else {
                        break;
                    }
                }
            }
            else if(izbor == 2) {
                pismo.resetirajBrojach();
            }
            else if(izbor == 3) {
                glava.resetirajBrojach();
            }
            else if(izbor == 4) {
                System.out.print("Pati: ");
                int pati = keyboard.nextInt();
                pismo.zgolemiBrojach(pati);
            }
            else if(izbor == 5) {
                System.out.print("Pati: ");
                int pati = keyboard.nextInt();
                glava.zgolemiBrojach(pati);
            }
            else if(izbor == 0)
                break;
        }
    }
}
