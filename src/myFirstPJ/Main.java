package myFirstPJ;

import java.util.Scanner;

class object {

    static int index;
    static Object[][] studentInfo;

    public static void studentInfoleriEkle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("index ogrenci sayisini giriniz : ");
        index = scanner.nextInt();
        studentInfo = new Object[index][4];
        for(int i = 0;i<index;i++){
            System.out.println((i+1)+". ogrencinin bilgilerini giriniz");
            System.out.print(" - ismi : ");
            String name = scanner.next();
            System.out.print(" - cinsiyeti : ");
            String gender = scanner.next();
            System.out.print(" - vize1 notu : ");
            int vize1 = scanner.nextInt();
            System.out.print(" - vize2 notu : ");
            int vize2 = scanner.nextInt();
            studentInfo[i][0] = name;
            studentInfo[i][1] = gender;
            studentInfo[i][2] = vize1;
            studentInfo[i][3] = vize2;
        }



    }
    public static void mevcutOgrenciBilgileri() {
        System.out.println();
        System.out.println("mevcut ogrenci bilgileri : " );
        for(int i=0;i<index;i++) {
            for(int j=0;j<studentInfo[0].length;j++) {
                System.out.println(studentInfo[i][j]);

            }System.out.println("******");
        }
    }

    public static double bayanOgrenciYuzdesi() {
        System.out.println();
        double bayanOgrenciYuzdesi;
        int counter = 0;
        for(int i=0;i<index;i++) {
            if(studentInfo[i][1].equals("bayan")) {
                counter++;
            }
        }
        bayanOgrenciYuzdesi = (counter*100)/index;
        return bayanOgrenciYuzdesi ;
    }
    public static double bayOgrenciYuzdesi() {
        System.out.println();
        double bayOgrenciYuzdesi;
        int counter = 0;
        for(int i=0;i<index;i++) {
            if(studentInfo[i][1].equals("bay")) {
                counter++;
            }
        }
        bayOgrenciYuzdesi = (counter*100)/index;
        return bayOgrenciYuzdesi ;
    }
    public static void ortalamaUstuOgrenciadlari() {
        double vize1Sinifortalamasi;
        double vize2Sinifortalamasi;
        double vize2Sum =0;
        System.out.println();
        System.out.println(" ");
        System.out.println("ortalamasi ustun olan Ogrenciler : ");
        double vize1Sum = 0;
        for(int i = 0;i<index;i++) {
            vize1Sum = (vize1Sum + Double.valueOf((Integer)studentInfo[i][2]));
        }
        vize1Sinifortalamasi = vize1Sum / index;

        for(int i = 0;i<index;i++) {
            vize2Sum = (vize2Sum + Double.valueOf((Integer)studentInfo[i][3]));
        }
        vize2Sinifortalamasi = vize2Sum / index;

        for(int i = 0;i<index;i++) {
            if( Double.valueOf((Integer)studentInfo[i][2])>=vize1Sinifortalamasi&& Double.valueOf((Integer)studentInfo[i][3])>=vize2Sinifortalamasi) {
                System.out.println(studentInfo[i][0]);
            }

        }

    }


    public static double vize2Ortalama() {
        double vize2Sum = 0;
        System.out.println();
        System.out.println("vize2 ortalama : ");
        double vize2Ortalama;
        for(int i = 0;i<index;i++) {
            System.out.println(studentInfo[i][3]);
            vize2Sum = (vize2Sum + Double.valueOf((Integer)studentInfo[i][3]));
        }

        vize2Ortalama = vize2Sum / index;
        System.out.println(vize2Sum);
        System.out.println(index);
        return vize2Ortalama;

    }
    public static double standartSapmaHesapla() {
        System.out.println();
        System.out.print("vize2 standart sapmasi : ");
        double sum = 0;
        double sapma = 0;

        for (int i = 0; i < index; i++) {
            sum += Double.valueOf((Integer)studentInfo[i][3]);
        }
        double mean = sum / (index);

        for (int j = 0; j < index; j++) {
            sapma +=  Math.pow((Double.valueOf((Integer)studentInfo[j][3]) - mean), 2);
        }

        double karelerToplamiOrtalamasi = (sapma) / (index);
        double standartSapma = (Math.sqrt(karelerToplamiOrtalamasi));

        return standartSapma;
    }

    public static void genelHarfNotuBelirle() {
        System.out.println();
        double percent;
        System.out.print("genel Harf Notlar : ");
        for(int i = 0;i<index;i++) {
            percent = (Double.valueOf((Integer)studentInfo[i][2])*0.4)+(Double.valueOf((Integer)studentInfo[i][3])*0.6);
            if(percent>=88) {
                System.out.println(studentInfo[i][0]);
                System.out.println("ortalamasi : "+ percent);
                System.out.println("genelHarfNotu : AA");
                System.out.println("*******");
            }
            else if(percent<=87 && percent>= 80) {
                System.out.println(studentInfo[i][0]);
                System.out.println("ortalamasi : "+ percent);
                System.out.println("genelHarfNotu : BA");
                System.out.println("*******");
            }
            else if(percent<=79 && percent>= 73) {
                System.out.println(studentInfo[i][0]);
                System.out.println("ortalamasi : "+ percent);
                System.out.println("genelHarfNotu : BB");
                System.out.println("*******");
            }
            else if(percent<=72 && percent>= 66) {
                System.out.println(studentInfo[i][0]);
                System.out.println("ortalamasi : "+ percent);
                System.out.println("genelHarfNotu : CB");
                System.out.println("*******");
            }
            else if(percent<=65 && percent>= 60) {
                System.out.println(studentInfo[i][0]);
                System.out.println("ortalamasi : "+ percent);
                System.out.println("genelHarfNotu : CC");
                System.out.println("*******");
            }
            else if(percent<=59 && percent>= 55) {
                System.out.println(studentInfo[i][0]);
                System.out.println("ortalamasi : "+ percent);
                System.out.println("genelHarfNotu :DC");
                System.out.println("*******");
            }
            else if(percent<=54 && percent>= 50) {
                System.out.println(studentInfo[i][0]);
                System.out.println("ortalamasi : "+ percent);
                System.out.println("genelHarfNotu : DD");
                System.out.println("*******");
            }
            else if(percent<=49) {
                System.out.println(studentInfo[i][0]);
                System.out.println("ortalamasi : "+ percent);
                System.out.println("genelHarfNotu : FF");
                System.out.println("*******");

            }
        }
    }

    public static void main(String[] args) {
        studentInfoleriEkle();
        bayOgrenciYuzdesi();
        bayanOgrenciYuzdesi();
        mevcutOgrenciBilgileri();
        double bayOgrenciYuzdesi = bayOgrenciYuzdesi();
        double bayanOgrenciYuzdesi = bayanOgrenciYuzdesi();
        System.out.println("bayOgrenciYuzdesi : "+bayOgrenciYuzdesi+"%");
        System.out.println("bayanOgrenciYuzdesi : "+bayanOgrenciYuzdesi+"%");
        ortalamaUstuOgrenciadlari();
        genelHarfNotuBelirle();
        double vize2Ortalama = vize2Ortalama();
        System.out.println(vize2Ortalama);
        double standartSapma = standartSapmaHesapla();
        System.out.println(standartSapma);

    }




}