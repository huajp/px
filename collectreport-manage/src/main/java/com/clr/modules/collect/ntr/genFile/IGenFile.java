package com.clr.modules.collect.ntr.genFile;

import com.clr.modules.collect.ntr.entity.system.FileInfo;

public interface IGenFile<T> {

    IBuildFileInfo genFile(FileInfo fileInfo, T o);

    String getFileType();


}
