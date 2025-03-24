cd C:\Users\Administrador\git\ROCP202502261035\OCPLearning\bats\
::cls
::rmdir /s /q "C:\temp\mmbin"
::mkdir "C:\temp\mmbin"
::javac -d "C:/temp/mmbin" -cp .;..;../src/;../lib/; ../src/pkgs/pkgExes/Exe001.java
java -cp .;..;C:/temp/mmbin;../lib/; pkgs.pkgExes.Exe001
::pause