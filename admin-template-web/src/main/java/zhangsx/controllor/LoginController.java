package zhangsx.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import zhangsx.authority.AuthorityConstant;
import zhangsx.bean.User;

import javax.servlet.http.HttpSession;

/**
 * Created by zhangsx on 2016/12/25.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String login(User user, HttpSession httpSession) {
        if (user != null && "admin".equals(user.getUserName()) && "admin123".equals(user.getPassword())) {
            //success
            user.setAuthority(AuthorityConstant.CREATE|AuthorityConstant.RETRIEVE|AuthorityConstant.DELETE|AuthorityConstant.UPDATE);
            String next = "/blackUser.html";
            if(httpSession!=null){
                httpSession.setAttribute("userInfo",user);
            }
            return "redirect:" + next;
        } else {
            //fail
            return "/login.html";
        }
    }
}
