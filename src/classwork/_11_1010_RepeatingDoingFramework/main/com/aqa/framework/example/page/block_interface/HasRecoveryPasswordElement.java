package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block_interface;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login.RecoveryPasswordElement;

public interface HasRecoveryPasswordElement {
    RecoveryPasswordElement getRecoveryPasswordElement();
    default void showRecoveryPasswordElementSelector(){
        System.out.println(getRecoveryPasswordElement().elementSelector);
    }
}
