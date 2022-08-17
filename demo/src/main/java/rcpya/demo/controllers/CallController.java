package rcpya.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rcpya.demo.models.Call;
import rcpya.demo.services.CallServices;

import java.util.List;


@RestController
public class CallController {

    @Autowired
    private CallServices CallSVC;

    @GetMapping("/admin")
    public String getCall(Model model){
        try {
            List<Call> Calls = this.CallSVC.findAll();
            model.addAttribute("Calls", Calls);
            return "views/Calls";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error: "+e.getMessage();
        }
    }

    @RequestMapping("/Calls")
    public List<Call> Calls(){
        List<Call> all = null;
        try {
            all = this.CallSVC.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
}
