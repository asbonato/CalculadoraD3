package br.saojudas.sdm21_1.calculadorad3.viewmodel;

import androidx.databinding.ObservableField;
import br.saojudas.sdm21_1.calculadorad3.model.Calculadora;

public class MainViewModel implements ViewModel {
    private Calculadora model;
    public final ObservableField<String> valor1 = new ObservableField<>();
    public final ObservableField<String> valor2 = new ObservableField<>();
    public final ObservableField<String> operador = new ObservableField<>();
    public final ObservableField<String> resultado = new ObservableField<>();

    public MainViewModel(){
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

    public void calcular(){
        model.setValor1(this.valor1.get());
        model.setValor2(this.valor2.get());
        model.setOperador(this.operador.get());
        model.calculo();
        this.resultado.set(model.getResultado());
    }
}
