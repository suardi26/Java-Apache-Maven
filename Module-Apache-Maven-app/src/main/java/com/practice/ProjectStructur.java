package com.practice;
/**
     - Maven mendukung pembuatan berbegai macam project dengan mudah.
     - Pembuatan project di maven menggunakan archetype, dimana archetype adalah sebuah template project.
     - Kita dapat menggunakan archetype yang telah disediakan oleh maven, atapun bisa membuat template archetype sendiri.
     - Untuk dokumentasi mengenai archetypes dapat di kunjungi pada halaman web
       https://maven.apache.org/introducion/introduction-to-archetypes.html
     - Untuk membuat Project menggunakan archetype yang disediakan oleh java dapat menggunakan perintah :
     - mvn archetype:generate => digunakan untuk memilih template project (archetype).
     - maven-archetype-quickstart => merukapan template project (archetype) yang sangat sederhana.

     - Struktur Project Apache Maven terdiri dari src dan target, dimana src terdiri dari 2 directori yaitu file dan test,
       file digunakan untuk menyimpan source code aplikasi sedangkan test digunakan untuk menyimpan source code unit test.
       dan di dalam folder main terdapat folder java dikarenakan maven bisa digunakan dengan bahasa pemrograman kotlin dan
       lain-lain sehingga folder di dalam main disesuaikan dengan bahasa pemrograman yang digunakan.
     - Dan didalam folder main terdapat folder java yang dapat digunakan untuk membuat package ataupun sourcode java,
       dan didalam test pun sama terdapat folder java yang digunakan untuk membuat package ataupun sourcode java unit test.
     - Pada saat melakukan compilasi apache maven akan mengcompile source codenya ke dalam directory target, ketika compile
       tanpa apache maven directory target ini adalah directory out.
     - Terdapat file pom.xml yang digunakan untuk menyimpan deklarasi Apache Maven, maka semua konfigurasi & deklarasi dependency
       dan konfigurasi lainnya disimpan pada pom.xml.
 */
public class ProjectStructur {
    public static void main(String[] args) {
        System.out.println("suardi daud manda");
    }
}
