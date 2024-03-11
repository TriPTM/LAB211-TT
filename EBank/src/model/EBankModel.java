package model;

import java.util.Random;

public class EBankModel {

    public EBankModel() {
    }

    public boolean checkAccountNumber(String account) {
        String check = "^\\d{10}$";
        if (account.matches(check)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPassword(String pw) {
        int countDigit = 0;
        int countLetter = 0;
        for (int i = 0; i < pw.length(); i++) {
            if (Character.isDigit(pw.charAt(i))) {
                countDigit++;
            } else if (Character.isLetter(pw.charAt(i))) {
                countLetter++;
            }
        }
        if (pw.length() < 8 || pw.length() > 31 || countDigit < 1 || countLetter < 1) {
            return false;
        } else {
            return true;
        }
    }

    public String generateCaptcha() {
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();
        char randomChar = ' ';
        for (int i = 0; i < 6; i++) {
            int type = random.nextInt(3); 
            switch (type) {
                case 0:
                    randomChar = (char) (random.nextInt(26) + 'a');
                    break;
                case 1:
                    randomChar = (char) (random.nextInt(26) + 'A');
                    break;
                case 2:
                    randomChar = (char) (random.nextInt(10) + '0');
                    break;
                default:
                    break;
            }
            captcha.append(randomChar);
        }

        return captcha.toString();
    }

    public boolean checkCaptcha(String generateCaptcha, String captcha) {
        return generateCaptcha.contains(captcha);
    }
}
