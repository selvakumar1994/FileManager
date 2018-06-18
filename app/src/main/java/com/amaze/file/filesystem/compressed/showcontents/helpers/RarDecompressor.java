package com.amaze.file.filesystem.compressed.showcontents.helpers;

import android.content.Context;

import com.amaze.file.asynchronous.asynctasks.compress.RarHelperTask;
import com.amaze.file.adapters.data.CompressedObjectParcelable;
import com.amaze.file.filesystem.compressed.CompressedHelper;
import com.amaze.file.filesystem.compressed.showcontents.Decompressor;
import com.amaze.file.utils.OnAsyncTaskFinished;
import com.github.junrar.rarfile.FileHeader;

import java.util.ArrayList;

import static com.amaze.file.filesystem.compressed.CompressedHelper.SEPARATOR;

/**
 * @author Emmanuel
 *         on 20/11/2017, at 17:23.
 */

public class RarDecompressor extends Decompressor {

    public RarDecompressor(Context context) {
        super(context);
    }

    @Override
    public RarHelperTask changePath(String path, boolean addGoBackItem,
                                       OnAsyncTaskFinished<ArrayList<CompressedObjectParcelable>> onFinish) {
        return new RarHelperTask(filePath, path, addGoBackItem, onFinish);
    }

    public static String convertName(FileHeader file) {
        String name = file.getFileNameString().replace('\\', '/');

        if(file.isDirectory()) return name + SEPARATOR;
        else return name;
    }

    @Override
    protected String realRelativeDirectory(String dir) {
        if(dir.endsWith(SEPARATOR)) dir = dir.substring(0, dir.length()-1);
        return dir.replace(SEPARATOR.toCharArray()[0], '\\');
    }

}
