package com.hendraanggrian.socialview;

import android.support.annotation.NonNull;
import android.widget.TextView;

/**
 * TODO: improve TextWatcher logic. https://github.com/HendraAnggrian/socialview/issues/7
 *
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public interface SocialTextWatcher {

    void onTextChanged(@NonNull TextView v, @SocialView.Flag int type, @NonNull CharSequence s);
}