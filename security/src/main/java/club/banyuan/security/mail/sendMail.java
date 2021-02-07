package club.banyuan.security.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/21 2:21 下午
 */
@Controller
@Configuration
public class sendMail {
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private static String fromEmail;

    @GetMapping("/sendmail")
    public String sendmail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        System.out.println(fromEmail);
        simpleMailMessage.setFrom("1621101768@qq.com");
        simpleMailMessage.setTo("b16012335@njupt.edu.cn");
        simpleMailMessage.setSubject("java发邮件");
        simpleMailMessage.setText("java test");
        javaMailSender.send(simpleMailMessage);
        return "";
    }

}
