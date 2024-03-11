
package controller;

import java.util.Locale;
import java.util.ResourceBundle;
import model.EBankModel;
import view.EBankView;
import view.Menu;

public class EBankController extends Menu{
    private EBankModel model;
    private EBankView view;
    private ResourceBundle labels;
    private static String[] mc={"Vietnamese","English","Exit"};

    public EBankController(EBankModel model, EBankView view) {
        super("Login Program",mc);
        this.model = model;
        this.view = view;
    }
    
    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: vietnameseLogin();System.err.flush();;break;
            case 2: englishLogin();System.err.flush();break;
            case 3: System.exit(0);
        }
    }
    
    public void vietnameseLogin(){
        Locale.setDefault(new Locale("vi", "VN"));
        labels = ResourceBundle.getBundle("library.MessageBundleVN");
        login();
    }
    
    public void englishLogin(){
        labels = ResourceBundle.getBundle("library.MessageBundleEN",Locale.US);
        login();
    }
    
    public void login(){
        String account,pw,generateCaptcha,captcha;
        while(true){
            account = view.getString(labels.getString("enterAccountNumber"));
            if(model.checkAccountNumber(account)){
                break;
            }else {
                view.displayRedMessage(labels.getString("errCheckInputAccount"));
                System.err.flush();
            }
        }
        while(true){
            pw = view.getString(labels.getString("enterPassword"));
            if(model.checkPassword(pw)){
                break;
            }else {
                view.displayRedMessage(labels.getString("errCheckInputPassword"));
                System.err.flush();
            }
        }
        generateCaptcha = model.generateCaptcha();
        view.displayMessage(labels.getString("printCaptcha") + " " + generateCaptcha);
        while(true){
            captcha = view.getString(labels.getString("enterCaptcha"));
            if(model.checkCaptcha(generateCaptcha, captcha)){
                break;
            }else{
                view.displayRedMessage(labels.getString("errCaptchaIncorrect"));
                System.err.flush();
            }
        }
        
        view.displayMessage(labels.getString("loginSuccess"));
    }
    
}
