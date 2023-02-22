/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */

 public class Status {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (0, 1, 2, or 3):");
        int code = in.nextInt();

        StatusUser t = new StatusUser();
        t.statusDetail(StatusEnum.fromCode(code));
    }
}

enum StatusEnum {
    REJECTED(0),
    PENDING(1),
    PROCESSING(2),
    APPROVED(3);

    private final int code;

    StatusEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static StatusEnum fromCode(int code) {
        for (StatusEnum s : values()) {
            if (s.getCode() == code) {
                return s;
            }
        }
        throw new IllegalArgumentException("Invalid status code");
    }
}