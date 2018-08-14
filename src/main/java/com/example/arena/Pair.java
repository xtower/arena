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

    if (left != null ? !left.equals(pair.left) : pair.left != null) {
      return false;
    }
    return right != null ? right.equals(pair.right) : pair.right == null;
  }

  @Override
  public int hashCode() {
    int result = left != null ? left.hashCode() : 0;
    result = 31 * result + (right != null ? right.hashCode() : 0);
    return result;
  }

  public static void main(String[] args) {
    Pair<Creature> pair = new Pair<>(
        new Human(1,2,2,2,2,2,2,2),
        new Troll(1,2,2,2,2,2,2,2)
        );
  }
}
