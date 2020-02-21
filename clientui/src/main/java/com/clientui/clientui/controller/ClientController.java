package com.clientui.clientui.controller;

import com.clientui.clientui.beans.ProductBean;
import com.clientui.clientui.proxies.MicroserviceProduitsProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MicroserviceProduitsProxy mProduitsProxy;

    @RequestMapping("/")
    public String acceuil(Model model){

        List<ProductBean> produits = mProduitsProxy.listeDesProduits();
        model.addAttribute("produits", produits);
        log.info("Récupération de la liste des produits");

        return "Acceuil";
    }
}
