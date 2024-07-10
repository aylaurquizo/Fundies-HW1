
//represents the different types of hosing in the game
interface IHousing {
  
}

//represents the housing type: Hut
class Hut implements IHousing {
  int capacity;
  int population;
  
  Hut(int capacity, int population) {
    this.capacity = capacity;
    this.population = population;
  }
}

//represents the housing type: Inn
class Inn implements IHousing {
  String name;
  int capacity;
  int population;
  int stalls;
  
  Inn(String name, int capacity, int population, int stalls) {
    this.name = name;
    this.capacity = capacity;
    this.population = population;
    this.stalls = stalls;
  }
}

//represents the housing type: Castle
class Castle implements IHousing {
  String name;
  String familyName;
  int population;
  int carriageHouse;
  
  Castle(String name, String familyName, int population, int carriageHouse) {
    this.name = name;
    this.familyName = familyName;
    this.population = population;
    this.carriageHouse = carriageHouse;
  }
}


//represents the different types of travel in the game
interface ITravel {
  
}

//represents traveling on a horse
class Horse implements ITravel {
  IHousing to;
  IHousing from;
  String name;
  String color;
  
  Horse(IHousing to, IHousing from, String name, String color) {
    this.to = to;
    this.from = from;
    this.name = name;
    this.color = color;
  }
}

//represents traveling in a carriage
class Carriage implements ITravel {
  IHousing to;
  IHousing from;
  int tonnage;
  
  Carriage(IHousing to, IHousing from, int tonnage) {
    this.to = to;
    this.from = from;
    this.tonnage = tonnage;
  }
}

class ExamplesTravel {
  IHousing hovel = new Hut(5,1);
  IHousing winterfell = new Castle("Winterfell", "Stark", 500, 6);
  IHousing crossroads = new Inn("Inn At The Crossroads", 40, 20, 12);
  IHousing hut2 = new Hut(10, 9);
  IHousing inn2 = new Inn("The Best Inn", 80, 45, 20);
  IHousing castle2 = new Castle("The Castle", "Smith", 400, 10); 
  
  ITravel horse1 = new Horse(hovel, crossroads, "BoJack", "brown");
  ITravel carriage1 = new Carriage(winterfell, inn2, 10);
  ITravel horse2 = new Horse(castle2, inn2, "Lucy", "black");
  ITravel carriage2 = new Carriage(crossroads, castle2, 40);
}
