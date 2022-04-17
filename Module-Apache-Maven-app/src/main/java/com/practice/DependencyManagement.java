package com.practice;

/**
    - Pada Saat Project kia sudah sangat besar, dan mengunkin menggunakan banyak dependency.
    - Namun pada saat terdapat banyak dependency, dan terjadi salah menggunakan dependency yang sama
      namun versinya berbeda-beda maka bisa saja mengakibatkan error ataupun aplikasi kita tidak
      berjalan.
    - Maven mempunyai fitur untuk menangani masalah yang ada diatas yaitu fitur dependency management,
      dimana kita dapat memasukan daftar dependency di parent module beserta versinya, lalu menambahkan
      dependency tersebut di module tanpa harus menggunakan versinya, sehingga mengakibatkan versi dari
      dependency nya akan selalu sama setiap modulenya.
    - secara otomatis versi dependency akan sama dengan yang ada di dependency menagement di parent module.
    - Untuk menambahkan dependency management kita tinggal memasukan semua dependency yang ada di parent/
      project ke tag <dependencyManagement>allDepedencies</dependencyManagement>
    - kita dapat juga menambahkan dependency module bawaan ke dalam dependency management, misalnya :
      kita membutuhkan class Product pada module 'Module-Apache-Maven-data' maka dapat juga ditmbahkan pada
      depedency management seperti :
        <dependencies>
            <dependency>
            <groupId>Suardi-Daud-Manda</groupId>
            <artifactId>Module-Apache-Maven-data</artifactId>
            <version>${project.version}</version>
            </dependency>
        </dependencies>
    - Sehingga dengan adanya dependency Management tidak diperlukan menambahkan versi dependency dari setiap
      module yang menggunakan dependency yang telah ditambahkan pada dependency Management di parent.
    - Sehingga dapat disumpulkan bahwa semua dependency yang ada pada dependency management dapat digunakan
      di setiap modul namun memiliki versi yang sama.
 */
public class DependencyManagement {
}
