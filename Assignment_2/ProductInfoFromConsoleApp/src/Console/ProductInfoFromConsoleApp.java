/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import Business.Product;
import Business.Supplier;
import Utility.Validator;
import java.util.Scanner;

/**
 *
 * @author vivekdalal
 */
public class ProductInfoFromConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Start
        //High level flow of the code.
        //Take input from user for Creating the Product Object
        //Display the product object just created
        //Ask the user whether he wants to Update the Product object
        //Display the product object just updated
        //End
        try {

            ProductInfoFromConsoleApp productInfoFromConsoleApp = new ProductInfoFromConsoleApp();
            System.out.println("================================================================================================");
            System.out.println("Welcome to the Product Infomartion Application");
            System.out.println("================================================================================================");

            Scanner scannerNext = new Scanner(System.in);

            boolean nextPrdtFlg = true;
            while (nextPrdtFlg) {
                //Calling method to create the product. Have included all the required validations.
                Product product = productInfoFromConsoleApp.collectAndSaveProductInfo();

                //Display the product information on the console
                productInfoFromConsoleApp.displayProduct(product);

                //Updating the product
                product = productInfoFromConsoleApp.updateProduct(product);

                //Display the product information on the console
                productInfoFromConsoleApp.displayProduct(product);

                //Asking user whether he wants to continue or leave
                System.out.println("================================================================================================");
                System.out.print("Do you want to create another product? Input Y to create and anything else to Exit:  ");

                String userOption = scannerNext.nextLine();
                if (userOption.equalsIgnoreCase("Y")) {
                    nextPrdtFlg = true;
                } else {
                    System.out.println("Good Bye!!!! Hope you have a good day!!!");
                    nextPrdtFlg = false;
                }

            }

        } catch (Exception exception) {
            System.out.println("Something went wrong. Please restart the application.");
            exception.printStackTrace();
        }
    }

    public Product collectAndSaveProductInfo() {
        //Collecting the information from the console and validating each field before progressing further

        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        String prodName = "", prodPrice = "", prodAvailNum = "", prodDesc = "", supplierName = "", supplierAddr = "";
        System.out.println("================================================================================================");
        System.out.println("Enter the Product Information");
        //Validate and then set in the product object
        int i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Product Name : ");
            prodName = scanner.nextLine();
        } while (!Validator.isValidString(prodName));

        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Product price : ");
            prodPrice = scanner.nextLine();
        } while (!Validator.isValidDouble(prodPrice));

        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Product Availibity Number : ");
            prodAvailNum = scanner.nextLine();
        } while (!Validator.isValidNum(prodAvailNum));

        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Product Description : ");
            prodDesc = scanner.nextLine();
        } while (!Validator.isValidData(prodDesc));

        System.out.println("==============================");
        System.out.println("Enter the Supplier Information");
        System.out.println("==============================");

        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Supplier Name : ");
            supplierName = scanner.nextLine();
        } while (!Validator.isValidString(supplierName));

        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Supplier Address : ");
            supplierAddr = scanner.nextLine();
        } while (!Validator.isValidData(supplierAddr));

        //User has inputed all valid information
        //We can set this information in the Product Object and return
        Product product = new Product();
        product.setName(prodName);
        product.setPrice(Double.parseDouble(prodPrice));
        product.setAvailNum(Integer.parseInt(prodAvailNum));
        product.setDescription(prodDesc);

        Supplier supplier = new Supplier();
        supplier.setName(supplierName);
        supplier.setAddress(supplierAddr);

        product.setSupplier(supplier);
        System.out.println("Product successfully created.");

        return product;
    }

    public void displayProduct(Product product) {
        //Displaying the product information
        System.out.println("================================================================================================");
        System.out.println("Displaying the product information");
        System.out.println("================================================================================================");
        System.out.println("Product Name : " + product.getName());
        System.out.println("Product price : " + product.getPrice());
        System.out.println("Product Availibility Number : " + product.getAvailNum());
        System.out.println("Product Description : " + product.getDescription());

        //Displaying the supplier information.
        System.out.println("====================");
        System.out.println("Supplier Information");
        System.out.println("====================");
        System.out.println("Supplier Name : " + product.getSupplier().getName());
        System.out.println("Supplier Address : " + product.getSupplier().getAddress());
    }

    public Product updateProduct(Product product) {
        //Allowing the user to update the product
        System.out.println("================================================================================================");
        System.out.println("Update product information");
        System.out.println("================================================================================================");
        System.out.println("If you wish to update a value, please type the new value");
        System.out.println("If you dont wish to update the values, please Press the Enter key and move on to the next value.");

        String prodName = "", prodPrice = "", prodAvailNum = "", prodDesc = "", supplierName = "", supplierAddr = "";

        Scanner scanner = new Scanner(System.in);
        //Validate and then set in the product object
        int i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Product Name : (" + product.getName() + ") : ");
            prodName = scanner.nextLine();

        } while (!prodName.isEmpty() && !Validator.isValidString(prodName));

        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Product price : (" + product.getPrice() + ") : ");
            prodPrice = scanner.nextLine();
        } while (!prodPrice.isEmpty() && !Validator.isValidDouble(prodPrice));

        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Product Availibity Number : (" + product.getAvailNum() + ") : ");
            prodAvailNum = scanner.nextLine();
        } while (!prodAvailNum.isEmpty() && !Validator.isValidNum(prodAvailNum));

        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Product Description : (" + product.getDescription() + ") : ");
            prodDesc = scanner.nextLine();
        } while (!prodDesc.isEmpty() && !Validator.isValidData(prodDesc));

        System.out.println("==============================");
        System.out.println("Enter the Supplier Information");
        System.out.println("==============================");
        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }
            i++;

            System.out.print("Supplier Name : (" + product.getSupplier().getName() + ") : ");
            supplierName = scanner.nextLine();
        } while (!supplierName.isEmpty() && !Validator.isValidString(supplierName));
        i = 0;
        do {

            if (i > 0) {
                System.out.println("Invalid Entry. Please try again.");
            }

            i++;

            System.out.print("Supplier Address : (" + product.getSupplier().getAddress() + ") : ");
            supplierAddr = scanner.nextLine();
        } while (!supplierAddr.isEmpty() && !Validator.isValidData(supplierAddr));

        if (!prodName.isEmpty()) {
            product.setName(prodName);
        }
        if (!prodPrice.isEmpty()) {
            product.setPrice(Double.parseDouble(prodPrice));
        }
        if (!prodAvailNum.isEmpty()) {
            product.setAvailNum(Integer.parseInt(prodAvailNum));
        }
        if (!prodDesc.isEmpty()) {
            product.setDescription(prodDesc);
        }

        if (!supplierName.isEmpty()) {
            product.getSupplier().setName(supplierName);
        }
        if (!supplierAddr.isEmpty()) {
            product.getSupplier().setAddress(supplierAddr);
        }

        System.out.println("Product successfully updated.");

        return product;
    }

}
