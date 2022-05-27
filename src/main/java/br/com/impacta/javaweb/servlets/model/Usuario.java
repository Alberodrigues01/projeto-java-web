package br.com.impacta.javaweb.servlets.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Usuario {

   private String nome;
   private String login;
   private String senha;
   private String email;

}
