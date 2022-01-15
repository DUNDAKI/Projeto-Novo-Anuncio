package com.vigjoaopaulo.projetonovo.CLIENT;

import com.vigjoaopaulo.projetonovo.MODEL.Anuncios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AnuncioAPI {

    @GET("listar/")
    Call<List<Anuncios>> getAnuncios();

    @POST("inserir/")
    Call<Anuncios> addAnuncio(@Body Anuncios anuncios);
}
