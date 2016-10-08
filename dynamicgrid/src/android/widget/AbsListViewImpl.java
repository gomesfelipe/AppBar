package android.widget;

import android.content.Context;

/**
 * Created by Vagner on 19/09/2016.
 */
public class AbsListViewImpl extends AbsListView {
    public AbsListViewImpl(Context context) {
        super(context);
    }

    @Override
    public ListAdapter getAdapter() {
        return null;
    }

    @Override
    public void setSelection(int position) {

    }
}
