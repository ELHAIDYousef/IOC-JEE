package net.elhaid.ext;

import net.elhaid.dao.IDao;
import org.springframework.stereotype.Component;

/**
 * @author ELHAID Yousef
 **/
@Component("d2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version captures. ");
        double t = 12;
        return t;
    }
}
