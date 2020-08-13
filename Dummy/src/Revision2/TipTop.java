package Revision2;

public class TipTop
{
  static final Integer i1 = 1;
  final Integer i2 = 2;
  Integer i3 = 3;

  class Inner 
  {
     final Integer i6 = 6;
     Integer i7 = 7;

     Inner()
     {
        System.out.print(i6 + i7);
     }
  }
  public static void main(String[] args)
  {
    final Integer i4 = 4;
    Integer i5 = 5;
    TipTop t = new TipTop();
    Inner in = t.new Inner();

  }
}