## Java Apache Maven

### Build Automatiion

- <samp>Build Automation adalah proses meng-otomatisasi tahapan pembuatan software dan hal-hal yang berhubungan</samp>
  
  <samp>denganya, seperti : kompilasi source code menjadi binary code, mem-package binary code menjadi distribution</samp>
  
  <samp>file misalnya dari file '.class' menjadi '.jar' (Java Archive), membuat dokumentasi, menjalankan</samp> 
  
  <samp>automated test hingga manajemen dependency.</samp>

- <samp>Semua proses diatas tidak perlu dibuat manual lagi namun dapat di otomatisasi dengan Bulid Automation.</samp>
  
- <samp>Pada saat menggunakan IDE seperti Intellij IDEA maka dapat dibantu melakukan kompilasi oleh IDE namun pada kenyataannya </samp>
  
  <samp>tidak mungkin membawa IDE pada server, jadi harus dilakukan compile dari source code menjadi binary file pada server namun </samp>
  
  <samp>tidak perlu secara manual dikarenakan dapat di otomatisasi dengan Build Automation.</samp>
  
- <samp>Mempackage (Packaging) Binary File menjadi Distribution File Misalnya pada java ada : '.jar' (Java Archive),</samp>

  <samp>'.ear' (Enterprise Archive), '.war' (Web Archive), dan packging ini dapat di otomatisasi dengan Build Automation</samp>
  
  <samp>dan tidak perlu manual.</samp>
  
- <samp>Jadi pada java dapat dilakukan Compile Doc dari Source Code menjadi Documentation dari source code tersebut, namun </samp>
  
  <samp>Compile Doc ini dapat diotomatisasi dengan Build Automation dan tidak perlu manual.</samp>
  
- <samp>Buiild AAutomation dapat menjalankan automated Test, karena pada saat membuat aplikasi tidak hanya membuat source code</samp> 

  <samp>aplikasi namun juga membuat source code unit testnya dan untuk proses testing akan dijalankan secara otomatis oleh</samp> 
  
  <samp>build automation dan test resultnya dapat dilihat juga.</samp> 
  
  <img src="https://github.com/suardi26/Java-Apache-Maven/blob/main/Automated%20Test%20%26%20Management%20Dependency_page-0001.jpg" alt="Automated Test & Management Dependency"/>
  
- <samp>Pada saat kita membuat aplikasi kita biasanya membutuhkan beberapa library/dependecies dan untuk mengaturnya secara </samp>

  <samp>otomatis baik dari download library-nya secara otomatis, dicombine bersama project yang dibuat dan dicompile serta </samp>
  
  <samp>di running secara otomatis, hal ini lebih mudah dibandingkan pada saat melakukannya secara manual seperti mendownload </samp>
  
  <samp>library berupa file jar secara manual dan di compile bersama project kita secara manual.</samp>
   
 - <samp>Ada beberapa Build Automation Tool :</samp>
 
    - <samp>Apache Maven.</samp>
    
    - <samp>Apache Ivy.</amp>
    
    - <samp>Gradle.</samp>

### Apache Maven

- <samp>Apache Maven adalah salah satu build automation yang open source dan free.</samp>

- <samp>Apache Maven menggunakan XML untuk mendefenisikan build scriptnya.</samp>

- <samp>Apache Maven sangat populer di kalangan Developer Java.</samp>

- <samp>Apache Maven running menggunakan JVM (Java Virtual Machine) sebagai fondasi dasar, Apache Maven dibuild menggunakan java.</samp>

- <samp>Apache Maven mendukung build automation untuk banyak teknologi, seperti :<samp>

  - <samp>Java</samp>
  
  - <samp>Kotlin</samp>
  
  - <samp>Groovy</samp>

  - <samp>Scala</samp>
  
  - <samp>dll.</samp>
