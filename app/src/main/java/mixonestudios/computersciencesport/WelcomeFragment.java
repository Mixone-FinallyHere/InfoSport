package mixonestudios.computersciencesport;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Miguel on 07/05/2016.
 */
public class WelcomeFragment  extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    private static final String ARG_SECTION = "Welcome";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static WelcomeFragment newInstance() {
        WelcomeFragment fragment;
        fragment = new WelcomeFragment();
        /*
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION, 2);
        fragment.setArguments(args);
        */

        return fragment;
    }

    public WelcomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_welcome, container, false);
        return rootView;
    }
}
