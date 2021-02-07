package club.banyuan.contorllers;

import club.banyuan.entily.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author edz
 * @version 1.0
 * @date 2021/1/12 4:17 下午
 */
@Controller
public class ViewControllor {
    @GetMapping("testview")
    public String testview(Admin admin, Model model) {
        model.addAttribute("username", admin.getUsername());
        model.addAttribute("password", admin.getPassword());
        return "WEB-INF/test";
    }

    @GetMapping("testview2")
    public ModelAndView testview2(Admin admin) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("WEB-INF/test");
        mv.addObject("username", admin.getUsername());
        mv.addObject("password", admin.getPassword());
        return mv;
    }

    @GetMapping("testview3")
    public ModelAndView testview3(Admin admin) {
        return new ModelAndView("WEB-INF/test", "Admin", admin);
    }

    @GetMapping("testforward")
    public String testforward() {
        return "forward:/testview";
    }

    @GetMapping("testredirect")
    public String testredirect() {
        return "redirect:index";
    }
}
