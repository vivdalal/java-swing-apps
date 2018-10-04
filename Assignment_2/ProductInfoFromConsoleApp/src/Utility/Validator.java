/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

/**
 *
 * @author vivekdalal
 */
public class Validator {

    //Validation methods for String input type in input on the form.
    public static boolean isValidString(String str) {
        if (null != str && str.length() > 0) {
            //Checking whether the string contains only characters and no numbers
            return str.chars().allMatch(Character::isLetter);
        } else {
            return false;
        }
    }

    //Validation methods for all different types of input on the form.
    public static boolean isValidData(String str) {
        if (null != str && str.length() > 0) {
            //Checking whether the string contains only characters and no numbers
            return true;
        } else {
            return false;
        }
    }

    //Validation methods for Number (int) datatype of input on the form.
    public static boolean isValidNum(String str) {
        if (null != str && str.length() > 0) {
            return str.chars().allMatch(Character::isDigit);

        } else {
            return false;
        }
    }

    //Validation methods for Image File Path
    public static boolean isValidPath(String str) {
        if (null != str && str.length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //Validation methods for all Decimal Numbers(Double) of Input on the form
    public static boolean isValidDouble(String str) {
        if (null != str && str.length() > 0) {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException numberFormatException) {
                //numberFormatException.printStackTrace();
                return false;
            }

        } else {
            return false;
        }
    }
}
