package com.wildsmith.viewholder;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

public abstract class ViewHolderWrapper {

    protected static Map<Class, ViewHolder> instances = new HashMap<>();

    public static View onCreateView(@NonNull Class<?> clazz, @NonNull View root) {
        instances.put(clazz, new ViewHolder(root));
        return root;
    }

    public static void onDestroyView(@NonNull Class<?> clazz) {
        instances.remove(clazz);
    }

    @Nullable
    public static <T extends View> T findViewById(@NonNull Class<?> clazz, @IdRes int id) {
        return instances.get(clazz).enhancedFindViewById(id);
    }
}