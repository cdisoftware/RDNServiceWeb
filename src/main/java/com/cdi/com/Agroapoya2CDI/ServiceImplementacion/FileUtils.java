
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import java.io.File;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {

    /**
     * archivo @param
     *
     * @param ruta de almacenamiento de archivos
     * @param fileName El nombre del archivo guardado
     * @return
     */
    public static boolean upload(MultipartFile file, String path, String fileName) throws IOException {

        // Determinar el nombre del archivo cargado
        String realPath = path + "\\" + fileName;
        System.out.println("Subir archivo:" + realPath);

        File dest = new File(realPath);

        // Determinar si existe el directorio padre del archivo
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }

        try {
            // guardar documento
            file.transferTo(dest);
            return true;
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }

    }

}

