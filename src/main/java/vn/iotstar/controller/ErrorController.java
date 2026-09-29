package vn.iotstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @RequestMapping
    public String handleError(Model model) {
        model.addAttribute("message", "Đã xảy ra lỗi hệ thống hoặc bạn không có quyền truy cập.");
        return "error";
    }
}