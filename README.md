# mergePDFlib
this utility is able to merge PDF files into a single one

#how to build
1- open a terminal and run the following command:
	mvn clean compile assembly:single

2- then you can procede to run the command:
	mvn package

3- after the maven process will be finished you should the following jar inside target directory:
	mergePDF-1.0-SNAPSHOT-jar-with-dependencies.jar


#how to use
1- Copy the jar file inside the current directory where there are the pdf file you want to merge

2- Open a terminal in the current directory

3- run the following command:
	java -jar mergePDF-1.0-SNAPSHOT-jar-with-dependencies.jar file1.pdf file2.pdf file3.pdf

N.B. file1.pdf, file2.pdf, file3.pdf are the filename you want to merge; you can list as many files as you want.