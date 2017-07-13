package demo.com.fragmentapp;


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
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("SecondFragment","==== onAttach");
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.e("SecondFragment","==== onAttachFragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("SecondFragment","==== onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("SecondFragment","==== onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("SecondFragment","==== onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("SecondFragment","==== onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("SecondFragment","==== onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("SecondFragment","==== onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("SecondFragment","==== onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("SecondFragment","==== onDetach");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("SecondFragment","==== onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("SecondFragment","==== onActivityCreated");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("SecondFragment","==== onViewCreated");
   
    }
}
