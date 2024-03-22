package com.desafio.helpers;

import java.util.HashMap;
import java.util.Map;

public class StringHelper {
    public Boolean testaPalindromo(String texto){
      String textoAuxiliar = texto.toLowerCase(); 
      String textoSemEspacos = textoAuxiliar.replaceAll(" ", "");
      int i = 0, j = textoSemEspacos.length()-1;
       Boolean palindromo = true;
       do{
          if(textoSemEspacos.charAt(i) == textoSemEspacos.charAt(j)){
            i++;
            j--;
          }else{
            palindromo = false;
          }    
       }while (palindromo && i<j); 
       return palindromo;
    }
    public Map<Character, Integer> contaOcorrenciasCaractere(String texto){
      String textoAuxiliar = texto.toLowerCase();  
      String textoSemEspacos = textoAuxiliar.replaceAll(" ", "");
      Map<Character, Integer> contaOcorrencias = new HashMap<>();
        for (int i =0; i < textoSemEspacos.length();i++) {
            Character caractere = textoSemEspacos.charAt(i); 
            contaOcorrencias.put(caractere, contaOcorrencias.getOrDefault(caractere, 0) + 1);
        }
        return contaOcorrencias;
    }
}
