
package com.cdi.com.CorferiasRuedaNegocios.Comun;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author PEDRO PEDRAZA 
 */
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;
    public String getUploadDir() {
        return uploadDir;
    }
    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }    
}
