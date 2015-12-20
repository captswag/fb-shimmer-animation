package anjithsasindran.fb_shimmer.fragment;

import android.animation.ValueAnimator;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.shimmer.ShimmerFrameLayout;

import anjithsasindran.fb_shimmer.R;

/**
 * Created by Anjith Sasindran
 * on 20-Dec-15.
 */
public class ViewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);

        ShimmerFrameLayout shimmerContainer = (ShimmerFrameLayout) view.findViewById(R.id.shimmerLayout);
        shimmerContainer.setDuration(getResources().getInteger(R.integer.animation_duration));
        shimmerContainer.setRepeatDelay(getResources().getInteger(R.integer.repeat_delay));
        shimmerContainer.setRepeatMode(ValueAnimator.REVERSE);
        shimmerContainer.startShimmerAnimation();

        return view;
    }
}