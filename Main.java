package ligaEquipos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos los Jugadores

        Jugador[] jugadores_e1 = new Jugador[11];
        jugadores_e1[0] = new Jugador("Pepito1", 1, 1, 0, 5);
        jugadores_e1[1] = new Jugador("Pepito2", 2, 2, 1, 2);
        jugadores_e1[2] = new Jugador("Pepito3", 3, 0, 0, 5);
        jugadores_e1[3] = new Jugador("Pepito4", 4, 0, 2, 7);
        jugadores_e1[4] = new Jugador("Pepito5", 5, 0, 0, 3);
        jugadores_e1[5] = new Jugador("Pepito6", 6, 3, 1, 6);
        jugadores_e1[6] = new Jugador("Pepito7", 7, 10, 1, 5);
        jugadores_e1[7] = new Jugador("Pepito8", 8, 15, 0, 6);
        jugadores_e1[8] = new Jugador("Pepito9", 9, 16, 1, 4);
        jugadores_e1[9] = new Jugador("Pepito10", 10, 20, 0, 6);
        jugadores_e1[10] = new Jugador("Pepito11", 11, 7, 2, 5);


        Jugador[] jugadores_e2 = new Jugador[11];
        jugadores_e2[0] = new Jugador("Juanito1", 1, 1, 0, 5);
        jugadores_e2[1] = new Jugador("Juanito2", 2, 2, 1, 2);
        jugadores_e2[2] = new Jugador("Juanito2", 3, 0, 0, 5);
        jugadores_e2[3] = new Jugador("Juanito3", 4, 0, 2, 8);
        jugadores_e2[4] = new Jugador("Juanito4", 5, 0, 0, 3);
        jugadores_e2[5] = new Jugador("Juanito5", 6, 3, 4, 6);
        jugadores_e2[6] = new Jugador("Juanito6", 7, 10, 1, 5);
        jugadores_e2[7] = new Jugador("Juanito7", 8, 15, 0, 6);
        jugadores_e2[8] = new Jugador("Juanito8", 9, 16, 1, 4);
        jugadores_e2[9] = new Jugador("Juanito9", 10, 25, 0, 6);
        jugadores_e2[10] = new Jugador("Juanito10", 11, 7, 2, 5);

        Jugador[] jugadores_e3 = new Jugador[11];
        jugadores_e3[0] = new Jugador("Pablo1", 1, 1, 0, 5);
        jugadores_e3[1] = new Jugador("Pablo2", 2, 2, 1, 2);
        jugadores_e3[2] = new Jugador("Pablo3", 3, 1, 0, 5);
        jugadores_e3[3] = new Jugador("Pablo4", 4, 0, 2, 5);
        jugadores_e3[4] = new Jugador("Pablo5", 5, 0, 0, 3);
        jugadores_e3[5] = new Jugador("Pablo6", 6, 3, 6, 6);
        jugadores_e3[6] = new Jugador("Pablo7", 7, 10, 1, 5);
        jugadores_e3[7] = new Jugador("Pablo8", 8, 15, 0, 6);
        jugadores_e3[8] = new Jugador("Pablo9", 9, 16, 1, 4);
        jugadores_e3[9] = new Jugador("Pablo10", 10, 27, 0, 6);
        jugadores_e3[10] = new Jugador("Pablo11", 11, 7, 2, 5);

        Jugador[] jugadores_e4 = new Jugador[11];
        jugadores_e4[0] = new Jugador("Guille1", 1, 1, 0, 5);
        jugadores_e4[1] = new Jugador("Guille2", 2, 2, 1, 2);
        jugadores_e4[2] = new Jugador("Guille3", 3, 0, 0, 5);
        jugadores_e4[3] = new Jugador("Guille4", 4, 2, 2, 5);
        jugadores_e4[4] = new Jugador("Guille5", 5, 0, 0, 3);
        jugadores_e4[5] = new Jugador("Guille6", 6, 3, 6, 6);
        jugadores_e4[6] = new Jugador("Guille7", 7, 10, 1, 5);
        jugadores_e4[7] = new Jugador("Guille8", 8, 15, 0, 6);
        jugadores_e4[8] = new Jugador("Guille9", 9, 16, 1, 4);
        jugadores_e4[9] = new Jugador("Guille10", 10, 27, 0, 6);
        jugadores_e4[10] = new Jugador("Guille11", 11, 7, 2, 5);

        Jugador[] jugadores_e5 = new Jugador[11];
        jugadores_e5[0] = new Jugador("Jorge1", 1, 1, 0, 5);
        jugadores_e5[1] = new Jugador("Jorge2", 2, 2, 1, 2);
        jugadores_e5[2] = new Jugador("Jorge3", 3, 0, 0, 5);
        jugadores_e5[3] = new Jugador("Jorge4", 4, 0, 2, 5);
        jugadores_e5[4] = new Jugador("Jorge5", 5, 3, 0, 3);
        jugadores_e5[5] = new Jugador("Jorge6", 6, 3, 6, 6);
        jugadores_e5[6] = new Jugador("Jorge7", 7, 10, 1, 5);
        jugadores_e5[7] = new Jugador("Jorge8", 8, 15, 0, 6);
        jugadores_e5[8] = new Jugador("Jorge9", 9, 16, 1, 4);
        jugadores_e5[9] = new Jugador("Jorge10", 10, 27, 0, 6);
        jugadores_e5[10] = new Jugador("Jorge11", 11, 7, 2, 5);

        Jugador[] jugadores_e6 = new Jugador[11];
        jugadores_e6[0] = new Jugador("Jose1", 1, 1, 0, 5);
        jugadores_e6[1] = new Jugador("Jose2", 2, 2, 1, 2);
        jugadores_e6[2] = new Jugador("Jose3", 3, 0, 0, 5);
        jugadores_e6[3] = new Jugador("Jose4", 4, 4, 2, 5);
        jugadores_e6[4] = new Jugador("Jose5", 5, 0, 0, 3);
        jugadores_e6[5] = new Jugador("Jose6", 6, 3, 6, 6);
        jugadores_e6[6] = new Jugador("Jose7", 7, 10, 1, 5);
        jugadores_e6[7] = new Jugador("Jose8", 8, 15, 0, 6);
        jugadores_e6[8] = new Jugador("Jose9", 9, 16, 1, 4);
        jugadores_e6[9] = new Jugador("Jose10", 10, 27, 0, 6);
        jugadores_e6[10] = new Jugador("Jose11", 11, 7, 2, 5);

        Jugador[] jugadores_e7 = new Jugador[11];
        jugadores_e7[0] = new Jugador("Carlos1", 1, 1, 0, 5);
        jugadores_e7[1] = new Jugador("Carlos2", 2, 2, 1, 2);
        jugadores_e7[2] = new Jugador("Carlos3", 3, 0, 0, 5);
        jugadores_e7[3] = new Jugador("Carlos4", 4, 5, 2, 5);
        jugadores_e7[4] = new Jugador("Carlos5", 5, 8, 0, 3);
        jugadores_e7[5] = new Jugador("Carlos6", 6, 3, 6, 6);
        jugadores_e7[6] = new Jugador("Carlos7", 7, 10, 1, 5);
        jugadores_e7[7] = new Jugador("Carlos8", 8, 15, 0, 6);
        jugadores_e7[8] = new Jugador("Carlos9", 9, 16, 1, 4);
        jugadores_e7[9] = new Jugador("Carlos10", 10, 27, 0, 6);
        jugadores_e7[10] = new Jugador("Carlos11", 11, 7, 2, 5);

        Jugador[] jugadores_e8 = new Jugador[11];
        jugadores_e8[0] = new Jugador("leo1", 1, 1, 0, 5);
        jugadores_e8[1] = new Jugador("leo2", 2, 2, 1, 2);
        jugadores_e8[2] = new Jugador("leo3", 3, 0, 0, 5);
        jugadores_e8[3] = new Jugador("leo4", 4, 6, 2, 5);
        jugadores_e8[4] = new Jugador("leo5", 5, 3, 0, 3);
        jugadores_e8[5] = new Jugador("leo6", 6, 3, 6, 6);
        jugadores_e8[6] = new Jugador("leo7", 7, 10, 1, 5);
        jugadores_e8[7] = new Jugador("leo8", 8, 15, 0, 6);
        jugadores_e8[8] = new Jugador("leo9", 9, 16, 1, 4);
        jugadores_e8[9] = new Jugador("leo10", 10, 27, 0, 6);
        jugadores_e8[10] = new Jugador("leo11", 11, 7, 2, 5);

        Jugador[] jugadores_e9 = new Jugador[11];
        jugadores_e9[0] = new Jugador("luis1", 1, 1, 0, 5);
        jugadores_e9[1] = new Jugador("luis2", 2, 2, 1, 2);
        jugadores_e9[2] = new Jugador("luis3", 3, 0, 0, 5);
        jugadores_e9[3] = new Jugador("luis4", 4, 0, 2, 5);
        jugadores_e9[4] = new Jugador("luis5", 5, 7, 0, 3);
        jugadores_e9[5] = new Jugador("luis6", 6, 3, 6, 6);
        jugadores_e9[6] = new Jugador("luis7", 7, 10, 1, 5);
        jugadores_e9[7] = new Jugador("luis8", 8, 15, 0, 6);
        jugadores_e9[8] = new Jugador("luis9", 9, 16, 1, 4);
        jugadores_e9[9] = new Jugador("luis10", 10, 27, 0, 6);
        jugadores_e9[10] = new Jugador("luis11", 11, 7, 2, 5);

        Jugador[] jugadores_e10 = new Jugador[11];
        jugadores_e10[0] = new Jugador("cristian1", 1, 1, 0, 5);
        jugadores_e10[1] = new Jugador("cristian2", 2, 2, 1, 2);
        jugadores_e10[2] = new Jugador("cristian3", 3, 0, 0, 5);
        jugadores_e10[3] = new Jugador("cristian4", 4, 0, 2, 5);
        jugadores_e10[4] = new Jugador("cristian5", 5, 0, 0, 3);
        jugadores_e10[5] = new Jugador("cristian6", 6, 3, 6, 6);
        jugadores_e10[6] = new Jugador("cristian7", 7, 10, 1, 5);
        jugadores_e10[7] = new Jugador("cristian8", 8, 15, 0, 6);
        jugadores_e10[8] = new Jugador("cristian9", 9, 16, 1, 4);
        jugadores_e10[9] = new Jugador("cristian10", 10, 27, 0, 6);
        jugadores_e10[10] = new Jugador("cristian11", 11, 7, 2, 5);

        Jugador[] jugadores_e11 = new Jugador[11];
        jugadores_e11[0] = new Jugador("miguel1", 1, 1, 0, 5);
        jugadores_e11[1] = new Jugador("miguel2", 2, 2, 1, 2);
        jugadores_e11[2] = new Jugador("miguel3", 3, 0, 0, 5);
        jugadores_e11[3] = new Jugador("miguel4", 4, 0, 2, 5);
        jugadores_e11[4] = new Jugador("miguel5", 5, 0, 0, 3);
        jugadores_e11[5] = new Jugador("miguel6", 6, 3, 6, 6);
        jugadores_e11[6] = new Jugador("miguel7", 7, 10, 1, 5);
        jugadores_e11[7] = new Jugador("miguel8", 8, 15, 0, 6);
        jugadores_e11[8] = new Jugador("miguel9", 9, 16, 1, 4);
        jugadores_e11[9] = new Jugador("miguel10", 10, 27, 0, 6);
        jugadores_e11[10] = new Jugador("miguel11", 11, 7, 2, 5);

        Jugador[] jugadores_e12 = new Jugador[11];
        jugadores_e12[0] = new Jugador("suarez1", 1, 1, 0, 5);
        jugadores_e12[1] = new Jugador("suarez2", 2, 2, 1, 2);
        jugadores_e12[2] = new Jugador("suarez3", 3, 0, 0, 5);
        jugadores_e12[3] = new Jugador("suarez4", 4, 0, 2, 5);
        jugadores_e12[4] = new Jugador("suarez5", 5, 0, 0, 3);
        jugadores_e12[5] = new Jugador("suarez6", 6, 3, 6, 6);
        jugadores_e12[6] = new Jugador("suarez7", 7, 10, 1, 5);
        jugadores_e12[7] = new Jugador("suarez8", 8, 15, 0, 6);
        jugadores_e12[8] = new Jugador("suarez9", 9, 16, 1, 4);
        jugadores_e12[9] = new Jugador("suarez10", 10, 27, 0, 6);
        jugadores_e12[10] = new Jugador("suarez11", 11, 7, 2, 5);

        Jugador[] jugadores_e13 = new Jugador[11];
        jugadores_e13[0] = new Jugador("Iniesta1", 1, 1, 0, 5);
        jugadores_e13[1] = new Jugador("Iniesta2", 2, 2, 1, 2);
        jugadores_e13[2] = new Jugador("Iniesta3", 3, 0, 0, 5);
        jugadores_e13[3] = new Jugador("Iniesta4", 4, 0, 2, 5);
        jugadores_e13[4] = new Jugador("Iniesta5", 5, 0, 0, 3);
        jugadores_e13[5] = new Jugador("Iniesta6", 6, 3, 6, 6);
        jugadores_e13[6] = new Jugador("Iniesta7", 7, 10, 1, 5);
        jugadores_e13[7] = new Jugador("Iniesta8", 8, 15, 0, 6);
        jugadores_e13[8] = new Jugador("Iniesta9", 9, 16, 1, 4);
        jugadores_e13[9] = new Jugador("Iniesta10", 10, 27, 0, 6);
        jugadores_e13[10] = new Jugador("Iniesta11", 11, 7, 2, 5);

        Jugador[] jugadores_e14 = new Jugador[11];
        jugadores_e14[0] = new Jugador("xavi1", 1, 1, 0, 5);
        jugadores_e14[1] = new Jugador("xavi2", 2, 2, 1, 2);
        jugadores_e14[2] = new Jugador("xavi3", 3, 0, 0, 5);
        jugadores_e14[3] = new Jugador("xavi4", 4, 0, 2, 5);
        jugadores_e14[4] = new Jugador("xavi5", 5, 0, 0, 3);
        jugadores_e14[5] = new Jugador("xavi6", 6, 3, 6, 6);
        jugadores_e14[6] = new Jugador("xavi7", 7, 10, 1, 5);
        jugadores_e14[7] = new Jugador("xavi8", 8, 15, 0, 6);
        jugadores_e14[8] = new Jugador("xavi9", 9, 16, 1, 4);
        jugadores_e14[9] = new Jugador("xavi10", 10, 27, 0, 6);
        jugadores_e14[10] = new Jugador("xavi11", 11, 7, 2, 5);

        Jugador[] jugadores_e15 = new Jugador[11];
        jugadores_e15[0] = new Jugador("busquet1", 1, 1, 0, 5);
        jugadores_e15[1] = new Jugador("busquet2", 2, 2, 1, 2);
        jugadores_e15[2] = new Jugador("busquet3", 3, 0, 0, 5);
        jugadores_e15[3] = new Jugador("busquet4", 4, 0, 2, 5);
        jugadores_e15[4] = new Jugador("busquet5", 5, 0, 0, 3);
        jugadores_e15[5] = new Jugador("busquet6", 6, 3, 6, 6);
        jugadores_e15[6] = new Jugador("busquet7", 7, 10, 1, 5);
        jugadores_e15[7] = new Jugador("busquet8", 8, 15, 0, 6);
        jugadores_e15[8] = new Jugador("busquet9", 9, 16, 1, 4);
        jugadores_e15[9] = new Jugador("busquet10", 10, 27, 0, 6);
        jugadores_e15[10] = new Jugador("busquet11", 11, 7, 2, 5);

        //Creamos los siguientes equipos de la Liga.
        Equipo e1 = new Equipo("Zaragoza", "Romareda", 1932, jugadores_e1, 65, 20, 13, 5);
        Equipo e2 = new Equipo("Barcelona", "Camp Nou", 1899, jugadores_e2, 79, 24, 7, 7);
        Equipo e3 = new Equipo("Madrid", "Bernabeu", 1902, jugadores_e3, 84, 25, 9, 4);
        Equipo e4 = new Equipo("At.Madrid", "Wanda", 1903, jugadores_e4, 86, 26, 8, 4);
        Equipo e5 = new Equipo("Sevilla", "Sz.Pizjuan", 1932, jugadores_e5, 77, 24, 9, 5);
        Equipo e6 = new Equipo("Real.Sociedad", "Anoeta", 1932, jugadores_e6, 62, 17, 10, 11);
        Equipo e7 = new Equipo("Betis", "Benito Villamarin", 1932, jugadores_e7, 61, 17, 11, 10);
        Equipo e8 = new Equipo("Celta de Vigo", "Balaidos", 1932, jugadores_e8, 53, 14, 13, 11);
        Equipo e9 = new Equipo("Granada", "Los Carmenes", 1932, jugadores_e9, 46, 13, 18, 7);
        Equipo e10 = new Equipo("Bilbao", "San Mames", 1932, jugadores_e10, 46, 11, 14, 13);
        Equipo e11 = new Equipo("Osasuna", "El Sadar", 1932, jugadores_e11, 44, 11, 16, 11);
        Equipo e12 = new Equipo("Cadiz", "Mirandilla", 1932, jugadores_e12, 44, 11, 11, 16);
        Equipo e13 = new Equipo("Valencia", "Mestalla", 1932, jugadores_e13, 43, 10, 15, 13);
        Equipo e14 = new Equipo("Levante", "Ciudad de Valencia", 1932, jugadores_e14, 41, 9, 15, 14);
        Equipo e15 = new Equipo("Getafe", "Alfonso Perez", 1932, jugadores_e15, 38, 9, 18, 11);


        System.out.println("Bienvenido al consultor de la Liga de Pablo, eliga un numero del 1 al 4," + "\n" + " 1. Visualizar clasificación ordenada por puntos: " + "\n" +
                "2. Visualizar los 5 máximos goleadores: " + "\n" + "3. Visualizar los 5 jugadores con más expulsiones: " + "\n" + "4. Obtener los 3 equipos más goleadores: ");
        int numero_menu = sc.nextInt();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        String y_n ;
        while (true) {
            if (numero_menu == 1) {
                ArrayList<Equipo> clasificacion = new ArrayList<>();
                clasificacion.add(e1);
                clasificacion.add(e2);
                clasificacion.add(e3);
                clasificacion.add(e4);
                clasificacion.add(e5);
                clasificacion.add(e6);
                clasificacion.add(e7);
                clasificacion.add(e8);
                clasificacion.add(e9);
                clasificacion.add(e10);
                clasificacion.add(e11);
                clasificacion.add(e12);
                clasificacion.add(e13);
                clasificacion.add(e14);
                clasificacion.add(e15);

                clasificacion.sort(Collections.reverseOrder());

                for (Equipo elemento : clasificacion) {
                    System.out.println(elemento);
                }

            }

            if (numero_menu == 2) {
                Jugador aux;
                for (int i = 0; i < jugadores_e1.length - 1; i++) {
                    for (int j = 0; j < jugadores_e1.length - 1; j++) {
                        if (jugadores_e1[j].getGoles() < jugadores_e1[j + 1].getGoles()) {
                            aux = jugadores_e1[j];
                            jugadores_e1[j] = jugadores_e1[j + 1];
                            jugadores_e1[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del zaragoza: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e1[i].getNombre() + " = " + jugadores_e1[i].getGoles());
                }

                for (int i = 0; i < jugadores_e2.length - 1; i++) {
                    for (int j = 0; j < jugadores_e2.length - 1; j++) {
                        if (jugadores_e2[j].getGoles() < jugadores_e2[j + 1].getGoles()) {
                            aux = jugadores_e2[j];
                            jugadores_e2[j] = jugadores_e2[j + 1];
                            jugadores_e2[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Barcelona: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e2[i].getNombre() + " = " + jugadores_e2[i].getGoles());
                }

                for (int i = 0; i < jugadores_e3.length - 1; i++) {
                    for (int j = 0; j < jugadores_e3.length - 1; j++) {
                        if (jugadores_e3[j].getGoles() < jugadores_e3[j + 1].getGoles()) {
                            aux = jugadores_e3[j];
                            jugadores_e3[j] = jugadores_e3[j + 1];
                            jugadores_e3[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Madrid: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e3[i].getNombre() + " = " + jugadores_e3[i].getGoles());
                }

                for (int i = 0; i < jugadores_e4.length - 1; i++) {
                    for (int j = 0; j < jugadores_e4.length - 1; j++) {
                        if (jugadores_e4[j].getGoles() < jugadores_e4[j + 1].getGoles()) {
                            aux = jugadores_e4[j];
                            jugadores_e4[j] = jugadores_e4[j + 1];
                            jugadores_e4[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del AT.Madrid: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e4[i].getNombre() + " = " + jugadores_e4[i].getGoles());
                }

                for (int i = 0; i < jugadores_e5.length - 1; i++) {
                    for (int j = 0; j < jugadores_e5.length - 1; j++) {
                        if (jugadores_e5[j].getGoles() < jugadores_e5[j + 1].getGoles()) {
                            aux = jugadores_e5[j];
                            jugadores_e5[j] = jugadores_e5[j + 1];
                            jugadores_e5[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Sevilla: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e5[i].getNombre() + " = " + jugadores_e5[i].getGoles());
                }

                for (int i = 0; i < jugadores_e6.length - 1; i++) {
                    for (int j = 0; j < jugadores_e6.length - 1; j++) {
                        if (jugadores_e6[j].getGoles() < jugadores_e6[j + 1].getGoles()) {
                            aux = jugadores_e6[j];
                            jugadores_e6[j] = jugadores_e6[j + 1];
                            jugadores_e6[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Real Sociedad: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e6[i].getNombre() + " = " + jugadores_e6[i].getGoles());
                }

                for (int i = 0; i < jugadores_e8.length - 1; i++) {
                    for (int j = 0; j < jugadores_e8.length - 1; j++) {
                        if (jugadores_e8[j].getGoles() < jugadores_e8[j + 1].getGoles()) {
                            aux = jugadores_e8[j];
                            jugadores_e8[j] = jugadores_e8[j + 1];
                            jugadores_e8[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Celta: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e8[i].getNombre() + " = " + jugadores_e8[i].getGoles());
                }

                for (int i = 0; i < jugadores_e9.length - 1; i++) {
                    for (int j = 0; j < jugadores_e9.length - 1; j++) {
                        if (jugadores_e9[j].getGoles() < jugadores_e9[j + 1].getGoles()) {
                            aux = jugadores_e9[j];
                            jugadores_e9[j] = jugadores_e9[j + 1];
                            jugadores_e9[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Granada: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e9[i].getNombre() + " = " + jugadores_e9[i].getGoles());
                }

                for (int i = 0; i < jugadores_e10.length - 1; i++) {
                    for (int j = 0; j < jugadores_e10.length - 1; j++) {
                        if (jugadores_e10[j].getGoles() < jugadores_e10[j + 1].getGoles()) {
                            aux = jugadores_e10[j];
                            jugadores_e10[j] = jugadores_e10[j + 1];
                            jugadores_e10[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Bilbao: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e10[i].getNombre() + " = " + jugadores_e10[i].getGoles());
                }

                for (int i = 0; i < jugadores_e11.length - 1; i++) {
                    for (int j = 0; j < jugadores_e11.length - 1; j++) {
                        if (jugadores_e11[j].getGoles() < jugadores_e11[j + 1].getGoles()) {
                            aux = jugadores_e11[j];
                            jugadores_e11[j] = jugadores_e11[j + 1];
                            jugadores_e11[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Osasuna: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e11[i].getNombre() + " = " + jugadores_e11[i].getGoles());
                }

                for (int i = 0; i < jugadores_e12.length - 1; i++) {
                    for (int j = 0; j < jugadores_e12.length - 1; j++) {
                        if (jugadores_e12[j].getGoles() < jugadores_e12[j + 1].getGoles()) {
                            aux = jugadores_e12[j];
                            jugadores_e12[j] = jugadores_e12[j + 1];
                            jugadores_e12[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Cadiz: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e12[i].getNombre() + " = " + jugadores_e12[i].getGoles());
                }

                for (int i = 0; i < jugadores_e13.length - 1; i++) {
                    for (int j = 0; j < jugadores_e13.length - 1; j++) {
                        if (jugadores_e13[j].getGoles() < jugadores_e13[j + 1].getGoles()) {
                            aux = jugadores_e13[j];
                            jugadores_e13[j] = jugadores_e13[j + 1];
                            jugadores_e13[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Valencia: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e13[i].getNombre() + " = " + jugadores_e13[i].getGoles());
                }

                for (int i = 0; i < jugadores_e14.length - 1; i++) {
                    for (int j = 0; j < jugadores_e14.length - 1; j++) {
                        if (jugadores_e14[j].getGoles() < jugadores_e14[j + 1].getGoles()) {
                            aux = jugadores_e14[j];
                            jugadores_e14[j] = jugadores_e14[j + 1];
                            jugadores_e14[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Levante: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e14[i].getNombre() + " = " + jugadores_e14[i].getGoles());
                }

                for (int i = 0; i < jugadores_e15.length - 1; i++) {
                    for (int j = 0; j < jugadores_e15.length - 1; j++) {
                        if (jugadores_e15[j].getGoles() < jugadores_e15[j + 1].getGoles()) {
                            aux = jugadores_e15[j];
                            jugadores_e15[j] = jugadores_e15[j + 1];
                            jugadores_e15[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos goleadores del Getafe: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e15[i].getNombre() + " = " + jugadores_e15[i].getGoles());
                }

            }
            if (numero_menu == 3) {
                Jugador aux;
                for (int i = 0; i < jugadores_e1.length - 1; i++) {
                    for (int j = 0; j < jugadores_e1.length - 1; j++) {
                        if (jugadores_e1[j].getTarjetas_rojas() < jugadores_e1[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e1[j];
                            jugadores_e1[j] = jugadores_e1[j + 1];
                            jugadores_e1[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Zaragoza: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e1[i].getNombre() + " = " + jugadores_e1[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e2.length - 1; i++) {
                    for (int j = 0; j < jugadores_e2.length - 1; j++) {
                        if (jugadores_e2[j].getTarjetas_rojas() < jugadores_e2[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e2[j];
                            jugadores_e2[j] = jugadores_e2[j + 1];
                            jugadores_e2[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Barcelona: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e2[i].getNombre() + " = " + jugadores_e2[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e3.length - 1; i++) {
                    for (int j = 0; j < jugadores_e3.length - 1; j++) {
                        if (jugadores_e3[j].getTarjetas_rojas() < jugadores_e3[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e3[j];
                            jugadores_e3[j] = jugadores_e3[j + 1];
                            jugadores_e3[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Madrid: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e3[i].getNombre() + " = " + jugadores_e3[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e4.length - 1; i++) {
                    for (int j = 0; j < jugadores_e4.length - 1; j++) {
                        if (jugadores_e4[j].getTarjetas_rojas() < jugadores_e4[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e4[j];
                            jugadores_e4[j] = jugadores_e4[j + 1];
                            jugadores_e4[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del At.Madrid: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e4[i].getNombre() + " = " + jugadores_e4[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e5.length - 1; i++) {
                    for (int j = 0; j < jugadores_e5.length - 1; j++) {
                        if (jugadores_e5[j].getTarjetas_rojas() < jugadores_e5[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e1[j];
                            jugadores_e5[j] = jugadores_e5[j + 1];
                            jugadores_e5[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Sevilla: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e5[i].getNombre() + " = " + jugadores_e5[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e6.length - 1; i++) {
                    for (int j = 0; j < jugadores_e6.length - 1; j++) {
                        if (jugadores_e6[j].getTarjetas_rojas() < jugadores_e6[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e6[j];
                            jugadores_e6[j] = jugadores_e6[j + 1];
                            jugadores_e6[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Real Sociedad: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e6[i].getNombre() + " = " + jugadores_e6[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e7.length - 1; i++) {
                    for (int j = 0; j < jugadores_e7.length - 1; j++) {
                        if (jugadores_e7[j].getTarjetas_rojas() < jugadores_e7[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e7[j];
                            jugadores_e7[j] = jugadores_e7[j + 1];
                            jugadores_e7[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Betis: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e7[i].getNombre() + " = " + jugadores_e7[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e8.length - 1; i++) {
                    for (int j = 0; j < jugadores_e8.length - 1; j++) {
                        if (jugadores_e8[j].getTarjetas_rojas() < jugadores_e8[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e8[j];
                            jugadores_e8[j] = jugadores_e8[j + 1];
                            jugadores_e8[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Celta: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e8[i].getNombre() + " = " + jugadores_e8[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e9.length - 1; i++) {
                    for (int j = 0; j < jugadores_e9.length - 1; j++) {
                        if (jugadores_e9[j].getTarjetas_rojas() < jugadores_e9[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e9[j];
                            jugadores_e9[j] = jugadores_e9[j + 1];
                            jugadores_e9[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Granada: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e9[i].getNombre() + " = " + jugadores_e9[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e10.length - 1; i++) {
                    for (int j = 0; j < jugadores_e10.length - 1; j++) {
                        if (jugadores_e10[j].getTarjetas_rojas() < jugadores_e10[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e10[j];
                            jugadores_e10[j] = jugadores_e10[j + 1];
                            jugadores_e10[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Bilbao: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e10[i].getNombre() + " = " + jugadores_e10[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e11.length - 1; i++) {
                    for (int j = 0; j < jugadores_e11.length - 1; j++) {
                        if (jugadores_e11[j].getTarjetas_rojas() < jugadores_e11[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e11[j];
                            jugadores_e11[j] = jugadores_e11[j + 1];
                            jugadores_e11[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Osasuna: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e11[i].getNombre() + " = " + jugadores_e11[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e12.length - 1; i++) {
                    for (int j = 0; j < jugadores_e12.length - 1; j++) {
                        if (jugadores_e12[j].getTarjetas_rojas() < jugadores_e12[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e12[j];
                            jugadores_e12[j] = jugadores_e12[j + 1];
                            jugadores_e12[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Cadiz: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e12[i].getNombre() + " = " + jugadores_e12[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e13.length - 1; i++) {
                    for (int j = 0; j < jugadores_e13.length - 1; j++) {
                        if (jugadores_e13[j].getTarjetas_rojas() < jugadores_e13[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e13[j];
                            jugadores_e13[j] = jugadores_e13[j + 1];
                            jugadores_e13[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Valencia: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e13[i].getNombre() + " = " + jugadores_e13[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e14.length - 1; i++) {
                    for (int j = 0; j < jugadores_e14.length - 1; j++) {
                        if (jugadores_e14[j].getTarjetas_rojas() < jugadores_e14[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e14[j];
                            jugadores_e14[j] = jugadores_e14[j + 1];
                            jugadores_e14[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Levante: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e14[i].getNombre() + " = " + jugadores_e14[i].getTarjetas_rojas());
                }
                for (int i = 0; i < jugadores_e15.length - 1; i++) {
                    for (int j = 0; j < jugadores_e15.length - 1; j++) {
                        if (jugadores_e15[j].getTarjetas_rojas() < jugadores_e15[j + 1].getTarjetas_rojas()) {
                            aux = jugadores_e15[j];
                            jugadores_e15[j] = jugadores_e15[j + 1];
                            jugadores_e15[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Los 5 maximos Expulsados del Getafe: ");
                for (int i = 0; i <= 4; i++) {
                    System.out.println(jugadores_e15[i].getNombre() + " = " + jugadores_e15[i].getTarjetas_rojas());
                }
            }
            if (numero_menu == 4) {
                int golese1 = 0, golese2 = 0, golese3 = 0, golese4 = 0, golese5 = 0, golese6 = 0, golese7 = 0, golese8 = 0, golese9 = 0, golese10 = 0, golese11 = 0, golese12 = 0,
                        golese13 = 0, golese14 = 0, golese15 = 0;

                for (int i = 0; i < jugadores_e1.length; i++) {
                    golese1 = golese1 + jugadores_e1[i].getGoles();
                }
                for (int i = 0; i < jugadores_e2.length; i++) {
                    golese2 = golese2 + jugadores_e2[i].getGoles();
                }
                for (int i = 0; i < jugadores_e3.length; i++) {
                    golese3 = golese3 + jugadores_e3[i].getGoles();
                }
                for (int i = 0; i < jugadores_e4.length; i++) {
                    golese4 = golese4 + jugadores_e4[i].getGoles();
                }
                for (int i = 0; i < jugadores_e5.length; i++) {
                    golese5 = golese5 + jugadores_e5[i].getGoles();
                }
                for (int i = 0; i < jugadores_e6.length; i++) {
                    golese6 = golese6 + jugadores_e6[i].getGoles();
                }
                for (int i = 0; i < jugadores_e7.length; i++) {
                    golese7 = golese7 + jugadores_e7[i].getGoles();
                }
                for (int i = 0; i < jugadores_e8.length; i++) {
                    golese8 = golese8 + jugadores_e8[i].getGoles();
                }
                for (int i = 0; i < jugadores_e9.length; i++) {
                    golese9 = golese9 + jugadores_e9[i].getGoles();
                }
                for (int i = 0; i < jugadores_e10.length; i++) {
                    golese10 = golese10 + jugadores_e10[i].getGoles();
                }
                for (int i = 0; i < jugadores_e11.length; i++) {
                    golese11 = golese11 + jugadores_e11[i].getGoles();
                }
                for (int i = 0; i < jugadores_e12.length; i++) {
                    golese12 = golese12 + jugadores_e12[i].getGoles();
                }
                for (int i = 0; i < jugadores_e13.length; i++) {
                    golese13 = golese13 + jugadores_e13[i].getGoles();
                }
                for (int i = 0; i < jugadores_e14.length; i++) {
                    golese14 = golese14 + jugadores_e14[i].getGoles();
                }
                for (int i = 0; i < jugadores_e15.length; i++) {
                    golese15 = golese15 + jugadores_e15[i].getGoles();
                }

                int[] goles_afavor = {golese1, golese2, golese3, golese4, golese5, golese6, golese7, golese8, golese8, golese10,
                        golese11, golese12, golese13, golese14, golese15};
                String[] nombre_equipos1 = {e1.getNombre(), e2.getNombre(), e3.getNombre(), e4.getNombre(), e5.getNombre(), e6.getNombre(), e7.getNombre()
                        , e8.getNombre(), e9.getNombre(), e10.getNombre(), e11.getNombre(), e12.getNombre(), e13.getNombre(), e14.getNombre(), e15.getNombre()};


                int aux;
                String aux_equipos;

                for (int i = 0; i < goles_afavor.length - 1; i++) {
                    for (int j = 0; j < goles_afavor.length - 1; j++) {
                        if (goles_afavor[j] < goles_afavor[j + 1]) {
                            aux = goles_afavor[j];
                            aux_equipos = nombre_equipos1[j];
                            goles_afavor[j] = goles_afavor[j + 1];
                            nombre_equipos1[j] = nombre_equipos1[j + 1];
                            goles_afavor[j + 1] = aux;
                            nombre_equipos1[j + 1] = aux_equipos;
                        }
                    }
                }
                System.out.println("Estos son los 3 equipos mas goleadores: ");
                for (int i = 0; i <= 2; i++) {
                    System.out.println("Equipo: " + nombre_equipos1[i] + " = " + goles_afavor[i]);
                }
            }
            if (numero_menu != 1 && numero_menu != 2 && numero_menu != 3 && numero_menu != 4) {
                System.out.println("Debes presionar un numero del 1 al 4 ");
            }
            System.out.println("¿Deseas realizar otra operacion (y/n)? ");
            y_n = sc.next();
            if (y_n.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
