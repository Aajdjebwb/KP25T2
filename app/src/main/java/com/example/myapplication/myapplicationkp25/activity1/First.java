package com.example.myapplication.myapplicationkp25.activity1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.myapplicationkp25.activity2.Second;
import com.example.myapplication.myapplicationkp25.databinding.ActivityFirstBinding;
import com.example.myapplication.myapplicationkp25.databinding.ActivitySecondBindingImpl;
import com.example.myapplication.myapplicationkp25.databinding.ActivityFirstBindingImpl;
import com.example.myapplication.myapplicationkp25.model.Book;

public class First extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirstViewModel viewModel = new ViewModelProvider(this).get(FirstViewModel.class);
        ActivityFirstBinding binding = ActivityFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        viewModel.getState().observe(this,deviceModel -> {
            if (deviceModel.isNeedToShowMessage())
            {
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_LONG).show();
                viewModel.cleanNeedToShowMessage();
            }
            if (deviceModel.isNeedToStartActivity()){
                Book tmp=new Book(deviceModel.getName(),deviceModel.getAutor(),Integer.parseInt(deviceModel.getYear()));

                Intent startActivityIntent=new Intent(this, Second.class);
                startActivityIntent.putExtra("key", tmp);
                startActivity(startActivityIntent);
            }
        });

    }
}