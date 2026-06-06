import java.io.File;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

public class QRcodegen{
    public static void main(String args[]){
        String text="https://www.google.com";
        int width=300;
        int heigt=300;
        String filePath="qrcode.png";
        try{
            QRCodeWriter qrcodeWriter=new QRCodeWriter();
            BitMatrix bitmatrix=qrcodeWriter.encode(
                text,
                BarcodeFormat.QR_CODE,
                width,
                heigt
            );
            Path path=new File(filePath).toPath();
            MatrixToImageWriter.writeToPath(
                bitmatrix,
                "PNG",
                path
            );
             System.out.println("QR Code generated successfully!");
            System.out.println("Saved as: " + filePath);
            
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
