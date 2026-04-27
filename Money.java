// Money.java
class Money{
  final int value;

  Money(int initialValue){
    value = initialValue;
  }

  Money add(Money obj){
    int sum = value + obj.value;
    
    return new Money(sum);
  }

  Money minus(Money obj){
    int subtraction = value - obj.value;

    return new Money(subtraction);
  }
}