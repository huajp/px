package com.clr.modules.collect.ntr.genFile;

import com.clr.modules.collect.ntr.entity.system.FileInfo;


public class Build2DNormalDcacctInfoFileInfo implements IBuildFileInfo {
    private FileInfo fileInfo;

    public Build2DNormalDcacctInfoFileInfo(FileInfo fileInfo){
        this.fileInfo = fileInfo;
    }

    @Override
    public String buildFileName() {
        return null;
    }

    @Override
    public String buildFileHead() {
        return null;
    }

    @Override
    public String buildFileBody() {
        return null;
    }
}
