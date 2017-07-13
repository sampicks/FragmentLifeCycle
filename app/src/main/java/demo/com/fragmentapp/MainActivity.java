package demo.com.fragmentapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment newFragment = new BlankFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container, newFragment).commit();
    }

    public void addSecondFragment(){
        Fragment newFragment = new SecondFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container, newFragment).commit();
        ft.addToBackStack(newFragment.getClass().getName());

        /*BlankFragment: ==== onAttach
        BlankFragment: ==== onCreate
        BlankFragment: ==== onCreateView
        BlankFragment: ==== onViewCreated
        BlankFragment: ==== onActivityCreated
        BlankFragment: ==== onStart
        BlankFragment: ==== onResume
                ====== ON CLICK ADD FRAGMENT
        SecondFragment: ==== onAttach
        SecondFragment: ==== onCreate
        SecondFragment: ==== onCreateView
        SecondFragment: ==== onViewCreated
        SecondFragment: ==== onActivityCreated
        SecondFragment: ==== onStart
        SecondFragment: ==== onResume
                ====== ON CLICK BACK
        SecondFragment: ==== onPause
        SecondFragment: ==== onStop
        SecondFragment: ==== onDestroyView
        SecondFragment: ==== onDestroy
        SecondFragment: ==== onDetach
                ====== ON CLICK BACK (CLOSING APP)
        BlankFragment: ==== onPause
        BlankFragment: ==== onStop
        BlankFragment: ==== onDestroyView
        BlankFragment: ==== onDestroy
        BlankFragment: ==== onDetach*/
    }

    public void replaceSecondFragment(){
        Fragment newFragment = new SecondFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, newFragment).commit();
        ft.addToBackStack(newFragment.getClass().getName());

        /*BlankFragment: ==== onAttach
        BlankFragment: ==== onCreate
        BlankFragment: ==== onCreateView
        BlankFragment: ==== onViewCreated
        BlankFragment: ==== onActivityCreated
        BlankFragment: ==== onStart
        BlankFragment: ==== onResume
                ====== ON CLICK REPLACE FRAGMENT
        SecondFragment: ==== onAttach
        SecondFragment: ==== onCreate
        BlankFragment: ==== onPause
        BlankFragment: ==== onStop
        BlankFragment: ==== onDestroyView
        SecondFragment: ==== onCreateView
        SecondFragment: ==== onViewCreated
        SecondFragment: ==== onActivityCreated
        SecondFragment: ==== onStart
        SecondFragment: ==== onResume
                ====== ON CLICK BACK
        SecondFragment: ==== onPause
        SecondFragment: ==== onStop
        SecondFragment: ==== onDestroyView
        SecondFragment: ==== onDestroy
        SecondFragment: ==== onDetach
        BlankFragment: ==== onCreateView
        BlankFragment: ==== onViewCreated
        BlankFragment: ==== onActivityCreated
        BlankFragment: ==== onStart
        BlankFragment: ==== onResume
                ====== ON CLICK BACK (CLOSING APP)
        BlankFragment: ==== onPause
        BlankFragment: ==== onStop
        BlankFragment: ==== onDestroyView
        BlankFragment: ==== onDestroy
        BlankFragment: ==== onDetach*/
    }
}
