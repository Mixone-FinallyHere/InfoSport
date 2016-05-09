package mixonestudios.computersciencesport;

/**
 * Created by Miguel on 06/05/2016.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment;
        fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);

        return fragment;
    }

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_welcome, container, false);
        final TextView textViewToChange = (TextView) rootView.findViewById(R.id.textView);
        if(textViewToChange != null) {
            textViewToChange.setText(ARG_SECTION_NUMBER + " " + getArguments().get(ARG_SECTION_NUMBER));
        }
        final RelativeLayout theLayout = (RelativeLayout) rootView.findViewById(R.id.relative_layout);
        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 1:
                if (theLayout != null) {
                    theLayout.setBackgroundColor(Color.RED);
                }
                break;
            case 2:
                if (theLayout != null) {
                    theLayout.setBackgroundColor(Color.GREEN);
                }
                break;
            case 3:
                if (theLayout != null) {
                    theLayout.setBackgroundColor(Color.WHITE);
                }
                break;
            default:
                break;
        }


        return rootView;
    }
}