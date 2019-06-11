package com.clr.modules.collect.ntr.genFile;

import com.clr.common.document.JaxbUtil;
import com.clr.modules.collect.ntr.build.BuildFileInfo;
import com.clr.modules.collect.ntr.entity.identify.record.IdentifyDocument;
import com.clr.modules.collect.ntr.entity.system.FileInfo;

public class Build2DNormalBaseInfoFileInfo implements IBuildFileInfo {
    private FileInfo fileInfo;

    private IdentifyDocument identifyDocument;

    public Build2DNormalBaseInfoFileInfo(FileInfo fileInfo,IdentifyDocument identifyDocument){
        this.fileInfo = fileInfo;
        this.identifyDocument = identifyDocument;
    }

    @Override
    public String buildFileName() {
        String fileName = BuildFileInfo.getFileName(fileInfo);
        return fileName;
    }

    @Override
    public String buildFileHead() {
        String fileHead = BuildFileInfo.getFileHead(fileInfo);
        return fileHead;
    }

    @Override
    public String buildFileBody() {
        String s = JaxbUtil.convertToXml(identifyDocument);
        return s;
    }
}
