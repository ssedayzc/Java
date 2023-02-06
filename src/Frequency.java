public class Frequency {
    public static void main(String[] args){

        int[] dizi = new int[]{1,4,6,2,4,6};
        int i = 0;
        int indis = dizi[i];
        int count = 1;
        for( ;i < dizi.length; i++) {

            if((i != indis) && dizi[i] == dizi[indis]){
                count++;
                System.out.println(dizi[i]+" : "+count);
            }
            else{
                System.out.println(dizi[i]+" : "+count);
            }



        }

    }

}
