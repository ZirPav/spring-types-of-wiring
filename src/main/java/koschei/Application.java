package koschei;

import koschei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
//"На свете есть океан , на океане остров , на острове дерево , на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :("
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}
