package com.practice;

import com.google.gson.Gson;

/**
    - Pada saat aplikasi kita sudah sangat besar, kita dapat membuat aplikasi dalam bentuk modular.
    - Misal kita pisahkan module model/data, controller, view, service, repository, dan lain lain.
    - Dan Maven mendukung pembuatan project multi module.
    - Untuk membuat module baru, di dalam project yang sudah ada, kita hanya tinggal membuat folder baru, lalu menambahkan
      setting pom.xml di folder tersebut.
    - Module harus memiliki parent, dimana parentnya adalah project diatas folder tersebut, dimana parentnya yaitu project
      yang pertama kali kita buat contoh pada project ini parentnya adalah 'Java-Apache-Maven'.
    - Selanjutnya, di parentnya pun, module harus include artinya memberi informasi bahwa project ini multi module.
    - Jadi ketika project 'Java-Apache-Maven' di jadikan  multi module maka tidak bisa digunakan lagi untuk menyimpan source
      code di dalam parent secara langsung tapi harus didalam module dan type project/parent diganti dari default 'jar'
      menjadi 'pom', dengan menambahkan pada pom.xml yang ada di parentnya : <packaging>pom</packaging>
             <groupId>Suardi-Daud-Manda</groupId>
             <artifactId>Java-Apache-Maven</artifactId>
             <version>1.0-SNAPSHOT</version>
             <packaging>pom</packaging>
        - jadi langkah yang pertama membuat konfigurasi module (membuat pom.xml ditiap modulenya) :

            <!-- Disesuaikan dengan 'groupId','artifactId','version' dari parentnya -->
            <parent>
             <groupId>Suardi-Daud-Manda</groupId>
             <artifactId>Java-Apache-Maven</artifactId>
             <version>1.0-SNAPSHOT</version>
            </parent>

            <artifactId>nama Module Biasanya sama dengan nama foledernya 'Module-Apache-Maven-app</artifactId>

        - Dan pada pom.xml yang ada pada parent dapat ditambahkan nama-nma modulesnya sebagai berikut :
            <modules>
                <module>Module-Apache-Maven-app</module>
                <module>Module-Apache-Maven-data</module>
            </modules>
        - Dan dependency yang ada di parent tidak perlu lagi di tambahkan pada setiap module karena dependency yang ada di parent
          dapat langsung juga digunakan pada setiap modulenya.
        - Secara default menggunakan multi module maka kita tidak dapat mengakses data yang berada pada module lain, namun
          ketika ingin membutuhkan data dari module lain dapat menambahkan di depencynya :
                <dependencies>
                    <dependency>
                        <groupId>Suardi-Daud-Manda</groupId>
                        <artifactId>Module-Apache-Maven-data</artifactId>
                        <version>${project.version}</version>
                    </dependency>
                </dependencies>
        - jadi contoh diatas ketika module 'Module-Apache-Maven-app' ingin menggunakan class product yang ada pada
          'Module-Apache-Maven-data' maka dapat menambahkan dependency seperti diatas pada pom.xml yang ada pada module
          'Module-Apache-Maven-app', dimamna untuk 'groupId' sesuai parent dan 'artifactId' & 'versi' adalah nama dan versi module
          yang akan digunakan datanya.
 */
public class MultiModuleProject {
    public static void main(String[] args) {
        Product product = new Product("Hostinger");
        Gson gson = new Gson();
        System.out.println(gson.toJson(product));
    }

}
