package Servlet;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.UUID;

@WebServlet(name = "ImportGradeServlet", value = "/ImportGradeServlet")
@MultipartConfig
public class ImportGradeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(ServletFileUpload.isMultipartContent(request));
        Part part = request.getPart("upload");
        InputStream is = part.getInputStream();
        UUID uuid = UUID.randomUUID();
        File file = new File("./"+uuid+".txt");
        OutputStream os = new FileOutputStream(file);
        byte[] byteArray = new byte[1024];
        int count = -1;
        while ((count = is.read(byteArray)) != -1){
            os.write(byteArray,0, count);
        }
        System.out.println(file.getAbsolutePath());
        System.out.println("Success");
    }
}
