package br.saojudas.sdm21_1.calculadorad3.presenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.saojudas.sdm21_1.calculadorad3.presenter.MainPresenter;
import br.saojudas.sdm21_1.calculadorad3.view.MainView;

import static org.mockito.Mockito.when;
import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestMainPresenter {
    private MainPresenter presenter;

    @Mock
    private MainView view;

    @Before
    public void setUp(){
        presenter = new MainPresenter(view);
    }

    @Test
    public void testSoma(){
        presenter.calcular("2", "3", "+");
        when(view.getResultado()).thenReturn("5");
        assertEquals(view.getResultado(), presenter.getResultado());
    }

    @Test
    public void testMultiplicacao(){
        presenter.calcular("2", "3", "*");
        when(view.getResultado()).thenReturn("6");
        assertEquals(view.getResultado(), presenter.getResultado());
    }

    @Test
    public void testErro(){
        presenter.calcular("2", "3", "P");
        when(view.getResultado()).thenReturn("ERRO");
        assertEquals(view.getResultado(), presenter.getResultado());
    }

}
