package design_patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/27 21:08
 */
@Slf4j
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("天亮以前说再见--何野");
        for (int i = 0; i < 10; i++) {
            Mail newMail = (Mail) mail.clone();
            newMail.setName("姓名" + i);
            newMail.setEmailAddress("地址" + i);
            newMail.setContent("水花只能开在雨天" + i);
            log.info("\n" + newMail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
