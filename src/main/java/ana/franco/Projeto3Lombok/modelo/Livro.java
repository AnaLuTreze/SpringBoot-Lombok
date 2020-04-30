package ana.franco.Projeto3Lombok.modelo;


import lombok.*;

/**
 *
 * @author Ana Luisa Franco
 * @since 3/05/2020 15h.
 * @version 1.0
 *
 */
@ToString
@NoArgsConstructor //construtor sem argumento
@AllArgsConstructor // construtor com argumento

public class Livro {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private int quantidade;

    @Getter @Setter
    private double codigo;

    @Getter @Setter
    private int anoDePublicacao;

    @Getter @Setter
    private String autor;

    @Getter @Setter
    private double valor;
}
