package br.edu.ufabc.palestra.mensagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MensagensController {

    @Autowired
    private Mensagens mensagens;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mostraFormulario(Model model) {
        Iterable<Mensagem> mensagens = this.mensagens.findAll();
        model.addAttribute("mensagens", mensagens);
        return "formulario";
    }

    @Transactional
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String salvaMensagem(Mensagem mensagem) {
        mensagens.save(mensagem);
        return "redirect:/";
    }

}
