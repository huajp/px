package com.clr.modules.collect.ntr.genFile;

import com.clr.modules.collect.ntr.entity.identify.record.IdentifyDocument;
import com.clr.modules.collect.ntr.entity.system.FileInfo;

public class Gen2DNormalBaseInfoFileFactory implements IGenFile<IdentifyDocument>{
    @Override
    public IBuildFileInfo genFile(FileInfo fileInfo, IdentifyDocument identifyDocument) {
        return new Build2DNormalBaseInfoFileInfo(fileInfo,identifyDocument);
    }

    @Override
    public String getFileType() {
        return "110";
    }
}
