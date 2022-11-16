import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("\n\nWELCOME !!\n\n");
    
    FireType f1 = new FireType("Charmander", 100, 50);
    GrassType g1 = new GrassType("Bulbasaur", 100, 50);
    WaterType w1 = new WaterType("Squirtle", 100, 50);

    Random rand = new Random();
    int rng = 0, counter = 1;

    System.out.println("BATTLE 1: Bulbasaur (Grass Type) vs. Charmander (Fire Type)\n\n");
    while (g1.getHP() > 0 && f1.getHP() > 0) {
      if (g1.getHP() > 0 && f1.getHP() > 0 && counter%2 == 1) { // alternates turns between the two monsters
        rng = rand.nextInt(5);
        
        if (rng == 4) { // randomly allows the monster to do its special move since there is no user input
          g1.special();
          System.out.println("");
        }
        else if (rng == 1) { // randomly allows the grass type monster to do its rest move since there is no user input
          g1.rest();
          System.out.println("");
        }
        else {
          g1.attack(f1);
          System.out.println("");
        }
      }
      else if (g1.getHP() > 0 && f1.getHP() > 0 && counter%2 == 0) {
        rng = rand.nextInt(5);
        if (rng == 4) { // randomly allows the monster to do its special move since there is no user input
          f1.special();
          System.out.println("");
        }
        else {
          f1.attack(g1);
          System.out.println("");
        }
      }
      else { // if the HP of one of the monsters is 0, the loop breaks
        break;
      }

      counter++;
    }

    g1.restoreHealth();
    f1.restoreHealth();
    counter = 1;

    System.out.println("\n");

    System.out.println("BATTLE 2: Charmander (Fire Type) vs. Squirtle (Water Type)\n\n");
    while (f1.getHP() > 0 && w1.getHP() > 0) {
      if (f1.getHP() > 0 && w1.getHP() > 0 && counter%2 == 1) { // alternates turns between the two monsters
        rng = rand.nextInt(5);
        
        if (rng == 4) { // randomly allows the monster to do its special move since there is no user input
          f1.special();
          System.out.println("");
        }
        else {
          f1.attack(w1);
          System.out.println("");
        }
      }
      else if (f1.getHP() > 0 && w1.getHP() > 0 && counter%2 == 0) {
        rng = rand.nextInt(5);
        
        if (rng == 4) { // randomly allows the monster to do its special move since there is no user input
          w1.special();
          System.out.println("");
        }
        else {
          w1.attack(f1);
          System.out.println("");
        }
      }
      else { // if the HP of one of the monsters is 0, the loop breaks
        break;
      }
      
      counter++;
    }

    f1.restoreHealth();
    w1.restoreHealth();
    counter = 1;

    System.out.println("\n");

    System.out.println("BATTLE 3: Squirtle (Water Type) vs. Bulbasaur (Grass Type)\n\n");
    while (w1.getHP() > 0 && g1.getHP() > 0) {
      if (w1.getHP() > 0 && g1.getHP() > 0 && counter%2 == 1) { // alternates turns between the two monsters
        rng = rand.nextInt(5);
        
        if (rng == 4) { // randomly allows the monster to do its special move since there is no user input
          w1.special();
          System.out.println("");
        }
        else {
          w1.attack(g1);
          System.out.println("");
        }
      }
      else if (w1.getHP() > 0 && g1.getHP() > 0 && counter%2 == 0) {
        rng = rand.nextInt(5);
        
        if (rng == 4) { // randomly allows the monster to do its special move since there is no user input
          g1.special();
          System.out.println("");
        }
        else if (rng == 1) { // randomly allows the grass type monster to do its rest move since there is no user input
          g1.rest();
          System.out.println("");
        }
        else {
          g1.attack(w1);
          System.out.println("");
        }
      }
      else { // if the HP of one of the monsters is 0, the loop breaks
        break;
      }
      
      counter++;
    }

    w1.restoreHealth();
    g1.restoreHealth();
    counter = 1;

    System.out.println("");
  }
}
