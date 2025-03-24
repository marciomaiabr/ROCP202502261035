cls
rmdir /s /q "C:\temp\mmbin"
mkdir "C:\temp\mmbin"
javac -d "C:/temp/mmbin" -cp .;..;../src/;../lib/; ../src/pkgs/pkgExes/Exe001.java
java -Duser.language=ja -Duser.region=JP -cp .;..;C:/temp/mmbin;../lib/; pkgs.pkgExes.Exe001 qqc
pause