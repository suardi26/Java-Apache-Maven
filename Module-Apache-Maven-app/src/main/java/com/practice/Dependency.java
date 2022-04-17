package com.practice;

import com.google.gson.Gson;


/**
    - Proyek aplikasi jarang sekali berdiri sendiri, biasanya membutuhkan tool atau library dari pihak lain.
    - Tanpa build tool seperti Apache Maven, untuk menambahkan library dari luar,  dapat dilakukan secara manual
      misalnya dengan mendownload file jar dari library lain kemudian disimpan didalam project kita, hal ini agak rumit untuk
      mengaturnya apalagi dependency yang akan digunakan memerlukan dependency lain lagi.
    - Namun Apache Maven mendukung dependency management, dimana kita tidak perlu manage secara manual proses penambahan
      dependency (tool atau library) ke dalam proyek aplikasi kita (jadi kita tinggal memasukan dependency dalam xml tag
      dan Apache Maven akan mendownloadnya dan apabila dibutuhkan dependency lain maka Apache Maven akan mendownlodnya.

    - Dependency Scope
        - Pada saat kita membutuhkan dependency ke project Maven, maka harus menentukan scope dependency tersebut,
          ada banyak scope yang ada di maven, berikut ada beberapa scope yang sering digunakan, misalnya :
            - compile, adalah scope default, Compile artinya dependency tersebut akan digunakan untuk build project,
              test project dan menjalankan project.
            - test, ini adalah scope untuk test project, dependency tersebut hanya akan di include di bagian test project.
            - untuk scope lainnya dapat dipelajari pada dokumentasi dari apache maven.

    - Repository
        - Pada saat menambahkan dependency, Apache Maven mencari pada repositories default (bawaan maven) dimana tersedia banyak
          sekali dependency yang dapat didownload dan digunakan dalam project kita.
        - Namun ketika kita ingin membuat repositories sendiri dan menambahkan repositories tersebut pada project kita, itu
          dapat dilakukan. contohnya :

            <repositories>
                <repository>
                    <id>id-repository</id>
                    <name>nama-repository</name>
                    <url>http://------</url>
                </repository>
            </repositories>

        - Ketika kita menambahkan repositories yang kita buat pada project kita maka Apache Maven tidak hanya mencari dependency
          (file JAR) pada repositories default namun juga mencari dependency pada alamat url dari repositories yang telah
          di tambahkan.
 */
public class Dependency {
    public static void main(String[] args) {

        Gson gson = new Gson();
        Product product1 = new Product("Pantene");

        // konfersi object ke JSON.
        String json = gson.toJson(product1);
        System.out.println(json);
    }


}
