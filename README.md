# PBO_Modul7
 
 *Latihan 1 : Hari dalam seminggu
 
 Membuat sebuah string array yang akan menginisialisasi 7 hari dalam seminggu. 
 
 Disini jenis arraynya bertipe integer maka di buat int[] ages = new int [100] lalu tipe string untuk hari dengan String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"} setelah itu kita menggunakan perulangan for untuk menampilkan hari tersebut dengan program for(int i=0; i<gays.length; i++) lalu dibuatkan outputnya dengan System.out.println(days[i]). 
 
 *Latihan 2 : Nomor terbesar
 
 Mengunakan BufferedReader atau JOptionPane, tanyakan kepada user untuk 10 nomor. lalu gunakan array untuk menyimpan 10 nomor. dan input terbesar yang telah diberikan user. 
 
 Disini kita menggunakan BufferedReader, sebelumnya kita buat tipe dari array, disini bertipe integer int[] nilai = new int[] setelah itu kita tambahkan max dengan tipe integer. lalu kita menggunakan 2 buah for. for pertama untuk mengiputkan nilainya kita gunakan program for(int i=0; i<nilai.length; i++) lalu kita masukkan program untuk outputnya System.out.print("Nilai ke-"+(i+1)+" ="), dan for selanjutnya bentuk programnya for(int i=0; i<nilai.length; i++) lalu kita akan gunakan if else untuk menentukan nilai max dengan if(nilai[i]>max, lalu max = nilai[i] setelah itu kita outputkan lagi nilai max tersebut. 
 
 *Latihan 3 : Buku Alamat 
 
 Array Multidimensi yang menyatakan sebuah buku alamat
 
 Tentukan tipe datanya terlebih dahulu disini kita menggunakan array 2 dimensi. String[][] ntry = {{"Florence", "735-1234", "Manila"}, {"Joyce", "983-3333", "Quezon City"}, {"Becca", "456-3322", "Manila"}}. Setelah itu dilanjutkan perulangan for untuk menampilkan output buku alamatnya. for(int i=0; i<3; i++) lalu kita buatkan program outputnya
 
 System.out.println("Name : "+entry[i][0]);
 System.out.println("Tel.# : "entry[i][1]);
 System.out.println("Address : "+entry[i][2]);
 
