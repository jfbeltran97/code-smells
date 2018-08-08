PROBLEMA: 
class Animal {
  private int numberOfLegs;

  ...

    public getNumberOfLegs() {
      return numberOfLegs;
    }
}

class Cat extends Animal {
  public getNumberOfLegs() {
    super.getNumberOfLegs();
  }
}

class GoldFish extends Animal {

  ...

    public getNumberOfLegs() {
      throw NotImplementedException();
    }
}

SOLUCIÓN:
interface LeggedAnimal{
    int getNumberOfLegs();
}

class Animal {
    ...
}

class Cat extends Animal implements LeggedAnimal{
  public int getNumberOfLegs() {
    ...
  }
}

class GoldFish extends Animal {
   ... 
}