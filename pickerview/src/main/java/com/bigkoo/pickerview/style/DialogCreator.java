/*
 *  Copyright (C) 2015 Leholady(乐活女人) Inc. All rights reserved.
 */

package com.bigkoo.pickerview.style;

import android.app.Dialog;
import android.content.Context;

/**
 * author: EwenQin
 * since : 2017/6/6 上午10:11.
 */
public interface DialogCreator {

    DialogCreator DEFAULT = new DialogCreator() {
        @Override public Dialog create(Context context, int style) {
            return new Dialog(context, style);
        }
    };

    Dialog create(Context context, int style);
}
