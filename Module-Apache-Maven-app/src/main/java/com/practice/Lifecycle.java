package com.practice;
/**
    - Maven bekerja dengan konsep lifecycle.
    - Untuk menjalankan lifecycle, kita dapat menggunakan perintah : mvn namalifecycle
    - Lifecycle akan menjalankan banyak plugin, baik plugin dari maven, atau kita bisa tambahkan plugin lain.
    - Untuk dokumentasi mengenai lifecycle dapat di kunjungi pada halaman web
      https://maven.apache.org/guides/introduction-to-the-lifecycle.html
    - Berikut adalah beberapa lifecycle yang biasa digunakan :
         - clean untuk menghapus folder target (tempat untuk menyimpan hasil dari kompilasi).
         - compile untuk melakukan kompilasi sourcode ke binary.
         - test-compile untuk melakukan kompilasi sourcode test ke binary.
         - compile test-compile untuk melakukan kompalasi pada sourcode menjadi binary di main dan juga di test sekaligus.
         - test untuk menjalankan unit test.
         - package untuk membuat distribution file aplikasi.
         - install untuk menginstall project ke local repository, sehingga bisa digunakan di project lain di local.
           (secara default ketika kita ingin membuat project dan ingin di include pada project lain itu tidak bisa, maka dari itu
           harus di install terlebih dahulu sehingga tersimpan ke local repository.
         - deploy untuk deploy project ke remote repository di server.
 */
public class Lifecycle {
}
