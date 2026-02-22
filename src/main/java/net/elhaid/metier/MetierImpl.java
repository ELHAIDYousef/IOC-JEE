package net.elhaid.metier;

import net.elhaid.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ELHAID Yousef
 **/
@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("d2")
    private IDao dao;

    public MetierImpl( IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {}

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI / 180;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
