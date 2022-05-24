package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotEmpty(message = "Preencha o campo corretamente.")
  //@CPF(message = "'${validatedValue}' é inválido!")
  private String cpf;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String endereco;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 1, max =4, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String numero;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String cidade;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 2, max =2, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String estado;

  @NotNull(message = "Prencha o campo corretamente.")
  @Past(message = "Data '${validatedValue}' é inválida.")
  private LocalDate dataDeNascimento;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 8, max =14, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String contatoCelular;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 8, max =14, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String contatoRecado;

}
