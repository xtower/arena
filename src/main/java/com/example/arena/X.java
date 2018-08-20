package com.example.arena;

public class X {
  int a = 10;

  public static X m(X param){
    param = new X();
    param.a = 7;
    return param;
  }

  public X(){

  }

  public static void main(String[] args) {

  X x = new X();
  X y = m(x);

  System.out.println(x.a);
  System.out.println(y.a);

}
}
