package br.saojudas.sdm21_1.calculadorad3.viewmodel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestMainViewModel {
    private MainViewModel viewModel;

    @Before
    public void setUp(){
        viewModel = new MainViewModel();
    }

    @Test
    public void testaSoma(){
        viewModel.valor1.set("1");
        viewModel.valor2.set("2");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("3", viewModel.resultado.get());
        viewModel.valor1.set("2");
        viewModel.valor2.set("1");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("3", viewModel.resultado.get());
    }

    @Test
    public void testaSomaNegativos(){
        viewModel.valor1.set("1");
        viewModel.valor2.set("-2");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("-1", viewModel.resultado.get());
        viewModel.valor1.set("-2");
        viewModel.valor2.set("-1");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("-3", viewModel.resultado.get());
    }

    @Test
    public void testaSubtracao(){
        viewModel.valor1.set("1");
        viewModel.valor2.set("2");
        viewModel.operador.set("-");
        viewModel.calcular();
        assertEquals("-1", viewModel.resultado.get());
        viewModel.valor1.set("2");
        viewModel.valor2.set("1");
        viewModel.operador.set("-");
        viewModel.calcular();
        assertEquals("1", viewModel.resultado.get());
    }

    @Test
    public void testaMultiplicacao(){
        viewModel.valor1.set("1");
        viewModel.valor2.set("2");
        viewModel.operador.set("*");
        viewModel.calcular();
        assertEquals("2", viewModel.resultado.get());
        viewModel.valor1.set("2");
        viewModel.valor2.set("1");
        viewModel.operador.set("*");
        viewModel.calcular();
        assertEquals("2", viewModel.resultado.get());
    }

    @Test
    public void testaDivisao(){
        viewModel.valor1.set("1");
        viewModel.valor2.set("2");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals("0", viewModel.resultado.get());
        viewModel.valor1.set("2");
        viewModel.valor2.set("1");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals("2", viewModel.resultado.get());
    }

    //@Test(expected = ArithmeticException.class)
    @Test
    public void testaDivisaoPorZero() {
        viewModel.valor1.set("1");
        viewModel.valor2.set("0");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals("ERRO", viewModel.resultado.get());
    }

    @Test
    public void testaZeroDivididoPor(){
        viewModel.valor1.set("0");
        viewModel.valor2.set("1");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals("0", viewModel.resultado.get());
    }

    @Test
    public void testaErro(){
        viewModel.valor1.set("0");
        viewModel.valor2.set("1");
        viewModel.operador.set("#");
        viewModel.calcular();
        assertEquals("ERRO", viewModel.resultado.get());
    }

    @Test
    public void testaLetras(){
        viewModel.valor1.set("A");
        viewModel.valor2.set("b");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("ERRO", viewModel.resultado.get());
    }

    @Test
    public void testaNumerosGrandes(){
        viewModel.valor1.set("9999999999999999");
        viewModel.valor2.set("9999999999999999");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("ERRO", viewModel.resultado.get());
    }

    @After
    public void tearDown(){
        viewModel = null;
    }
}

