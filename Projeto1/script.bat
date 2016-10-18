SET CLASSPATH=.;C:\Users\mgb\Desktop\Projeto\lib\antlr-4.5.3-complete.jar;%CLASSPATH%
SET PATH=.;C:\Program Files\Java\jdk1.8.0_65\bin\;%PATH%
java org.antlr.v4.Tool Projeto.g4
javac Projeto*.java
java org.antlr.v4.runtime.misc.TestRig Projeto pgm -gui input.txt
