import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/driver")
public class DriverController {

    @GetMapping("/getLicense")
    public String getLicenseForm() {
        // Логика обработки GET-запроса для получения лицензии
        return "license_form";
    }

    @PostMapping("/applyLicense")
    public String applyLicense(@RequestBody LicenseInfo licenseInfo) {
        // Логика обработки POST-запроса для подачи заявки на лицензию
        return "application_result";
    }
}