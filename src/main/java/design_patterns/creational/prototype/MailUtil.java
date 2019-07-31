package design_patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;

/**
 * @author L.F.Q
 * @date 2019/6/27 20:53
 */
@Slf4j
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学，邮件地址：{1},邮件内容:{2},发送邮件成功！";
        log.info(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }
    public static void saveOriginMailRecord(Mail mail){
        log.info("\n存储原始邮件"+mail.getName()+","+mail.getEmailAddress()+","
        +mail.getContent());
    }
}
