package com.clr.modules.collect.ntr.genFile;

import com.clr.modules.collect.ntr.entity.dcacct.record.DcacctDocument;
import com.clr.modules.collect.ntr.entity.system.FileInfo;

public class Gen2DNormalDcacctInfoFileFactory implements IGenFile<DcacctDocument> {
    @Override
    public IBuildFileInfo genFile(FileInfo fileInfo, DcacctDocument dcacctDocument) {
        return new Build2DNormalDcacctInfoFileInfo(fileInfo);
    }

    @Override
    public String getFileType() {
        return null;
    }
}
