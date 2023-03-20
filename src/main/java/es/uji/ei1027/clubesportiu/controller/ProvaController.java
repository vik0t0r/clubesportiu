package es.uji.ei1027.clubesportiu.controller;

import es.uji.ei1027.clubesportiu.dao.ProvaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import es.uji.ei1027.clubesportiu.dao.NadadorDao;


@Controller
@RequestMapping("/prova")
public class ProvaController {

    private ProvaDao provaDao;

    @Autowired
    public void setProvaDao(ProvaDao provaDao) {
        this.provaDao = provaDao;
    }

    // Operacions: Crear, llistar, actualitzar, esborrar
    // ...

    @RequestMapping("/list")
    public String listNadadors(Model model) {
        model.addAttribute("proves", provaDao.getProves());
        return "prova/list";
    }


}