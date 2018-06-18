package com.amaze.file.filesystem.compressed.showcontents.helpers;

import android.content.Context;

import com.amaze.file.adapters.data.CompressedObjectParcelable;
import com.amaze.file.asynchronous.asynctasks.compress.TarHelperTask;
import com.amaze.file.filesystem.compressed.showcontents.Decompressor;
import com.amaze.file.utils.OnAsyncTaskFinished;

import java.util.ArrayList;

/**
 * @author Emmanuel Messulam <emmanuelbendavid@gmail.com>
 *         on 2/12/2017, at 00:36.
 */

public class TarDecompressor extends Decompressor {

    public TarDecompressor(Context context) {
        super(context);
    }

    @Override
    public TarHelperTask changePath(String path, boolean addGoBackItem, OnAsyncTaskFinished<ArrayList<CompressedObjectParcelable>> onFinish) {
        return new TarHelperTask(filePath, path, addGoBackItem, onFinish);
    }

}
