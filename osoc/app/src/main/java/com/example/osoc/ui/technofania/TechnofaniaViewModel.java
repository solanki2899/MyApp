package com.example.osoc.ui.technofania;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TechnofaniaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TechnofaniaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Technofania'20 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}