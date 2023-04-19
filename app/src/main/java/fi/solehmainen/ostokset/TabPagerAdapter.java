package fi.solehmainen.ostokset;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import fi.solehmainen.ostokset.fragments.buyFragment;
import fi.solehmainen.ostokset.fragments.listFragment;

public class TabPagerAdapter extends FragmentStateAdapter {

    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new buyFragment();
        } else if (position == 1) {
            return new listFragment();
        } else {
            return new listFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
