
//represents types of soups
interface ISoup {
  
}

//represents the broth in this soup
class Broth implements ISoup {
  String type;
  
  Broth(String type) {
    this.type = type;
  }
}

//represents the ingredients in this soup
class Ingredient implements ISoup {
  ISoup more;
  String name;
  
  Ingredient(ISoup more, String name) {
    this.more = more;
    this.name = name;
  }
}

class ExamplesSoup {
  
  ISoup yummy = new Ingredient(new Ingredient(new Ingredient(new Broth(
      "chicken"), "carrots"), "celery"), "noodles");
  ISoup noThankYou = new Ingredient(new Ingredient(new Ingredient(new Broth(
      "vanilla"), "horseradish"), "hot dogs"), "plum sauce");
  
}