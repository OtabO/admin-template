package zhangsx.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zhangsx.authority.AuthorityConstant;
import zhangsx.authority.Permission;
import zhangsx.bean.BlackUserDO;
import zhangsx.bean.Page;
import zhangsx.bean.SearchDO;
import zhangsx.bo.BlackUserBO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangsx on 2016/12/23.
 */
@Controller
public class BlackUserControllor {
    private BlackUserBO blackUserBO=new BlackUserBO();
    @RequestMapping(value = "/blackUser/list",method = RequestMethod.POST)
    @Permission(code= AuthorityConstant.RETRIEVE)
    @ResponseBody
    public Page<BlackUserDO> list(@RequestBody SearchDO<BlackUserDO> blackUser){

        BlackUserDO blackUserDO=blackUser.getData();
        List<BlackUserDO> blackUserDOs=blackUserBO.retrieve(blackUserDO);

        Page<BlackUserDO> page=new Page<BlackUserDO>();
        page.setData(blackUserDOs);
        page.setCurrentPage(blackUser.getToPage());
        page.setNextMaxShowPage(3);
        page.setPreviouMaxShowPage(3);
        page.setTotalPageSize(13);
        return page;
    }
}
