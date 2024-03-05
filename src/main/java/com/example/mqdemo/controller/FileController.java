package com.example.mqdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileController {

    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/upload")
    public boolean up(MultipartFile file,HttpServletRequest request) throws IOException {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());

        saveFile(file);
        return true;
    }

    public void saveFile(MultipartFile photo) throws IOException {
        File dir = new File("/root/media/");
        if(!dir.exists()){
            dir.mkdir();
        }
        File file=new File("/root/media/film.mp4");
        photo.transferTo(file);

    }
}
