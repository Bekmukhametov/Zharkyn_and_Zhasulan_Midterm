import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/driver")
public class DriverRestController {

    @GetMapping("/getLicenseInfo")
    public LicenseInfo getLicenseInfo() {
        // Логика для предоставления информации о лицензии в формате JSON
        LicenseInfo licenseInfo = new LicenseInfo();
        // Заполните объект LicenseInfo данными
        return licenseInfo;
    }

    @PostMapping("/applyLicense")
    public String applyLicense(@RequestBody LicenseApplication application) {
        // Логика обработки POST-запроса для подачи заявки на лицензию через REST API
        return "Application submitted successfully";
    }
}
