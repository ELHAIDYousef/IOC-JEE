package net.elhaid.metier;

import net.elhaid.dao.IDao;

/**
 * @author ELHAID Yousef
 **/
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {}

    @Override
    public double clacul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI / 180;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
