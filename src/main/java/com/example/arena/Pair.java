package com.example.arena;

public class Pair<T>{
  private T left;
  private T right;

  public Pair(T left, T right){
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Pair<?> pair = (Pair<?>) o;

    if (left.equals(pair.left) && right.equals(pair.right)
        || left.equals(pair.right) && right.equals(pair.left)){
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result += (left != null ? left.hashCode() : 0);
    result += (right != null ? right.hashCode() : 0);

    return result;
  }

  public static void main(String[] args) {



  }
}
