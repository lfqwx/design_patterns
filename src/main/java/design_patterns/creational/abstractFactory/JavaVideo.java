package design_patterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/25 9:15
 */
@Slf4j
public class JavaVideo extends Video {

    @Override
    public void produce() {
        log.info("\n生成java视频！");
    }
}
