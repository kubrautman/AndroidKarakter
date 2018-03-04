package com.example.kub.myapplication;


public class karakter {
    int kilo;
    int hareketSayisi;
    int saldiriGucu;
    String isim="";

    public String yemek(){
        if(hareketSayisi>0) {
           kilo++;
            hareketSayisi--;
return "Yemek yedi ve kilo aldı";
        }
        else
            return "Yeterli gücünüz yok!";

    }
    public  String uyumak(){
        if(hareketSayisi>0){
            hareketSayisi--;
            return "Karakteriniz uyudu.";

        }
        else return  "Yeterli hareket yok";
    }
    public  String savas(){
        if(hareketSayisi>0) {
            hareketSayisi++;
            return "Karakteriniz savaştı";
        }
        else return  "Karakterinizin yeterli gücü yok";
    }
    @Override
    public  String toString()
    {
        return "İsim:"+isim+"\nkilo:" +kilo+ "\nhareket sayısı:"+hareketSayisi+"\nSaldırı gucu:"+saldiriGucu;
    }



}
