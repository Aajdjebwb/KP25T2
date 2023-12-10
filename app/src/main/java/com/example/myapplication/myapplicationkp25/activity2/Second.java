package com.example.myapplication.myapplicationkp25.activity2;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.myapplicationkp25.R;
import com.example.myapplication.myapplicationkp25.activity1.FirstViewModel;
import com.example.myapplication.myapplicationkp25.databinding.ActivityFirstBinding;
import com.example.myapplication.myapplicationkp25.databinding.ActivitySecondBinding;
import com.example.myapplication.myapplicationkp25.model.Book;

import com.example.myapplication.myapplicationkp25.R;
import com.example.myapplication.myapplicationkp25.databinding.ActivitySecondBinding;
import com.example.myapplication.myapplicationkp25.model.Book;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SecondViewModel viewModel = new ViewModelProvider(this).get(SecondViewModel.class);
        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);


        Intent intent = getIntent();
        Book book = (Book) intent.getSerializableExtra("key");
        BookModel bookmod = new BookModel(book.getName(), book.getAutor(), String.valueOf(book.getYear()));
        viewModel.setStateValue(bookmod);
    }
}