package com.example.myapplication.myapplicationkp25.activity2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SecondViewModel extends ViewModel {
    private MutableLiveData<BookModel> state;

    public SecondViewModel() {
        this.state = new MutableLiveData<>(new BookModel());
    }

    public MutableLiveData<BookModel> getState() {
        return state;
    }

    public void setStateValue(BookModel val)
    {
        state.setValue(val);
    }
}
