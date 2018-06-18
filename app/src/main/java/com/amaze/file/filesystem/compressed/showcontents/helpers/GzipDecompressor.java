package com.amaze.file.filesystem.compressed.showcontents.helpers;

import android.content.Context;

import com.amaze.file.adapters.data.CompressedObjectParcelable;
import com.amaze.file.asynchronous.asynctasks.compress.CompressedHelperTask;
import com.amaze.file.asynchronous.asynctasks.compress.GzipHelperTask;
import com.amaze.file.asynchronous.asynctasks.compress.TarHelperTask;
import com.amaze.file.filesystem.compressed.showcontents.Decompressor;
import com.amaze.file.utils.OnAsyncTaskFinished;

import java.util.ArrayList;

public class GzipDecompressor extends Decompressor {

    public GzipDecompressor(Context context) {
        super(context);
    }

    @Override
    public CompressedHelperTask changePath(String path, boolean addGoBackItem,
                                           OnAsyncTaskFinished<ArrayList<CompressedObjectParcelable>> onFinish) {
        return new GzipHelperTask(filePath, path, addGoBackItem, onFinish);
    }

}
