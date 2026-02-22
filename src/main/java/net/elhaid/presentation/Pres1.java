package net.elhaid.presentation;

import net.elhaid.dao.DaoImpl;
import net.elhaid.metier.MetierImpl;

/**
 * @author ELHAID Yousef
 **/
public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("res: "+ metier.calcul());

    }
}
