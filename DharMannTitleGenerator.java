import java.util.Random;
import java.util.ArrayList;

public class DharMannTitleGenerator{
   public static void main(String[] args){
      compile();
   
   
   }
   public static void compile(){
     ArrayList<String> compiled = new ArrayList<String>();
     compiled.add(randomPerson() +  " " + randomVerb() + " " +  randomAdjective() + " " +  randomPerson() + ", instantly regrets it.");
     compiled.add(randomAdjective() +  " " + randomPerson() + " " +  randomVerb() +" " +   randomPerson() + ", lives to regret it.");
     compiled.add(randomPerson() +  " " + randomVerb() + " " +  randomAdjective() + " " +  randomPerson() + ", instantly regrets it.");
     compiled.add(randomPerson() +  " " + randomVerb() + " " +  randomAdjective() + " " +  randomPerson() + ", lives to regret it.");
     compiled.add(randomAdjective() +  " " + randomPerson() +" " +   randomVerb() + " " +  randomAdjective() + " "+ randomPerson() + ", instantly regrets it.");
     compiled.add(randomAdjective() +  " " + randomPerson() +" " +   randomVerb() + " " +  randomAdjective() +" "+   randomPerson() + ", lives to regret it.");
     compiled.add(randomPerson() + " " +  randomVerb() + " " +  randomNoun() + ", instantly regrets it.");
     compiled.add(randomPerson() +  " " + randomVerb() + " " +  randomAdjective() +" " +   randomNoun() + ", instantly regrets it.");
     compiled.add(randomAdjective() + " " +  randomPerson() +" " +  randomVerb() + " " +  randomNoun() + ", instantly regrets it.");
     compiled.add(randomPerson() + " " +  randomVerb() + " " +  randomNoun() + ", lives to regret it.");
     compiled.add(randomPerson() + " " +  randomVerb() +" " +   randomAdjective() +" " +   randomNoun() + ", lives to regret it.");
     compiled.add(randomAdjective() + " " +  randomPerson() + " " +  randomVerb() + " " +  randomNoun() + ", lives to regret it.");
     compiled.add(randomPerson() + " " +  randomVerb() + " " +  randomAdjective() + " " +  randomPerson() + ", ending will shock you.");
     compiled.add(randomAdjective() +" " +   randomPerson() +  " " + randomVerb() + " " +  randomPerson() + ", ending will shock you.");
     compiled.add(randomAdjective() + " " +  randomPerson() + " " +  randomVerb() + " " +  randomAdjective() + " "+  randomPerson() + ", instantly regrets it.");
     compiled.add(randomAdjective() +" " +   randomPerson() + " " +  randomVerb() + " " +  randomAdjective() + " "+  randomPerson() + ", lives to regret it.");
     compiled.add(randomPerson() +" " +   randomVerb() + " " +  randomNoun() + ", instantly regrets it.");
     compiled.add(randomPerson() + " " +  randomVerb() + " " +  randomAdjective() +" " +   randomNoun() + ", instantly regrets it.");
     compiled.add(randomAdjective() +" " +   randomPerson() +" " +   randomVerb() + " " +  randomNoun() + ", instantly regrets it.");
     compiled.add(randomPerson() + " " +  randomVerb() + " " +  randomNoun() + ", lives to regret it.");
     compiled.add(randomPerson() + " " +  randomVerb() +" " +   randomAdjective() +" " +   randomNoun() + ", lives to regret it.");
     compiled.add(randomAdjective() + " " +  randomPerson() + " " +  randomVerb() +" " +   randomNoun() + ", lives to regret it.");
     System.out.println(compiled.get(new Random().nextInt(compiled.size())));
   }
   
   public static String randomPerson(){
      ArrayList<String> person = new ArrayList<String>();
      // add more stuff here if you want
      person.add("Wife");
      person.add("Husband");
      person.add("Stepsister");
      person.add("Daughter");
      person.add("Girl");
      person.add("Son");
      person.add("Kid");
      person.add("Kid");
      person.add("Boy");
      person.add("Boyfriend");
      person.add("Girlfriend");
      person.add("Gold Digger");
      person.add("Kid");
      person.add("Student");
      person.add("Boss");
      person.add("Nerd");
      person.add("SSSniperwolf");
      person.add("Mom");
      person.add("Bully");
      person.add("Teen");
      person.add("Saleswoman");
      person.add("Husband's Sister");
      person.add("Wife's Sister");
      person.add("Husband's Brother");
      person.add("Babysitter");
      person.add("Grandpa");
      person.add("Dad");
      person.add("Father");
      return person.get(new Random().nextInt(person.size()));  
   }
   public static String randomAdjective(){
      ArrayList<String> adj = new ArrayList<String>();
      adj.add("Rich");
      adj.add("Spoiled");
      adj.add("Gamer");
      adj.add("Popular");
      adj.add("Shy");
      adj.add("Black");
      adj.add("Mean");
      adj.add("Pregnant");
      adj.add("Lazy");
      adj.add("Asian");
      adj.add("Latina");
      adj.add("Latino");
      adj.add("White");
      adj.add("Gay");
      adj.add("Trans");
      return adj.get(new Random().nextInt(adj.size()));
   }
   public static String randomVerb(){
      ArrayList<String> verb = new ArrayList<String>();
      verb.add("bullies");
      verb.add("steals");
      verb.add("cheats on");
      verb.add("laughs at");
      verb.add("fat shames");
      verb.add("shames");
      verb.add("tries to seduce");
      verb.add("abandons");
      verb.add("humiliates");
      verb.add("leaves");
      verb.add("judges");
      return verb.get(new Random().nextInt(verb.size()));
   }
   public static String randomNoun(){
      ArrayList<String> noun = new ArrayList<String>();
      noun.add("Fortnite");
      noun.add("car");
      noun.add("PS5");
      noun.add("Xbox");
      noun.add("Glasses");
      noun.add("Wheelchair");
      return noun.get(new Random().nextInt(noun.size()));
   }
   

}
