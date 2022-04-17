## Java Apache Maven

### Build Automatiion

- <samp>Build Automation adalah proses meng-otomatisasi tahapan pembuatan software dan hal-hal yang berhubungan denganya, seperti :</samp>
  
  <samp>kompilasi source code menjadi binary code, mem-package binary code menjadi distribution file misalnya dari file '.class'</samp>
  
  <samp>menjadi '.jar' (Java Archive), membuat dokumentasi, menjalankan automated test hingga manajemen dependency.</samp>

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
  
  ---
  
-  <samp>Pada saat kita membuat aplikasi kita biasanya membutuhkan beberapa library/dependecies dan untuk mengaturnya secara </samp>

   <samp>otomatis baik dari download library-nya secara otomatis, dicombine bersama project yang dibuat dan dicompile serta </samp>
  
   <samp>di running secara otomatis, hal ini lebih mudah dibandingkan pada saat melakukannya secara manual seperti mendownload </samp>
  
   <samp>library berupa file jar secara manual dan di compile bersama project kita secara manual.</samp>
   
 - <samp>Ada beberapa Build Automation Tool :</samp>
 
    - <samp>Apache Maven.</samp>
    
    - <samp>Apache Ivy.</amp>
    
    - <samp>Gradle.</samp>
