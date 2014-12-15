all: latex/01_Introduction.log.tex latex/02_machine_virtuelle_processus.log.tex latex/03_Cooperation_acces_ressources.log.tex latex/04_concurrence.log.tex latex/01_Introduction.pdf latex/02_machine_virtuelle_processus.pdf latex/03_Cooperation_acces_ressources.pdf latex/04_concurrence.pdf latex/assemblage/01_Introduction_ass.pdf latex/assemblage/02_machine_virtuelle_processus_ass.pdf latex/assemblage/03_Cooperation_acces_ressources_ass.pdf latex/assemblage/04_concurrence_ass.pdf

clean:
	cd latex; rm *.aux *.dvi *.nav *.log *.toc *.snm *.out; cd assemblage; rm *.aux *.dvi *.nav *.log *.toc *.snm *.out; cd ../..

latex/01_Introduction.log.tex: latex/01_Introduction.tex
	svn log --xml latex/01_Introduction.tex > tmp.out; xsltproc svnlog.xslt tmp.out > latex/01_Introduction.log.tex; rm tmp.out

latex/02_machine_virtuelle_processus.log.tex: latex/02_machine_virtuelle_processus.tex
	svn log --xml latex/02_machine_virtuelle_processus.tex > tmp.out; xsltproc svnlog.xslt tmp.out > latex/02_machine_virtuelle_processus.log.tex; rm tmp.out

latex/03_Cooperation_acces_ressources.log.tex: latex/03_Cooperation_acces_ressources.tex
	svn log --xml latex/03_Cooperation_acces_ressources.tex > tmp.out; xsltproc svnlog.xslt tmp.out > latex/03_Cooperation_acces_ressources.log.tex; rm tmp.out

latex/04_concurrence.log.tex: latex/04_concurrence.tex
	svn log --xml latex/04_concurrence.tex > tmp.out; xsltproc svnlog.xslt tmp.out > latex/04_concurrence.log.tex; rm tmp.out

latex/01_Introduction.pdf: latex/01_Introduction.tex latex/inc_entete.tex
	cd latex; pdflatex --aux-directory=./aux 01_Introduction.tex; cd ..

latex/02_machine_virtuelle_processus.pdf: latex/02_machine_virtuelle_processus.tex latex/inc_entete.tex
	cd latex; pdflatex --aux-directory=./aux 02_machine_virtuelle_processus.tex; cd ..

latex/03_Cooperation_acces_ressources.pdf: latex/03_Cooperation_acces_ressources.tex latex/inc_entete.tex
	cd latex; pdflatex --aux-directory=./aux 03_Cooperation_acces_ressources.tex; cd ..

latex/04_concurrence.pdf: latex/04_concurrence.tex latex/inc_entete.tex
	cd latex; pdflatex --aux-directory=./aux 04_concurrence.tex; cd ..

latex/assemblage/01_Introduction_ass.pdf: latex/assemblage/01_Introduction_ass.tex latex/01_Introduction.pdf
	cd latex/assemblage; pdflatex 01_Introduction_ass.tex; cd ../..

latex/assemblage/02_machine_virtuelle_processus_ass.pdf: latex/assemblage/02_machine_virtuelle_processus_ass.tex latex/02_machine_virtuelle_processus.pdf
	cd latex/assemblage; pdflatex 02_machine_virtuelle_processus_ass.tex; cd ../..

latex/assemblage/03_Cooperation_acces_ressources_ass.pdf: latex/assemblage/03_Cooperation_acces_ressources_ass.tex latex/03_Cooperation_acces_ressources.pdf
	cd latex/assemblage; pdflatex 03_Cooperation_acces_ressources_ass.tex; cd ../..

latex/assemblage/04_concurrence_ass.pdf: latex/assemblage/04_concurrence_ass.tex latex/04_concurrence.pdf
	cd latex/assemblage; pdflatex 04_concurrence_ass.tex; cd ../..
