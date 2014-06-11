package com.e.saito.amida.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.Spinner;

/**
 * Created by e.saito on 2014/06/11.
 */
public class SettingFragment extends Fragment implements NumberPicker.OnValueChangeListener {
    public static interface SettingEventListener{


    }

    private NumberPicker mPicker;
    private LinearLayout mInputLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);
        this.mInputLayout = (LinearLayout)rootView.findViewById(R.id.container_result_input);
        this.mPicker = (NumberPicker)rootView.findViewById(R.id.numPicker);
        mPicker.setOnValueChangedListener(this);

        return rootView;
    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

    }
}
