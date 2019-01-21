package am.aca.list.controllers;

import am.aca.list.dao.UserDAO;
import am.aca.list.dta.ProductView;
import am.aca.list.entityes.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexPageController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getIndexPage() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("allUsers", UserDAO.getUserIdName());
        return modelAndView;
    }

    @RequestMapping(value = "users/{userId}", method = RequestMethod.GET)
    public ModelAndView getProductList(@PathVariable("userId") int id) {
        ModelAndView modelAndView = new ModelAndView("product");
        modelAndView.addObject("allUsers", UserDAO.getUserIdName());
        modelAndView.addObject("userName",UserDAO.getUserById(id));
        UserEntity user = UserDAO.getUserById(id);
        modelAndView.addObject("products",UserDAO.getProductsView(user));

        return modelAndView;
    }



}
