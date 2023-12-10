package com.example.myapplication.myapplicationkp25.activity1;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;



public class FirstViewModel extends ViewModel {
    private MutableLiveData<BookModel> state;

    public FirstViewModel() {
        this.state = new MutableLiveData<>(new BookModel());
    }

    public MutableLiveData<BookModel> getState() {
        return state;
    }

    public void setState(MutableLiveData<BookModel> state) {
        this.state = state;
    }

    public void cleanNeedToShowMessage(){
        BookModel tmp = state.getValue();

        tmp.setNeedToShowMessage(false);
        state.setValue(tmp);
    }
    public void OnButtonClick(View i)
    {
        BookModel tmp = state.getValue();
        if (tmp.getName().isEmpty() || tmp.getAutor().isEmpty() || tmp.getYear().isEmpty())
        {
            tmp.setNeedToShowMessage(true);

        }
        else {
            tmp.setNeedToStartActivity(true);
        }
        state.setValue(tmp);

    }
}

