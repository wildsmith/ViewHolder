package com.wildsmith.viewholder.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.wildsmith.viewholder.R;

public class ExampleFragment extends Fragment {

    public static final String TAG = ExampleFragment.class.getSimpleName();

    public static ExampleFragment newInstance() {
        return new ExampleFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return ExampleViewWrapper.onCreateView(inflater.inflate(R.layout.example_layout, container, false));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setupProgressBar();
    }

    private void setupProgressBar() {
        ProgressBar progressBar = ExampleViewWrapper.findViewById(R.id.example_progress_bar);
        if (progressBar != null) {
            progressBar.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onDestroyView() {
        ExampleViewWrapper.onDestroyView();

        super.onDestroyView();
    }
}