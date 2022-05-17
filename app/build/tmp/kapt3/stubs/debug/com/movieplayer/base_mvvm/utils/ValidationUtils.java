package com.movieplayer.base_mvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/ValidationUtils;", "", "()V", "isValidEmail", "", "email", "", "isValidPassword", "password", "app_debug"})
public final class ValidationUtils {
    public static final com.movieplayer.base_mvvm.utils.ValidationUtils INSTANCE = null;
    
    /**
     * * Checks if the email is valid.
     *     * @param data - can be EditText or String
     *     * @param updateUI - if true and if data is EditText, the function sets error to the EditText or its TextInputLayout
     *     * @return - true if the email is valid.
     */
    public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    /**
     * * Checks if the password is valid as per the following password policy.
     *     * Password should be minimum minimum 8 characters long.
     *     * Password should contain at least one number.
     *     * Password should contain at least one capital letter.
     *     * Password should contain at least one small letter.
     *     * Password should contain at least one special character.
     *     * Allowed special characters: "~!@#$%^&*()-_=+|/,."';:{}[]<>?"
     *     *
     *     * @param data - can be EditText or String
     *     * @param updateUI - if true and if data is EditText, the function sets error to the EditText or its TextInputLayout
     *     * @return - true if the password is valid as per the password policy.
     */
    public final boolean isValidPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    private ValidationUtils() {
        super();
    }
}