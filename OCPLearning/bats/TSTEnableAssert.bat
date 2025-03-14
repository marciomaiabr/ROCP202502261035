cls
rmdir /s /q "C:\temp\mmbin"
mkdir "C:\temp\mmbin"
javac -d "C:/temp/mmbin" -cp .;..;../src/; ../src/pkgs/pkgExes/Exe001.java
java -ea:pkgs.pkg8.pkg81.pkg811... -cp .;..;C:/temp/mmbin; pkgs.pkgExes.Exe001
pause