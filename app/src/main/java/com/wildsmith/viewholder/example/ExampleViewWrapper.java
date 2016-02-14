package com.wildsmith.viewholder.example;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.wildsmith.viewholder.ViewHolderWrapper;

class ExampleViewWrapper extends ViewHolderWrapper {

    private static final Class<?> CLAZZ = ExampleViewWrapper.class;

    private ExampleViewWrapper() {
        //Singleton pattern
    }

    public static View onCreateView(@NonNull View root) {
        return onCreateView(CLAZZ, root);
    }

    public static void onDestroyView() {
        onDestroyView(CLAZZ);
    }

    @Nullable
    public static <T extends View> T findViewById(@IdRes int id) {
        return findViewById(CLAZZ, id);
    }
}