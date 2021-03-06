package com.crazy.dream.controller.restful.common;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import com.crazy.dream.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequestMapping("/file")
@RestController("restful.common.fileController")
public class FileController extends BaseController {
    @Autowired
    private FileService fileService;

    @GetMapping("/read")
    public Result readFileTest() throws IOException {
        return Result.setCode(Constants.RETURN_OK)
                .setData(fileService.readFile());
    }
}
