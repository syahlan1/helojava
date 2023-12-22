/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellowoe;

/**
 *
 * @author SYAHLAN
 */
public class Hellowoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//      System.out.println("sdasads");
        char e = 'E';
        char k = 'K';
        char o = 'O';
    
        System.out.print(e);
        System.out.print(k);
        System.out.println(o);
        
        //BOOLEAN
        boolean benar = true;
        boolean salah = false;
        
        System.out.println(salah);
        
        //STRING
        String firstname = "Muhamad";
        String lastname = "Syahlan";
        String fullname = firstname + " " +lastname;
        
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(fullname);
        
        //VARIABLE
        String nama;
        nama = "Syahlan";
        
        nama = "Jordi";
        System.out.println(nama);
        
        var namo = "Joni";
        var umur = 20;
        
        System.out.println(namo);
        System.out.println(umur);
        
        final var bahasa = "PHP";
        System.out.println(bahasa);
        
        //TIPE DATA PRIMITIF
        int angka = 20;
        
        Integer angka2 = angka;
        
        int angka3 = angka2;

        short iniShort = angka2.shortValue();
        long iniLong = angka2.longValue();
        float iniFloat = angka2.floatValue();
        
        Long amount = 100000L;
        amount.byteValue();
        
        //TIPE DATA ARRAY
        String[] arrayString;
        arrayString = new String[3];
        
        arrayString[0] = "Jhon";
        arrayString[1] = "Budi";
        arrayString[2] = "Supri";
        
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        
        arrayString[0] = "Iwan";
        System.out.println(arrayString[0]);
        //atau
        String[] arrayString2 = new String[3];
        //atau
        String[] arrayNama = {
            "Heri", "Hera", "Hero"
        };
        int[] arrayInt = new int[]{
            2,3,1,4,1,2,2
        };
        long[] arrayLong = {
            100L, 29L, 32L
        };
        
        System.out.println(arrayNama.length);
        
        //array dalam array
        String[][] members = {
            {"rehan", "rohim", "rizki"},
            {"jobeng", "joji", "jay"},
            {"Qory"}
        };
        System.out.println(members[2][0]);
        
        //OPERASI ARITMATIKA
        int a = 100;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        int c = 100;
        
        System.out.println(c += 10);
        System.out.println(c -= 10);
        System.out.println(c *= 10);
        
        int d = 100;
        
        d++;
        System.out.println(d);
        
        d--;
        System.out.println(d);
        
        //perbandingan
        
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        
        
        //OPERASI BOOLEAN
        var absen = 80;
        var nilaiAkhir = 80;
        
        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;
        
        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
        
        //IF STATEMENT
        if(absen >= 75 && nilaiAkhir >= 75){
            System.out.println("Kamu Lulus!");
        } else{
            System.out.println("Kamu gk Lulus :(");
        }
        
        if(absen >= 90 && nilaiAkhir >= 90){
            System.out.println("Nilai Kamu A");
        }
        else if(absen >= 80 && nilaiAkhir >= 80){
            System.out.println("Nilai Kamu B");
        }
        else if(absen >= 70 && nilaiAkhir >= 70){
            System.out.println("Nilai Kamu C");
        }
        else if(absen >= 60 && nilaiAkhir >= 60){
            System.out.println("Nilai Kamu D");
        }
        else{
            System.out.println("Nilai Kamu E");
        }
        
        //SWITCH STATEMENT 
        var nilai2 = "A";
        
        switch(nilai2){
            case "A":
                System.out.println("Wow nilai kamu bagus banget");
                break;
            case "B":
            case "C":
                System.out.println("Nilai kamu lumayan bagus");
                break;
            case "D":
                System.out.println("Nilai kamu jelek");
                break;
            default:
                System.out.println("Kamu salah jurusan");
        }
        //switch Lambda
        switch(nilai2){
            case "A" -> System.out.println("Nilai Kau Elok Nian");
            case "B", "C" -> System.out.println("Nilai Kau Lumayan Elok");
            case "D" -> System.out.println("Nilai Kau Buruk");
            default -> {
                System.out.println("Salah Jurusan Kau Ko");
            }
        }
        //atau dengan menggunakan yield
        String ucapan;
        switch(nilai2){
            case "A" -> ucapan = "Nilai Kau Elok Nian";
            case "B", "C" -> ucapan = "Nilai Kau Lumayan Elok";
            case "D" -> ucapan = "Nilai Kau Buruk";
            default -> {
                ucapan = "Salah Jurusan Kau Ko";
            }
        }
        System.out.println(ucapan);
        
        ucapan = switch(nilai2){
            case "A" : yield "NILAIMU BAGUS KALI";
            case "B", "C" : yield "NILAIMU BAGUS";
            case "D" : yield "NILAIMU JELEK";
            default : yield "SALAH JURUSAN";
        };
        System.out.println(ucapan);
        
        //TERNARY OPERATOR
        var nilai3 = 75;
        String ucapan2 = nilai3 >= 75 ? "Selamat Anda Lulus" : "Selamat Anda Gak Lulus";
        
        System.out.println(ucapan2);
        
        //FOR LOOP
        for (var counter = 1; counter <= 5; counter++){
            System.out.println("Perulangan ke-" + counter);
            
        }
        
        //WHILE LOOP
        var counter2 = 1;
        while(counter2 <= 3){
            System.out.println("Perulangan " + counter2);
            counter2++;
        }
        
        //DO WHILE LOOP
        var counter3 = 10;
        do{
            System.out.println("Perulangan " + counter3);
            counter3++;
        } while(counter3 <= 3);
        
        //BREAK & CONTINUE
        var counter4 = 1;
        
        while(true){
            System.out.println("Perulangan yang ke " +counter4);
            counter4++;
            
            if(counter4 > 10){
                break;
            }
            
        }
        System.out.println("Berhenti");
        
        //CONTINUE
        for(var counter5 = 1; counter5 <= 10; counter5++){
            if(counter5 % 2 == 0){
                continue;
            }
            System.out.println("Perulangan ganjil : " + counter5);
        }
        
        
        //FOR EACH
        String[] names = {
          "Ahmad","Joni", "Arsi",
            "Prodgram", "jAmaN", "Naw"
        };
        
        for(var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("==FOR EACH==");
        for(var name : names){
            System.out.println(name);
        }
        
        //method
        halloWoy();
        
        echoSlam("Echo", "Slam");
        
        var result1 = sum(200, 100);
        System.out.println(result1);
        
        System.out.println(hitung(100, "-", 200));
        System.out.println(hitung(100, "+", 200));
        System.out.println(hitung(100, "*", 200));
        
        int[] valeyus = {80, 80, 50, 50, 50};
        congrats("Aki", valeyus);
        congrats("Budi", 90,80,80,80);
        
        sayHello();
        sayHello("Tuti");
        sayHello("Huma ", "Idar");
        
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
        
    }
    
    //METHOD
    static void halloWoy(){
        System.out.println("INI METHOD");
    }
    
    //METHOD PARAMETER
    static void echoSlam(String firstName, String lastName){
        System.out.println("Duarr " + firstName + lastName);
    }
    
    //METHOD RETURN VALUE
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }
    
    static int hitung(int value1, String operasi, int value2){
        switch (operasi) {
            case "+" : return value1 + value2;
            case "-" : return value1 - value2;
            default : return 0;
        }
    }
    
    //METHOD VARIABLE ARGUMENT
    static void congrats(String name, int... values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total / values.length;
        
        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Kamu Lulus");
        } else{
            System.out.println("Maaf " + name + ", Kamu gk Lulus");
        }
    }
    
    //METHOD OVERLOADING
    static void sayHello(){
        System.out.println("Hello");
    }
    
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+ firstName + lastName);
    }
    
    //RECURSIVE METHOD
    static int factorialLoop(int value){
        var result = 1;
        
        for(var counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }
    
    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        } else{
            return value * factorialRecursive(value - 1);
        }
    }
    
    
    
}
