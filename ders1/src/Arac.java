public class Arac {

    int hiz;
    int hiz2;
    int zaman;

    Arac(int hiz, int hiz2, int zaman)
    {
      this.hiz=hiz;
      this.hiz2=hiz2;
      this.zaman=zaman;
    }

    int ayniyon(){


        int yol = Math.abs((hiz-hiz2)*zaman);


        return yol;
    }

    int farkliyon(){

        int yol = Math.abs((hiz+hiz2)*zaman);
        return yol;
    }

    void yazdir(){

        int ayniyon= ayniyon();
        int farkliyon =farkliyon();

        System.out.println("Ayni yon icin yolunuz " +ayniyon);
        System.out.println("Farkli yon icin yolunuz " +farkliyon);

    }
}
