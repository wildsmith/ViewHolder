package com.wildsmith.viewholder;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

class ViewHolder {

    private View root;

    private Map<Integer, View> viewMap = new HashMap<>();

    public ViewHolder(@NonNull View root) {
        this.root = root;
    }

    private void add(@NonNull View root, @IdRes int id) {
        viewMap.put(id, root.findViewById(id));
    }

    @Nullable
    @SuppressWarnings("unchecked")
    protected <T extends View> T enhancedFindViewById(@IdRes int id) {
        if (!viewMap.containsKey(id)) {
            add(root, id);
        }

        return (T) viewMap.get(id);
    }
}