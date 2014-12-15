public Object retire()
{
  Object item;
  occupé.P();
  item = buffer[occupé];
  libre.V();
}