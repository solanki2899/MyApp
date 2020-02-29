package com.example.osoc.ui.events;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.osoc.R;

public class EventsFragment extends Fragment {

    private EventsViewModel eventsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        eventsViewModel =
                ViewModelProviders.of(this).get(EventsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_events, container, false);
        final TextView textView = root.findViewById(R.id.head_events);
        final TextView technofania = root.findViewById(R.id.technofania);
        final TextView technofanidesc = root.findViewById(R.id.technofaniadesc);
        final TextView workshop = root.findViewById(R.id.workshop);
        final TextView workshopdesc = root.findViewById(R.id.workshopdesc);
        final TextView projects = root.findViewById(R.id.projects);
        final TextView projectsdesc = root.findViewById(R.id.projectsdesc);
        eventsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                technofania.setText(Html.fromHtml(getString(R.string.technofania)));
                technofanidesc.setText(Html.fromHtml(getString(R.string.technofaniadesc)));
                workshop.setText(Html.fromHtml(getString(R.string.workshop)));
                workshopdesc.setText(Html.fromHtml(getString(R.string.workshopdesc)));
                projects.setText(Html.fromHtml(getString(R.string.projects)));
                projectsdesc.setText(Html.fromHtml(getString(R.string.projectsdesc)));
            }
        });
        return root;
    }
}