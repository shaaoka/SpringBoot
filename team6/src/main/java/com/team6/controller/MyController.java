package com.team6.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/ajax-example")
    public String ajaxExamplePage() {
        return "index"; // This will return the name of the HTML template
    }
    
    @GetMapping("/")
	private	String Hello() {
		return "hello";
	}

    // Example AJAX endpoint
    @GetMapping("/api/data")
    @ResponseBody
    public String getExampleData() {
        return "Hello from the server!";
    }

        @PostMapping("/api/submit-data")
        public ResponseEntity<?> submitData(@RequestBody FormData formData) {
            // 处理接收到的数据
            String name = formData.getName();
            String email = formData.getEmail();

            // 执行后端逻辑，例如保存数据到数据库等
            // 这里假设简单地返回一个成功消息
            String message = "Data submitted successfully! Name: " + name + ", Email: " + email;

            return ResponseEntity.ok(new ResponseMessage(message));
        }

        // 内部类用于接收前端发送的JSON数据
        static class FormData {
            private String name;
            private String email;

            // 必须提供默认构造函数和相应的getter/setter方法
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }

        static class ResponseMessage {
            private String message;

            public ResponseMessage(String message) {
                this.message = message;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }
        }
    }
