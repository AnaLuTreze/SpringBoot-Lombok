package ana.franco.Projeto3Lombok.controle;


import ana.franco.Projeto3Lombok.modelo.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class LivrariaControle {

    @GetMapping("/")
    public String mensagem(){
        return "Olá Bem vindo a nossa Livraria";
    }

    @GetMapping("/Livro")
    public Livro getLivro(){
        Livro livro = new Livro();
        livro.setNome("Harry Potter: O prisioneiro de Askaban");
        livro.setQuantidade(1);
        livro.setAutor("J.K Rowlling");
        livro.setAnoDePublicacao(2004);
        livro.setCodigo(010101);
        livro.setValor(63);
        return livro;
    }

    @GetMapping("/listadelivros")

    public ArrayList<Livro> getListaLivros(){

       Livro livro1 = new Livro();
        livro1.setNome("Harry Potter: O prisioneiro de Askaban");
        livro1.setQuantidade(1);
        livro1.setAutor("J.K Rowlling");
        livro1.setAnoDePublicacao(2004);
        livro1.setCodigo(010101);
        livro1.setValor(3);

        Livro livro2 = new Livro();
        livro2.setNome("Harry Potter: E o cálice de fogo");
        livro2.setQuantidade(1);
        livro2.setAutor("J.K Rowlling");
        livro2.setAnoDePublicacao(2005);
        livro2.setCodigo(020202);
        livro2.setValor(63);

        ArrayList<Livro> lista = new ArrayList<>();

        lista.add(livro1);
        lista.add(livro2);

        return lista;
    }// fecha o método getListaProdutos
}//fim



