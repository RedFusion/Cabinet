package ru.menkin.ea.controller;

import org.hibernate.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import ru.menkin.ea.model.*;
import ru.menkin.ea.utils.*;

import java.io.*;

//не работает переход после нажатия кнопки
@Controller
@RequestMapping(value = "/service")
public class CabinetController {

    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    private String enter(@RequestParam String login, @RequestParam String password) throws IOException {
        System.out.println("!!!!!!!!!!!!!Servlet!!!!!!!!!!!!");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Users where login = :code");
        query.setParameter("code", login);
        Users user = (Users) query.uniqueResult();

        if(!user.getPassword().equals(password)) {
            return "redirect:error";
        } else {
            return "redirect:cabinet";
        }
//        System.out.println(user.getPassword());
//
//        response.setStatus(200);
//
//        PrintWriter out = response.getWriter();
//        response.setContentType("text/plain");
//        out.close();

        // Get the values of all request parameters
//        Enumeration en = request.getParameterNames();

//        while(en.hasMoreElements()) {
//            // Get the name of the request parameter
//            String name = (String)en.nextElement();
//            out.println(name);
//
//            // Get the value of the request parameter
//            String value = request.getParameter(name);
//
//            // If the request parameter can appear more than once in the query string, get all values
//            String[] values = request.getParameterValues(name);
//
//            for (int i=0; i<values.length; i++) {
//                out.println(" " + values[i]);
//            }
//        }
    }

    @RequestMapping(value = "/cabinet", method = RequestMethod.GET)
    public ModelAndView cabinet(){

        ModelAndView modelAndView = new ModelAndView();
        //jsp name
        modelAndView.setViewName("cabinet");
        return modelAndView;
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ModelAndView error() {

        ModelAndView modelAndView = new ModelAndView();
        //jsp name
        modelAndView.setViewName("error");
        return modelAndView;
    }
}