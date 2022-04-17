package com.practice;

/**
    - Maven mendukung properties untuk menyimpan data konfigurasi.
    - Fitur  dari Apache Maven ini sangat memudahkan kita, dibandingkan melakukan hardcode di konfigurasi maven,
       kita dapat membuatnya dalam tag properties.contohnya :

      <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>14</maven.compiler.source>
        <maven.compiler.target>14</maven.compiler.target>
        <junit.version>4.13.2</junit.version>
      </properties>

    - Pada Contoh diatas, <junit.version> adalah tag nama properties, sedangkan '4.13.2' adalah value propertisnya.
    - Misalnya digunakan untuk memilih version dari dependency, misal pada contoh diatas maka tinggal memanggil
      tag nama properties <junit.version> jika ingin menggunakan junit versi '4.13.2' yang merupakan value dari propertiesnya.
    - jadi data-data konfigurasi dapat disimpan di bagian properties yang ada di dalam file (pom.xml) dengan
      tag nama propertiesnya serta value propertisnya.
    - dan untuk menggunakan dari properties dapat memanggil tag nama propertiesnya seperti format ini : '${namaProperties}'.
      misalnya sesuai dengan contoh yang ada diatas : <version>${junit.version}</version>
 */
public class MavenProperties {
}
