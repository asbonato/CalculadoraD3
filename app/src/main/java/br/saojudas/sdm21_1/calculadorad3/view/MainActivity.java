package br.saojudas.sdm21_1.calculadorad3.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import br.saojudas.sdm21_1.calculadorad3.R;
import br.saojudas.sdm21_1.calculadorad3.databinding.ActivityMainBinding;
import br.saojudas.sdm21_1.calculadorad3.viewmodel.MainViewModel;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
    MainViewModel viewModel = new MainViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);
        viewModel.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        viewModel.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        viewModel.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        viewModel.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }
}