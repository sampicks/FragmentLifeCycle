package demo.com.fragmentapp;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("BlankFragment","==== onAttach");
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.e("BlankFragment","==== onAttachFragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("BlankFragment","==== onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("BlankFragment","==== onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("BlankFragment","==== onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("BlankFragment","==== onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("BlankFragment","==== onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("BlankFragment","==== onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("BlankFragment","==== onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("BlankFragment","==== onDetach");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("BlankFragment","==== onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("BlankFragment","==== onActivityCreated");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("BlankFragment","==== onViewCreated");
        // add fragment
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).addSecondFragment();
            }
        });

        // replace fragment
        view.findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceSecondFragment();
            }
        });
    }
}
