package com.clr.common;

import java.io.File;

public interface ISecurityProcess {
    public void encryptFile(File src, File deFile) throws Exception;

    public File decryptFile(File src, String destDirPath) throws Exception;

}
