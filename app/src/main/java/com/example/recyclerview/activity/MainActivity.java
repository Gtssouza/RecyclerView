package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView ;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Criar listagem de filmes
        this.criarFilmes();

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());//Gerenciador de layout
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter( adapter);
    }

    public void criarFilmes(){
        Filme filme = new Filme("Ação","2018","Thor");
        listaFilmes.add(filme);

        filme = new Filme("Aventura","2018","Batman");
        listaFilmes.add(filme);

        filme = new Filme("Ficção","2018","Homem-Aranha");
        listaFilmes.add(filme);

        filme = new Filme("Comédia","2018","Capitão-América");
        listaFilmes.add(filme);

        filme = new Filme("Romance","2018","Hulk");
        listaFilmes.add(filme);

        filme = new Filme("Drama","2018","Homem de Ferro");
        listaFilmes.add(filme);

        filme = new Filme("Ficção","2018","Gavião Arqueiro");
        listaFilmes.add(filme);

        filme = new Filme("Ação","2018","Viuva negra");
        listaFilmes.add(filme);
    }
}
