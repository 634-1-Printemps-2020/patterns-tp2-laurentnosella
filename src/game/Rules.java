package game;

import materials.CoinState;

import java.util.List;

public class Rules {

  private static Rules uniqueInstance = null;

  private Rules() {
  }

  public static Rules getInstance(){
    if (uniqueInstance == null){
      uniqueInstance = new Rules();
    }
    return uniqueInstance;
  }

  /**
   * Cette méthode permet de déterminer si une suite d'états de pièce permet de gagner à une partie
   * @param states liste d'états pour un joueur
   * @return true si un joueur a gagné, false sinon
   */
  public boolean checkWin(List<CoinState> states) {
    for (int i = 0; i < states.size(); i++) {
      if (states.get(i)==CoinState.HEADS & states.get(i+1)==CoinState.HEADS & states.get(i+2)==CoinState.HEADS || states.get(i)==CoinState.TAILS & states.get(i+1)==CoinState.TAILS & states.get(i+2)==CoinState.TAILS){
        return true;
      }
    }
    return false;
  }
}
