package com.practice;

/**
    - Pada saat membuat project biasanya akan ada 2 jenis code yang akan kita buat, yaitu code program dan code testingnya, Maven
      mendukung hal tersebut.
    - Untuk menjalankan compilasi program dapat menggunakan perintah 'mvn compile' untuk compile semua code program yang ada
      misalnya 100 file maka akan dicompile semua, dan untuk compile semua code program unit test maka dapat menggunakan perintah
      'mvn test'.
    - Untuk mem-package Project dapat dilakukan dengan perintah 'mvn package', project dapat di package menjadi sebuah
      file misalnya Java Archive (JAR), Web Application Resource (WAR), ataupun Enterprise Applicatioon Archive (EAR).
    - Proses compilasi program, compilasi unit test serta mem-package sebuah project sudah di otomatisasi oleh Apache Maven,
      sehingga dengan menggunakan perintah 1 baris dapat dilakukan semuanya contohnya : 'mvn clean compile test package'.
 */
public class BuildProject {
}
