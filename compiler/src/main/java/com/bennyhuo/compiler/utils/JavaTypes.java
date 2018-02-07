package com.bennyhuo.compiler.utils;

import com.squareup.javapoet.ClassName;

/**
 * Created by benny on 2/2/18.
 */

public class JavaTypes {
    public static final ClassName INTENT = ClassName.get("android.content", "Intent");
    public static final ClassName BUNDLE = ClassName.get("android.os", "Bundle");
    public static final ClassName ACTIVITY = ClassName.get("android.app", "Activity");

    public static final ClassName SUPPORT_FRAGMENT = ClassName.get("android.support.v4.app", "Fragment");
    public static final ClassName SUPPORT_ACTIVITY = ClassName.get("android.support.v4.app", "FragmentActivity");

    public static final ClassName ON_ACTIVITY_RESULT_LISTENER = ClassName.get("com.bennyhuo.activitybuilder.runtime.core", "OnActivityResultListener");

    public static final ClassName RUNTIME_UTILS = ClassName.get("com.bennyhuo.activitybuilder.runtime.utils", "Utils");

    public static final ClassName ACTIVITY_BUILDER = ClassName.get("com.bennyhuo.activitybuilder.runtime.core", "ActivityBuilder");
    public static final ClassName FRAGMENT_BUILDER = ClassName.get("com.bennyhuo.activitybuilder.runtime.core", "FragmentBuilder");
    public static final ClassName ON_ACTIVITY_CREATE_LISTENER = ClassName.get("com.bennyhuo.activitybuilder.runtime.core", "OnActivityCreateListener");
    public static final ClassName ON_FRAGMENT_CREATE_LISTENER = ClassName.get("com.bennyhuo.activitybuilder.runtime.core", "OnFragmentCreateListener");

}
