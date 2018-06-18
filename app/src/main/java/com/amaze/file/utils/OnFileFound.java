package com.amaze.file.utils;

import com.amaze.file.filesystem.HybridFileParcelable;

/**
 * This allows the caller of a function to know when a file has ben found and deal with it ASAP
 *
 * @author Emmanuel
 *         on 21/9/2017, at 15:23.
 */

public interface OnFileFound {
    void onFileFound(HybridFileParcelable file);
}
