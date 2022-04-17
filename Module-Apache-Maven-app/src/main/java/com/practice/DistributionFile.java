package com.practice;

import com.google.gson.Gson;


/**
    - Secara default, maven mendukung pembuatan distribution file menggunakan lifecycle 'package'.
    - Akan tetapi, hasil distribution filenya berupa file jar yang berisikan binary code dari project kita, dan dependency lain
      yang mendukung project kita tidak dimasukan sehingga tidak bisa langsung dijalankan.
    - Ada banyak plugin yang dapat digunakan untuk membuat distribution file di Maven, salah satu plugin yang dapat digunakan
      untuk membuat distribution file beserta dependency lain yang mendukung project kita adalah Assembly Plugin, sehinnga
      pada saat mem-package project kita menjadi file jar maka akan include file jar/library pendukung dari file jar kita.
    - untuk dokumentasi dari Assembly plugin dapat dilihat pada :
      https://maven.apache.org/plugins/maven-assembly-plugin/usage.html
    - Pada saat kita ingin membuat distribution file, kita bisa menggunakan perintah 'mvn package assembly:single'.
    - Berikut konfigurasi yang dapat ditambahkan ketika membuat distribution file dengan menggunakan assembly plugin :

        - menambahkan konfigurasi pada bagian plugin di file pom.xml :
                 <plugins>
                    <plugin>

                         <artifactId>maven-assembly-plugin</artifactId>
                         <version>3.3.0</version>
                         <configuration>
                             <descriptorRefs>
                                <descriptorRef>jar-with-dependencies</descriptorRef>
                             </descriptorRefs>
                         </configuration>

                    <plugin>
                <plugins>

        - Menggabungkan project kita dengan dependency/library lain menjadi satu distribusi file dengan
          menambahkan code executions pada plugin assembly di dalam file pom.xml.
                <plugins>
                    <plugin>
                     [...]
                     <executions>
                        <execution>
                         <id>make-assembly</id> <!-- this is used for inheritance merges -->
                         <phase>package</phase> <!-- bind to the packaging phase -->
                             <goals>
                                <goal>single</goal>
                             </goals>
                         </execution>
                     </executions>
                    [...]
                    <plugin>
                </plugins>

        - Ketika membuat sebuah aplikasi maka kita dapat menentukan main filenya (Main Class) dimana, kita dapat menambahkan main
          file pada Assembly plugin dengan menambahkan konfigurasi archive pada configuration di plugin assembly di dalam
          file pom.xml.
            <plugins>
                <plugin>
                    [...]
                        <configuration>
                         <archive>
                             <manifest>
                                <mainClass>DistributionFile</mainClass>
                             </manifest>
                         </archive>
                        </configuration>
                    [...]
                <plugin>
            </plugins>

        - Untuk menjalankan file jar yang sudah dipackage dapat menggunakan perintah : 'java -jar target/namaFileJar'.
        - Ketika menjalankan file jar yang tidak include dengan dependency/librarynya maka akan error
         'java -jar target/Java-Apache-Maven-1.0-SNAPSHOT.jar' karena tidak ditentukan main filenya/main classnya terlebih dahulu.
        - Namun ketika menjalankan file jar include dengan depedency/librarynya maka akan berhasil.
          'java -jar target/Java-Apache-Maven-1.0-SNAPSHOT-jar-with-dependencies.jar' karena ditentukan Main Class
          terletak dimana terlebih dahulu.
        - Dengan dibuatnya distribusi file dalam bentuk jar maka file jar tersebut dapat di jalankan di server atau dapat
          dibuat docker image ataupun kebutuhan lainnya.
*/
public class DistributionFile {

    public static void main(String[] args) {
        Product product = new Product("Distribution File");
        Gson gson = new Gson();
        System.out.println(gson.toJson(product));
    }

}
