import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void searchVKTest() {
        open("https://www.google.com/");
        $("input[name='q']")
                .shouldBe(visible)
                .setValue("vk")
                .pressEnter();
        $("#search a[href='https://vk.com/'] span")
                .shouldBe(visible)
                .shouldHave(text("ВКонтакте: Добро пожаловать"));
    }
}
