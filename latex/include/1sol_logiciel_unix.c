void main() {
  int desc;
  int desc_verr;
  char i;

  while ((desc_verr = creat(“/tmp/ver01“, 000)) == -1);
	
  section_critique();

  close(desc_verr);
  unlink((“/tmp/ver01“);
}