package me.armando.spotnik;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment
{

    public MainActivityFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View mainView=inflater.inflate(R.layout.fragment_main, container, false);
        this.initialize(mainView);
        return mainView;
    }

    protected void initialize(View mainView)
    {
        TextView txtLogo=(TextView)mainView.findViewById(R.id.txtLogo);
        txtLogo.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "Reckoner.ttf"));
    }
}