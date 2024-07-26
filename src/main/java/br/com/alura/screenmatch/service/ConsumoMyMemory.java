package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.model.DadosResposta;

import java.net.URLEncoder;

public class ConsumoMyMemory {

    public static String obterTraducao(String text){
        ConsumoApi consumo = new ConsumoApi();
        ConverteDados converteDados = new ConverteDados();

        String texto = URLEncoder.encode(text);
      String langpair = URLEncoder.encode("en|pt-br");

        String url = "https://api.mymemory.translated.net/get?q=" + texto + "&langpair=" + langpair;

        String json = consumo.obterDados(url);

        DadosResposta dadosResposta = converteDados.obterDados(json, DadosResposta.class);

        return dadosResposta.dadosTraducao().traducao();


    }

}
