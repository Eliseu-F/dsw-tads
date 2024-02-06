package br.senac.tads.dsw.exemploaula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author eliseu.fsantos1
 */
@Controller
public class DadosPessoaisController {
    
    @GetMapping("/exemplo-dinamico")
    public String mostrarTela(Model model){
        
        DadosPessoais dados = new DadosPessoais();
        
        dados.setNome("Roronoa Zoro");
        dados.setDataNascimento( LocalDate.parse("1600-04-08"));
        dados.setEmail("Roronoa.Zoro@senacsp.edu");
        dados.setTelefone("(11) 944325454");
        
        model.addAttribute("dados",dados);
        model.addAttribute("DataHora", LocalDateTime.now());
        return "dados-template";
    }
}
