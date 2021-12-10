package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1=> rock 2=> paper 3=> scisor
        int computer_score;//computer score
        int user_score;
        String oyun_elemanları = "1 => rock " +
                      "2 => paper " +
                      "3 => scissor";


        for (computer_score=0,user_score=0;computer_score<5&&user_score<5;){
            int rand = (int) (Math.random() * 3) + 1;

            Scanner input = new Scanner(System.in);

            System.out.println("Bilgisayarin skoru => " +computer_score );
            System.out.println("Sizin skorunuz => "+ user_score);

            System.out.println("lütfen aşağıdaki değerlerden birisini giriniz");
            System.out.println(oyun_elemanları);
            int value = input.nextInt();

            if (value>3 || value<0){

                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Lütfen geçerli bir değer giriniz");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
                continue;
            }
            else if (rand == value){
                if (rand ==1 ) System.out.println("İki taraf da 'ROCK' seçti  ");
                else if (rand==2) System.out.println("ki taraf da 'PAPER' seçti  ");
                else if(rand==3) System.out.println("ki taraf da 'SCİSSOR' seçti  ");
                System.out.println("------------------------------");
                System.out.println("Oyun berabere. Lütfen başka bir değer giriniz");
                System.out.println("------------------------------");

            }else if (rand==1 && value==3){
                System.out.println("Sizin seçiminiz 'SCİSSOR'  ");
                System.out.println("Bilgisayarın şeçimi 'ROCK'  ");
                System.out.println("------------------------------");
                System.out.println("*** Bilgisayar kazandı ***");
                System.out.println("------------------------------");
                computer_score++;
            }else if (rand==1 && value ==2){
                System.out.println("Sizin seçiminiz 'PAPER'  ");
                System.out.println("Bilgisayarın şeçimi 'ROCK'  ");
                System.out.println("------------------------------");
                System.out.println("*** Tebrikler siz kazandınız ***");
                System.out.println("------------------------------");
                user_score++;
            }else if (rand == 3 && value == 2){
                System.out.println("Sizin seçiminiz 'PAPER'  ");
                System.out.println("Bilgisayarın şeçimi 'SCISSOR'");
                System.out.println("------------------------------");
                System.out.println("*** Bilgisayar kazandı ***");
                System.out.println("------------------------------");
                computer_score++;
            }else if (rand == 3 && value == 1){
                System.out.println("Sizin seçiminiz 'ROCK'");
                System.out.println("Bilgisayarın şeçimi 'SCISSOR'  ");
                System.out.println("------------------------------");
                System.out.println("*** Tebrikler siz kazandınız ***");
                System.out.println("------------------------------");
                user_score++;
            }else if (rand == 2 && value ==1){
                System.out.println("Sizin seçiminiz 'ROCK'  ");
                System.out.println("Bilgisayarın şeçimi 'PAPER'  ");
                System.out.println("------------------------------");
                System.out.println("*** Bilgisayar kazandı ***");
                System.out.println("------------------------------");
                computer_score++;
            }else if (rand == 2 && value == 3){
                System.out.println("Sizin seçiminiz 'SİCSSOR'  ");
                System.out.println("Bilgisayarın şeçimi 'PAPER'  ");
                System.out.println("------------------------------");
                System.out.println("*** Tebrikler siz kazandınız ***");
                System.out.println("------------------------------");
            }
        }

        System.out.println("Bilgisayarin skoru => " +computer_score );
        System.out.println("Sizin skorunuz => "+ user_score);

        if(computer_score>user_score){
            System.out.println("------------------------------");
            System.out.println("!!!!!!!! Malesef bilgisayar oyunu kazandı !!!!!!!!!");
            System.out.println("------------------------------");
        }else {System.out.println("------------------------------");
        System.out.println("********* Tebrikler oyunu kazandınız **********");
        System.out.println("------------------------------");}
    }

}
