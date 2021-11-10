import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
//      printPercentages(bayOgreciYuzdesi(ogrenciBilgiEkle()));
//       System.out.println("====================================");
//        ortalamaUstuOgrenciAdlari(ogrenciBilgiEkle());
//        System.out.println("====================================");
//        farkliIsim(ogrenciBilgiEkle());
//        System.out.println("====================================");
//
//         notLandirma(ogrenciBilgiEkle());
//        System.out.println("====================================");
        addedArraryPrinter();



       }
       public static String[][]ogrenciBilgiEkle(){
           System.out.println("Number of students should be more than 3");
           System.out.println("Enter number of students in the class:");

           int numberOfStudentsInClass=scanner.nextInt();
           scanner.nextLine();

//
//          String[][] array={{"Ibrahim","Saleh","Bouba","Yussuf","Fatima","Dilek"," Mustafa"}
//                  ,{"MALE","MALE","FEMALE","FEMALE","Male ","Male"," Female"},
//                  {"90","87","55","100","67","89","75",},
//                  {"50","100","30","86","78","78","98"}
//          };
           String [][]array=new String[numberOfStudentsInClass][numberOfStudentsInClass];
           for (int i=0;i< array.length;++i) {
               System.out.println("Enter student name:");
               String studentName = scanner.nextLine().toUpperCase();


               System.out.println("Enter student gender");
               String gender = scanner.nextLine().toUpperCase();
               System.out.println("Enter vize notu");
               String vizeNotu = scanner.nextLine();

               System.out.println("Enter final notu");
               String finalNotu = scanner.nextLine();
               scanner.nextLine();
               int a=0;
               array[a][i] = studentName;

               array[a=a+1][i] = gender;

               array[a=a+1][i] = vizeNotu;

               array[a=a+1][i] = finalNotu;

           }
        scanner.nextLine();

           System.out.println("name:       Gender:      vize:     Final");
           for (int i=0;i<array.length;i++){
               int a=0;
               System.out.print(array[a][i]+"          ");
               System.out.print(array[a=a+1][i]+"           ");
               System.out.print(array[a=a+1][i]+"      ");
               System.out.println(array[a=a+1][i]);
               a=0;
           }
return array;
       }
  public static float bayOgreciYuzdesi(String [][]array){
        String [][]myArray=new String[array.length][array.length];

     myArray=array.clone();
      int maleSaysisi=0;
      int femaleSayisi=0;
      System.out.println("===========================\n" +
              "Reults:");
     for (int i=0;i< myArray.length;++i){
         int a=1;
         if (myArray[a][i].equals("MALE")){
             maleSaysisi = maleSaysisi + 1;
         }
         else if (myArray[a][i].equals("FEMALE")){
             femaleSayisi=femaleSayisi+1;
         }
     }
     float calculateMalePercentage=0;
     float calculateFemalePercentage=0;
      calculateMalePercentage=(float) (((maleSaysisi)*100))/(maleSaysisi+femaleSayisi);
     calculateFemalePercentage=(float) (((femaleSayisi)*100))/(maleSaysisi+femaleSayisi);

return calculateMalePercentage;
    };
//    public static float bayanOgreciYuzdesi(String [][]array){
//        String [][]myArray=new String[array.length][array.length];
////        for (int i=0;i< myArray.length;++i){
////            myArray[0][0]=array[0][0];
////        }
//        myArray=array.clone();
//        int maleSaysisi=0;
//        int femaleSayisi=0;
//        for (int i=0;i< myArray.length;++i){
//            int a=1;
//            if (myArray[a][i].equals("male")){
//                maleSaysisi = maleSaysisi + 1;
//            }
//            else if (myArray[a][i].equals("female")){
//                femaleSayisi=femaleSayisi+1;
//            }
//        }
//        float calculateMalePercentage=0;
//        float calculateFemalePercentage=0;
//        calculateMalePercentage=(float) (((maleSaysisi)*100))/(maleSaysisi+femaleSayisi);
//        calculateFemalePercentage=(float) (((femaleSayisi)*100))/(maleSaysisi+femaleSayisi);
//
//        return calculateFemalePercentage;
//    };
    public static void printPercentages(float male){
        float femalePercentage=100-male;
        System.out.println("the male percentage is: "+male+" %");
        System.out.println("the female percentage is: "+femalePercentage+" %");
    }

    public static void ortalamaUstuOgrenciAdlari(String [][]array){
        float number;
        int counter=0;
        float vizePuanlari=0;
        float vizeOrtalamasi=0;
        float number2;
        float finalPuanlari=0;
        float finalOrtalamasi=0;
        String [][]myArray=array.clone();
        for (int i=0;i<myArray.length;++i){
            number= Float.parseFloat(myArray[2][i]);
            number2 = Float.parseFloat(myArray[3][i]);
           vizePuanlari=vizePuanlari+number;
           finalPuanlari=finalPuanlari+number2;
           counter++;
        }
       vizeOrtalamasi= (float)(vizePuanlari/counter);
        finalOrtalamasi=(float) (finalPuanlari/counter);
        int a=1;
        System.out.println("===========================\n" +
                "Reults:");
        System.out.println("The average of the students in the vize exam="+vizeOrtalamasi);
        System.out.println("The average of the students in the vize exam="+finalOrtalamasi);
        System.out.println("Students with grades higher than the average are");
        for (int i=0;i< myArray.length;++i){

if (vizeOrtalamasi<Integer.parseInt(array[2][i])&&finalOrtalamasi<Integer.parseInt(array[3][i])){

    System.out.println((a)+". "+array[0][i]);
    a = a + 1;


}

        }

    }

   public static void farkliIsim(String [][] array) {
       int farkli_isim = 1;
//String[][] arrayHolder =array.clone();
       for (int i = array.length - 1; i > 0; i--) {
           if (!Objects.equals(array[0][i], array[0][i - 1])) {
               farkli_isim++;
           }
       }
       if (farkli_isim == 1) {
           System.out.println("All names are the same:");
       } else {
           System.out.println("there are " + farkli_isim + " different names in the database");
       }
   }

   public static void notLandirma(String [][] array){
      float toplam=0;
      float vizepuani=0;
      float finalPuani=0;
       System.out.println("===========================\n" +
               "Reults:");
      for (int i=0;i<array.length;++i){
          vizepuani= (float) ((Float.parseFloat(array[2][i]))*(0.4));
          finalPuani =(float) ((Float.parseFloat(array[3][i]))*(0.6));
          toplam=vizepuani+finalPuani;
          if(toplam>100){
              System.out.println("Hata var.");
          }
       else  if (toplam>=88){
             System.out.println(array[0][i]+" ---> AA");
         }
         else if (toplam>=80 && toplam<=87){
             System.out.println(array[0][i]+" ---> BA");
         }
         else if (toplam>=73 && toplam<=79){
             System.out.println(array[0][i]+" ---> BB");
         }
         else if (toplam>=66 && toplam<=72){
             System.out.println(array[0][i]+" ---> CB");
         }
         else if (toplam>=60 && toplam<=65){
             System.out.println(array[0][i]+" ---> CC");
         }
         else if (toplam>=55 && toplam<=59){
             System.out.println(array[0][i]+" ---> DC");
         }
         else if (toplam>=50 && toplam<=54){
             System.out.println(array[0][i]+" ---> DD");
         }
         else {
             System.out.println(array[0][i]+"---> FF");
         }
      }
   }
   public static void addedArraryPrinter(){
     String[][] array = ogrenciBilgiEkle();
       System.out.println("====================================");
        printPercentages(bayOgreciYuzdesi(array));
       System.out.println("====================================");
        farkliIsim(array);
       System.out.println("====================================");
        notLandirma(array);
       System.out.println("====================================");


   }
}
