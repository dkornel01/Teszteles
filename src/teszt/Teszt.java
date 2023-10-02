
package teszt;

import java.util.Scanner;


public class Teszt {

    static String[] pakli=new String[22];
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        pakli();
        String[] tarto=pakli;
        keveres(tarto);
        kiiras();
    }

    private static void pakli() {
        int lap=0;
        String[] atmeneti={"sziv_VIII","sziv_IX","sziv_X","sziv_kir","sziv_fel","sziv_le","tok_VIII","tok_IX","tok_X","tok_kir","tok_fel","tok_le","level_VIII","level_IX","level_X","level_kir","level_fel","level_le","mak_fel","mak_le","mak_kiraly"};
        pakli=atmeneti;
        while (lap<pakli.length){
                      for (int k=0;k<3;k++){
                          System.out.print(pakli[lap]+"  ");
                          lap++;
                      }
                      System.out.println("");
                  }
    }
    private static void kiiras() {
        System.out.println(pakli[11]);
    }
        private static void keveres(String[] tarto) {
        int lap=0;
        int valasztott=valasztas();
        switch(valasztott){
                case(1):
                  for (int i=0;i<7;i++){
                    pakli[i]=tarto[20-(i-1)*3];
                    pakli[i+7]=tarto[19-(i-1)*3];
                    pakli[i+14]=tarto[21-(i-1)*3]; 
                  }
                  while (lap<pakli.length){
                      for (int k=0;k<3;k++){
                          System.out.print(pakli[lap]+"  ");
                          lap++;
                      }
                      System.out.println("");
                  }
                  break;
                case(2):
                    for (int i=0;i<7;i++){
                    pakli[i]=tarto[21-(i-1)*3];
                    pakli[i+7]=tarto[19-(i-1)*3];
                    pakli[i+14]=tarto[20-(i-1)*3];
                  }
                    while (lap<pakli.length){
                      for (int k=0;k<3;k++){
                          System.out.print(pakli[lap]+"  ");
                          lap++;
                      }
                      System.out.println("");
                  }
                    break;
                case(3):
                    for (int i=0;i<7;i++){
                    pakli[i]=tarto[20-(i-1)*3];
                    pakli[i+7]=tarto[21-(i-1)*3];
                    pakli[i+14]=tarto[19-(i-1)*3];
                  }
                    while (lap<pakli.length){
                      for (int k=0;k<3;k++){
                          System.out.print(pakli[lap]+"  ");
                          lap++;
                      }
                      System.out.println("");
                  }
                    break;
              }
    }
    private static int valasztas() {
        System.out.println("adjon meg az oszlop szamat");
        int szam=0;
        do {
            szam=sc.nextInt();
        } while(szam<1 || szam>3);
        return szam;
    }
}
