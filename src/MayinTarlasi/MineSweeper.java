package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
     int n=0, m=0 ,mayin;
     String [][] konum = new String[n][m];
     int elemanSayisi = n * m ;
     int mayinSayisi = elemanSayisi / 4;
     String [][] matris =new String[n][m];


MineSweeper(int n ,int m){
   this.n = n;
   this.m = m;
}
    Random r=new Random();
    int k,l;
    // Mayınların konumunu işaretledik
    for (int i = 0; i < n ; i++) {
        for (int j = 0; j < m; j++) {
            matris[i][j] = "-";
            }
        }
    while( mayinSayisi >= 0){
        k=r.nextInt(n);
        l=r.nextInt(m);
        matris[k][l] = "*";
        mayinSayisi--;
    }


}












