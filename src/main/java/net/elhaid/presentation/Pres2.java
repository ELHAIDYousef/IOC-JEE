package net.elhaid.presentation;

import net.elhaid.dao.IDao;
import net.elhaid.metier.IMetier;

import java.io.File;
import java.util.Scanner;

/**
 * @author ELHAID Yousef
 **/
public class Pres2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("config.txt"));
        
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("Result: " + metier.calcul());
        
    }
}
