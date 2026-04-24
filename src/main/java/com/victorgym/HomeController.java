package com.victorgym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * Mapea la raíz ("/") a la página de inicio (index.html)
     */
    @GetMapping("/")
    public String home() {
        return "index";
    }

    /**
     * Mapea "/inicio" a la página de inicio (index.html)
     */
    @GetMapping("/inicio")
    public String inicio() {
        return "index";
    }

    /**
     * Mapea "/tienda" a la página de tienda (tienda.html)
     */
    @GetMapping("/tienda")
    public String tienda() {
        return "tienda";
    }

    /**
     * Mapea "/servicios" a la página de inicio (sección servicios)
     */
    @GetMapping("/servicios")
    public String servicios() {
        return "index";
    }

    /**
     * Mapea "/contacto" a la página de inicio (sección contacto)
     */
    @GetMapping("/contacto")
    public String contacto() {
        return "index";
    }

    /**
     * Mapea "/nosotros" a la página de inicio (sección nosotros)
     */
    @GetMapping("/nosotros")
    public String nosotros() {
        return "index";
    }
}
