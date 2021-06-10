package br.saojudas.sdm21_1.calculadorad3.presenter;

import android.view.View;

import br.saojudas.sdm21_1.calculadorad3.model.Calculadora;
import br.saojudas.sdm21_1.calculadorad3.view.MainView;

public class MainPresenter implements Presenter{
    private Calculadora model;
    private MainView view;

    public MainPresenter(MainView view){
        this.view = view;
        model = new Calculadora();
    }

    @Override
    public void onCreate() {
        model = new Calculadora();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    public void calcular(String valor1, String valor2, String operador){
        model.setValor1(valor1);
        model.setValor2(valor2);
        model.setOperador(operador);
        model.calculo();
        this.configurarView();
    }

    public void configurarView(){
        view.configurarView(model.getValor1(), model.getValor2(),
                model.getOperador(), model.getResultado());
    }

    public String getResultado(){
        return model.getResultado();
    }
}
