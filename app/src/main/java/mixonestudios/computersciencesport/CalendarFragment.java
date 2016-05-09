package mixonestudios.computersciencesport;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Miguel on 07/05/2016.
 */
public class CalendarFragment  extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    private static final String ARG_SECTION = "Calendar";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static CalendarFragment newInstance() {
        CalendarFragment fragment;
        fragment = new CalendarFragment();
        /*
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION, 2);
        fragment.setArguments(args);
        */

        return fragment;
    }

    public CalendarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calendar, container, false);
        return rootView;
    }
}