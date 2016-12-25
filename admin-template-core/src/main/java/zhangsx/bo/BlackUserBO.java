package zhangsx.bo;

import zhangsx.bean.BlackUserDO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangsx on 2016/12/25.
 */
public class BlackUserBO {
    public List<BlackUserDO> retrieve(BlackUserDO blackUserDO){

        List<BlackUserDO> blackUserDOs=new ArrayList<BlackUserDO>();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        for(int i=0;i<10;i++){
            BlackUserDO b=new BlackUserDO();
            b.setType("DID");
            b.setValue("assds"+i);
            blackUserDOs.add(b);
        }
        return blackUserDOs;
    }
}
