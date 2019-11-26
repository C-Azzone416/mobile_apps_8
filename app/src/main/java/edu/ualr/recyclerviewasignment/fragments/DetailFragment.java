package edu.ualr.recyclerviewasignment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

import edu.ualr.recyclerviewasignment.R;

public class DetailFragment extends Fragment {

    private EditText deviceNameET;
    private TextView deviceStatusTV;
    private Spinner deviceTypeSpinner;
    private TextView lastConnectionTV;
    private MaterialButton saveBtn;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.device_detail_fragment, container, false);
    }

    public void saveDeviceData(){
           String deviceName;
           String deviceStatus;
           String lastConnection;
           //spinner?

        deviceName = deviceNameET.getText().toString();
        deviceStatus = deviceStatusTV.getText().toString();
        lastConnection = lastConnectionTV.getText().toString();

        //send to viewmodel
    }

}
