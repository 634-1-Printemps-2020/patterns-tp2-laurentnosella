package materials;

import java.util.Random;

public class Coin {

  private CoinState coinState;

  private static Coin uniqueInstance = null;

  private Coin() {
  }

  public static Coin getInstance(){
    if (uniqueInstance == null){
      uniqueInstance = new Coin();
    }
    return uniqueInstance;
  }

  /**
   * Change l'état de la pièce.
   * 50% de probabilité d'obtenir HEADS, 50% de probabilité d'obtenir TAILS
   */
  public void throwCoin() {
    //Source : https://stackoverflow.com/questions/15285643/how-to-get-a-50-50-chance-in-random-generator
    Random random = new Random();
    if (random.nextBoolean()) {
      coinState = CoinState.HEADS;
    } else {
      coinState = CoinState.TAILS;
    }
  }

  public CoinState getState() {
    return coinState;
  }


}
